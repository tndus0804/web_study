package com.dsa.web5.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.dsa.web5.dto.MemberDTO;
import com.dsa.web5.entity.MemberEntity;
import com.dsa.web5.repository.MemberRepository;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional
public class MemberServiceImpl implements MemberService{
	
	private final MemberRepository mr;

	// 암호화
	private final BCryptPasswordEncoder passwordEncoder;
	
	/**
	 * 가입시 아이디 중복 확인 처리
	 * @param searchId
	 * @return 해당 아이디로 가입 가능 여부 true / false
	 */
	@Override
	public boolean idCheck(String searchId) {
		return !mr.existsById(searchId);
	}

	/**
	 * 회원가입 처리
	 * @param MemberDTO 가입 데이터
	 */
	@Override
	public void join(MemberDTO member) {
		MemberEntity entity = MemberEntity.builder()
							  .memberId(member.getMemberId())
							  .memberPassword(
								  passwordEncoder.encode(member.getMemberPassword())
							  )
							  .memberName(member.getMemberName())
							  .email(member.getEmail())
							  .phone(member.getPhone())
							  .address(member.getAddress())
//							  .enabled(true)
//							  .rolename("ROLE_USER")
							  .build();
		
		mr.save(entity);
	}

	
	
	@Override
	public MemberDTO getMember(String id) {
		MemberEntity entity = mr.findById(id)
				.orElseThrow(() -> new EntityNotFoundException(id + " : 아이디가 없습니다."));
		
		MemberDTO member = MemberDTO.builder()
							.memberId(entity.getMemberId())
							.memberPassword(entity.getMemberPassword())
							.memberName(entity.getMemberName())
							.email(entity.getEmail())
							.phone(entity.getPhone())
							.address(entity.getAddress())
							.enabled(true)
							.rolename(entity.getRolename())
							.build();
			
			
			
		return member;
		
	}

	/**
	 * 개인정보 수정
	 * @param MemberDTO
	 */
	@Override
	public void update(MemberDTO member) {
		MemberEntity entity = mr.findById(member.getMemberId())
				.orElseThrow(() -> new EntityNotFoundException(member.getMemberId() + " : 아이디가 없습니다."));
		if(!member.getMemberPassword().isEmpty()) {
			entity.setMemberPassword(
					passwordEncoder.encode(member.getMemberPassword())
			);
		}
			
		entity.setMemberName(member.getMemberName());
		entity.setEmail(member.getEmail());
		entity.setPhone(member.getPhone());
		entity.setAddress(member.getAddress());
		mr.save(entity);
	}

	@Override
	public List<MemberDTO> getMembers() {
		List<MemberEntity> entities = mr.findAll();
		List<MemberDTO> members = new ArrayList<MemberDTO>();
		
		for(MemberEntity entity : entities) {
			MemberDTO member = MemberDTO.builder()
					.memberId(entity.getMemberId())
					.memberPassword(entity.getMemberPassword())
					.memberName(entity.getMemberName())
					.email(entity.getEmail())
					.phone(entity.getPhone())
					.address(entity.getAddress())
					.enabled(true)
					.rolename(entity.getRolename())
					.build();
			members.add(member);
		}
		
		return members;
	}

	@Override
	public void update(String id, String pw) {
		MemberEntity entity = mr.findById(id).orElse(null);
		if(entity == null) {
			return;
		}
		
		entity.setMemberPassword(
				passwordEncoder.encode(pw)
				);
		mr.save(entity);
	}
	
	
	
	
}
