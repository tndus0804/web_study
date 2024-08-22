package com.dsa.web5.service;


import java.util.List;

import com.dsa.web5.dto.MemberDTO;

public interface MemberService {

	boolean idCheck(String searchId);

	void join(MemberDTO member);

	MemberDTO getMember(String id);

	void update(MemberDTO member);

	List<MemberDTO> getMembers();

	void update(String id, String pw);
	
	
	
}

