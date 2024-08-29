package com.dsa.web6.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsa.web6.entity.MemberEntity;
import com.dsa.web6.repository.MemberRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class AjaxService {
	
	@Autowired
	MemberRepository memberRepository;
	

	public boolean idDuplicate(String id) {
		return memberRepository.existsById(id);
	}
	
	public void join(MemberEntity entity) {
//		MemberEntity entity = MemberEntity.builder()
//							  .id(person.getName())
//							  .name(person.getName())
//							  .build();
		memberRepository.save(entity);
	}

	
	
	
}
