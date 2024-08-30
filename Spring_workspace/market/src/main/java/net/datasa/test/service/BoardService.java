package net.datasa.test.service;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.datasa.test.domain.dto.BoardDTO;
import net.datasa.test.domain.dto.MemberDTO;
import net.datasa.test.domain.dto.ReplyDTO;
import net.datasa.test.domain.entity.BoardEntity;
import net.datasa.test.domain.entity.MemberEntity;
import net.datasa.test.domain.entity.ReplyEntity;
import net.datasa.test.repository.BoardRepository;
import net.datasa.test.repository.MemberRepository;

import org.springframework.data.domain.Sort;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 게시판 서비스
 */
@Slf4j
@RequiredArgsConstructor
@Service
@Transactional
public class BoardService {

	private final BoardRepository boardRepository;
	private final MemberRepository memberRepository;
	
	public void writeBoard(BoardDTO boardDTO) {
		MemberEntity memberEntity = memberRepository.findById(boardDTO.getMemberId())
				.orElseThrow(() -> new EntityNotFoundException("해당 entity가 없습니다."));
		
		BoardEntity entity = BoardEntity.builder()
							.member(memberEntity)
							.category(boardDTO.getCategory())
							.title(boardDTO.getTitle())
							.contents(boardDTO.getContents())
							.price(boardDTO.getPrice())
							.build();
		
		boardRepository.save(entity);
	}

	public ArrayList<BoardDTO> getList() {
		Sort sort = Sort.by(Sort.Direction.DESC, "boardNum");
		List<BoardEntity> entityList = boardRepository.findAll(sort);
		ArrayList<BoardDTO> dtoList = new ArrayList<>();
		
		
		for (BoardEntity entity : entityList) {
//			log.debug("목록조회 멤버: {}", entity.getMember().getMemberId());
			BoardDTO dto = BoardDTO.builder()
					.boardNum(entity.getBoardNum())
					.memberId(entity.getMember().getMemberId())
					.member( memberEntityToDTO(entity.getMember()) )
					.category(entity.getCategory())
					.title(entity.getCategory())
					.contents(entity.getContents())
					.price(entity.getPrice())
					.soldout(entity.isSoldout())
					.buyer( memberEntityToDTO(entity.getBuyer()) )
					.inputDate(entity.getInputDate())
					.build();
			dtoList.add(dto);
		}
		
		
		return dtoList;
	}
	
	public BoardDTO getBoard(Integer boardNum) {
		BoardEntity boardEntity = boardRepository.findById(boardNum)
				.orElseThrow(() -> new EntityNotFoundException("해당 게시물이 없습니다."));
		BoardDTO dto = boardEntityToDTO(boardEntity);
		return dto;
	}
	
	public void buyIem(Integer boardNum, String buyer) {
		BoardEntity boardEntity = boardRepository.findById(boardNum)
				.orElseThrow(() -> new EntityNotFoundException("해당 게시물이 없습니다."));
		MemberEntity memberEntity = memberRepository.findById(buyer)
				.orElseThrow(() -> new EntityNotFoundException("해당 유저가 없습니다."));
		
		boardEntity.setBuyer(memberEntity);
		boardEntity.setSoldout(true);
		
	}
	
	// 리플 정보 가져오기
	public ArrayList<ReplyDTO> getCommentList(Integer boardNum) {
		BoardEntity boardEntity = boardRepository.findById(boardNum)
				.orElseThrow(() -> new EntityNotFoundException("해당 게시물이 없습니다."));
		
		ArrayList<ReplyDTO> replyList = new ArrayList<ReplyDTO>();
//		for (ReplyEntity replyEntity : boardEntity.getMember().getReplyList()) {
//			ReplyDTO replyDTO = replyEntityToDTO(replyEntity);
//			replyList.add(replyDTO);
//		}
//		boardEntity.setReplyList(replyList);
		
		return replyList;
	}
	
	
	public MemberDTO memberEntityToDTO(MemberEntity entity) {
		if (entity == null) {
			return null;
		}
		MemberDTO memberDTO = MemberDTO.builder()
							.memberId(entity.getMemberId())
							.memberPw(entity.getMemberPassword())
							.memberName(entity.getMemberName())
							.phone(entity.getPhone())
							.build();
		return memberDTO;
	}
	
	public BoardDTO boardEntityToDTO(BoardEntity entity) {
		if (entity == null) {
			return null;
		}
		BoardDTO dto = BoardDTO.builder()
							.boardNum(entity.getBoardNum())
							.memberId(entity.getMember().getMemberId())
							.member(memberEntityToDTO(entity.getMember()))
							.category(entity.getCategory())
							.title(entity.getTitle())
							.contents(entity.getContents())
							.price(entity.getPrice())
							.soldout(entity.isSoldout())
							.buyer(memberEntityToDTO(entity.getBuyer()))
							.inputDate(entity.getInputDate())
							.build();
		return dto;
	}

	
	public ReplyDTO replyEntityToDTO(ReplyEntity entity) {
		if (entity == null) {
			return null;
		}
		ReplyDTO dto = ReplyDTO.builder()
							.replyNum(entity.getReplyNum())
							.boardNum(entity.getBoard().getBoardNum())
							.member(memberEntityToDTO(entity.getMember()))
							.contents(entity.getReplyText())
							.build();
		return dto;
	}

}
