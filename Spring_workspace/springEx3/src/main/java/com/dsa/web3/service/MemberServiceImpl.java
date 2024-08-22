package com.dsa.web3.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dsa.web3.dto.MemberDTO;
import com.dsa.web3.entity.MemberEntity;
import com.dsa.web3.repository.MemberRepository;

import jakarta.persistence.EntityNotFoundException;
import jakarta.servlet.http.HttpSession;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * 회원 정보 관련 처리를 하는 서비스 클래스
 */
@Slf4j
@Service
@RequiredArgsConstructor
@Transactional
public class MemberServiceImpl implements MemberService {
	
	private final MemberRepository mr;
	
	/**
	 * 회원정보 생성 후 DB에 저장
	 * @param  없음
	 * @return 없음
	 */
	@Override
	public void insertData() {
		
		// 일반적인 인스턴스 생성 
//		MemberEntity m = new MemberEntity("aaa", "111", "홍길동"
//				, "010-1111-2222", "광주무역회관");
		
		// builder 사용
		MemberEntity m = MemberEntity.builder()
						 .id("aaa")
						 .pw("111")
						 .name("홍길동")
						 .phone("010-1111-2222")
						 .address("광주무역회관")
						 .build();
		
		// 생성한 객체 DB에 저장
		mr.save(m);
		mr.save(new MemberEntity("bbb", "222", "김철수", "010-1111-2222", "떡잎마을"));
		mr.save(new MemberEntity("ccc", "333", "김영희", "010-1111-2222", "떡잎마을"));
		mr.save(new MemberEntity("ddd", "444", "신짱구", "010-1111-2222", "떡잎마을"));
		mr.save(new MemberEntity("eee", "555", "훈이", "010-1111-2222", "떡잎마을"));
		log.debug("[service-save] memberEnetity: {}", m);
		
	}

	
	/**
	 * 회원정보 조회
	 * @param  id : 조회활 아이디
	 * @return MemberDTO : 조회 결과를 담은 객체
	 */
	// alt + shift + s , v
	@Override
	public MemberDTO selectData(String id) {
		
		MemberEntity member = mr.findById(id).orElse(null);
		if(member == null) return null;
		
		log.debug("[service-find] memberEntity : {}", member);
		
		// MemberDTO
		MemberDTO memberDTO = MemberDTO.builder()
							  .id(member.getId())
							  .pw(member.getPw())
							  .name(member.getName())
							  .phone(member.getPhone())
							  .address(member.getAddress())
							  .build();
		
		return memberDTO;
	}


	
	/**
	 * 회원정보 수정
	 * @param MemberDTO 회원정보를 담은 객체
	 */
	@Override
	public void updateData(MemberDTO m) {
		
		try {
			// DB 정보를 조회
			MemberEntity entity = mr.findById(m.getId()).orElseThrow(() -> new EntityNotFoundException("없는 ID"));
			
			// MemberDTO의 수정할 정보를 entity에 세팅
			entity.setPw(m.getPw());
			entity.setName(m.getName());
			entity.setPhone(m.getPhone());
			entity.setAddress(m.getAddress());
			log.debug("[MeberServiceImpl - update] 완료");
			
			// entity 저장
			mr.save(entity);
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
		
	}


	
	/**
	 * 회원정보 삭제
	 * @param  id 삭제할 아이디
	 * @return 삭제여부 true/false
	 */
	@Override
	public boolean deleteData(String id) {
		
		// id에 일치하는 레코드가 있는지 없는지를 true/false로 리턴
		boolean result = mr.existsById(id);
		
		if(result)
			mr.deleteById(id); // id에 일치하는 레코드 삭제
		
		return result;
	}


	
	/**
	 * 모든 정보 조회
	 * @return 삭제여부 true/false
	 */
	@Override
	public List<MemberDTO> selectAllData() {
		
		List<MemberEntity> entityList = mr.findAll();
		List<MemberDTO> dtoList = new ArrayList<>();
		
		for (MemberEntity entity : entityList) {
			MemberDTO dto = new MemberDTO();
			dto.setId(entity.getId());
			dto.setName(entity.getName());
			dto.setPhone(entity.getPhone());
			dto.setAddress(entity.getAddress());
			dtoList.add(dto);
		}
		
		return dtoList;
	}
	
	/**
	 * 회원가입 처리
	 * @param MemberDTO (HTML에서 받아온 입력데이터 객체 = 회원가입정보)
	 */
	@Override
	public void joinData(MemberDTO member) {
		MemberEntity m = MemberEntity.builder()
						 .id(member.getId())
						 .pw(member.getPw())
						 .name(member.getName())
						 .phone(member.getPhone())
						 .address(member.getAddress())
						 .build();
		mr.save(m);
	}
	
	/**
	 * 로그인 처리
	 * @param id, pw
	 */
	@Override
	public MemberEntity loginMember(String id, String pw) {
		MemberEntity result = mr.findById(id).orElse(null);
		return result;
		
//		if(result.getPw().equals(pw)) {
//			return true;
//		} 
		
//		MemberEntity result = mr.findByIdAndPw(id, pw);
//		if(result == null) {
//			return null;
//		}
//		
//		MemberDTO member = new MemberDTO(result.getId(), result.getPw(), result.getName(),
//											result.getPhone(), result.getAddress());
//		return false;
	}
	
	/**
	 * 회원정보 수정
	 * @param MemberDTO 회원정보를 담은 객체
	 */
	public void updateData(MemberDTO m, HttpSession session) {
		
		try {
			// DB 정보를 조회
			MemberDTO sessionM = (MemberDTO)session.getAttribute("loginMember");
//			log.debug("asdfasdf{}", session.getAttribute("loginMember"));
			MemberEntity entity = mr.findById(sessionM.getId()).orElseThrow(() -> new EntityNotFoundException("없는 ID"));
			
//			// MemberDTO의 수정할 정보를 entity에 세팅
//			entity.setId(m.getId());
			entity.setPw(m.getPw());
			entity.setName(m.getName());
			entity.setPhone(m.getPhone());
			entity.setAddress(m.getAddress());
			log.debug("[MeberServiceImpl - update] 완료");
//			
//			// entity 저장
//			mr.save(entity);
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
		
	}
	/**
	 * 회원 조회
	 * 
	 */
	@Override
	public List<MemberDTO> selectAll() {
		List<MemberEntity> result = mr.findAll();
		List<MemberDTO> list = new ArrayList<>();
		
		for(MemberEntity entity : result) {
			MemberDTO member = new MemberDTO(entity.getId(), entity.getPw(),
										entity.getName(), entity.getPhone(), entity.getAddress());
			list.add(member);
		}
		
		return list;
	}


	
	
	

	
	
	
	
}
