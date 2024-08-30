package com.dsa.web5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.dsa.web5.dto.BoardDTO;
import com.dsa.web5.dto.ReplyDTO;
import com.dsa.web5.security.AuthenticatedUser;
import com.dsa.web5.service.BoardService;

import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("board")
public class BoardController {

	private final BoardService boardService;
	
	@Value("${board.pageSize}")
	int pageSize;		// 페이지당 글 수
	
	@Value("${board.linkSize}")
	int linkSize;		//페이지 이동 링크 수, 페이지 번호 링크의 개수
	
	// application.properties 파일의 게시판 관련 설정값
	@Value("${board.uploadPath}")
	String uploadPath;	// 첨부파일 저장 경로
	
	/**
	 * 글 쓰기 폼으로 이동
	 * @return writeForm.html
	 */
	@GetMapping("write")
	public String write() {
		return "board/writeForm";
	}
	
	/**
	 * 글 저장
	 * @param boardDTO 작성한 글 정보
	 * @param user 로그인한 사용자 정보
	 * @param MultipartFile 첨부파일
	 * @return listAll.html
	 */
	@PostMapping("write")
	public String write(
			@ModelAttribute BoardDTO boardDTO
			, @RequestParam(name = "upload", required = false)
				MultipartFile upload
			, @AuthenticationPrincipal AuthenticatedUser user) {
		
		boardDTO.setMemberId(user.getUsername());
		log.debug("저장할 첨부파일 정보: {}", upload.getOriginalFilename());
		log.debug("저장할 글 정보: {}", boardDTO);
		
		try {
			boardService.write(boardDTO, uploadPath, upload);
			return "redirect:/board/listAll";
		} catch (Exception e) {
			e.printStackTrace();
			return "board/writeForm";
		}
		
	}
	
	/**
	 * 게시판 전체 글 목록. 페이징O
	 * @param model
	 * @param page			현재 페이지(default: 1)
	 * @param searchType	검색 대상(default: "")
	 * @param searchWord	검색어(default: "")
	 * @return list.html
	 */
	@GetMapping("list")
	public String list(
			Model model
			, @RequestParam(name="page", defaultValue="1") int page
			, @RequestParam(name="searchType", defaultValue="") 
				String searchType
			, @RequestParam(name="searchWord", defaultValue="")
				String searchWord) {
		
		log.debug("properties값 : pageSize={}, linkSize={}, uploadPath={}"
				, pageSize, linkSize, uploadPath);
		log.debug("요청 파라미터 : page={}, searchType={}, searchWord={}"
				, page, searchType, searchWord);
		
		// Page, Pageable : Spring Data JPA에서 페이징과 관련된 작업을
		// 					간편하게 처리하기 위한 클래스 및 인터페이스
		// 현재페이지, 페이지당 글수, 검색대상, 검색어
		Page<BoardDTO> boardPage = boardService.getList(
				page, pageSize, searchType, searchWord);
		
		log.debug("목록 정보 getContent(): {}", boardPage.getContent());
		log.debug("현재페이지 getNumber(): {}", boardPage.getNumber());
		log.debug("전체 개수 getTotalElements(): {}"
				, boardPage.getTotalElements());
		log.debug("전체 페이지수 getTotalPages(): {}"
				, boardPage.getTotalPages());
		log.debug("한페이지당 글 수 getSize(): {}", boardPage.getSize());
		log.debug("이전페이지 존재 여부 hasPrevious(): {}"
				, boardPage.hasPrevious());
		log.debug("다음페이지 존재 여부 hasNext(): {}"
				, boardPage.hasNext());
		
		model.addAttribute("boardPage", boardPage);	//출력할 글정보
		model.addAttribute("page", page);			//현재 페이지
		model.addAttribute("linkSize", linkSize);	//페이지이동 링크 수
		model.addAttribute("searchType", searchType);	//검색 기준
		model.addAttribute("searchWord", searchWord);	//검색어
		
		return "board/list";
	}
	
	/**
	 * 게시판 전체 글 목록. 페이징X
	 * @param Model
	 * @return listAll.html
	 */
	@GetMapping("listAll")
	public String listAll(Model model) {
		List<BoardDTO> boardList = boardService.getListAll();
		model.addAttribute("boardList", boardList);
		return "board/listAll";
	}
	
	/**
	 * 게시글 상세보기
	 * @param Model
	 * @param boardNum 조회할 글 번호
	 * @return read.html
	 */
	@GetMapping("read")
	public String read(Model model
			, @RequestParam(name = "boardNum", defaultValue = "0") 
			  int boardNum) {
		log.debug("boardNum: {}", boardNum);
		BoardDTO boardDTO = boardService.getBoard(boardNum);
		model.addAttribute("board", boardDTO);
		
		return "board/read";
	}
	
	/**
	 * 첨부파일 다운로드
	 * @param boardNum		글번호
	 * @return response		응답정보
	 */
	@GetMapping("download")
	public void download(@RequestParam("boardNum") Integer boardNum
			, HttpServletResponse response) {
		log.debug("download 실행");
		boardService.download(boardNum, response, uploadPath);
	}
	
	/**
	 * 게시글 추천
	 * @param boardNum
	 * @return read.html
	 */
	@GetMapping("like")
	public String like(@RequestParam("boardNum") int boardNum) {
		
		try {
			boardService.setLike(boardNum);
			return "redirect:read?boardNum=" + boardNum;
		} catch (Exception e) {
			return "redirect:listAll";
		}
	}
	
	/**
	 * 게시글 수정 폼으로 이동
	 * @param boardNum	수정할 글 번호
	 * @param user		로그인한 사용자 정보
	 * @param Model
	 * @return updateForm.html
	 */
	@GetMapping("update")
	public String update(@RequestParam("boardNum") int boardNum
			, @AuthenticationPrincipal AuthenticatedUser user
			, Model model) {
		
		try {
			BoardDTO boardDTO = boardService.getBoard(boardNum);
			if (!user.getUsername().equals(boardDTO.getMemberId())) {
				throw new RuntimeException("수정 권한이 없습니다.");
			}
			model.addAttribute("board", boardDTO);
			return "board/updateForm";
		} catch (Exception e) {
			e.printStackTrace();
			return "redirect:listAll";
		}
		
	}
	
	/**
	 * 게시글 수정 처리
	 * @param boardDTO	수정할 글정보
	 * @param user		로그인한 사용자 정보
	 * @param upload	첨부파일
	 * @return	read.html
	 */
	@PostMapping("update")
	public String update(
			@ModelAttribute BoardDTO boardDTO
			, @AuthenticationPrincipal AuthenticatedUser user
			, @RequestParam(name = "upload", required = false)
			  MultipartFile upload) {
		
		try {
			boardService.update(boardDTO, user.getUsername()
								, uploadPath, upload);
			return "redirect:/board/read?boardNum=" + boardDTO.getBoardNum();
		} catch (Exception e) {
			e.printStackTrace();
			return "redirect:listAll";
		}
		
	}
	
	/**
	 * 게시글 삭제
	 * @param boardNum	삭제할 글번호
	 * @param user		로그인한 사용자 정보
	 * @return list.html
	 */
	@GetMapping("delete")
	public String delete(
			@RequestParam(name="boardNum") int boardNum
			, @AuthenticationPrincipal AuthenticatedUser user
			) {
		try {
			boardService.delete(boardNum, uploadPath, user.getUsername());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:listAll";
	}
	
	/**
	 * 리플 작성
	 * @param replyDTO		저장할 리플 정보
	 * @param user			로그인한 사용자 아이디
	 * @return read.html
	 */
	@PostMapping("replyWrite")
	public String replyWrite(@ModelAttribute ReplyDTO replyDTO
			, @AuthenticationPrincipal AuthenticatedUser user) {
		replyDTO.setMemberId(user.getUsername()); // 리플 작성자 정보 추가
		boardService.replyWrite(replyDTO);
		
		return "redirect:read?boardNum=" + replyDTO.getBoardNum();
	}
	
	/**
	 * 리플 삭제
	 * @param replyDTO 삭제할 리플번호와 본문 글번호
	 * @param user 로그인한 사용자 정보
	 * @return read.html
	 */
	@GetMapping("replyDelete")
	public String replyDelete(
			@ModelAttribute ReplyDTO replyDTO
			, @AuthenticationPrincipal AuthenticatedUser user) {
		try {
			boardService.replyDelete(replyDTO.getReplyNum()
					, user.getUsername());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:read?boardNum=" + replyDTO.getBoardNum();
	}
	
	
	
	
	
	
	
}
