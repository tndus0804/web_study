package com.dsa.web4.service;

import java.util.List;

import com.dsa.web4.dto.GuestBookDTO;

public interface GuestService {

	void insertMessage(GuestBookDTO guestBook);
	
	GuestBookDTO selectBook(int num);

	List<GuestBookDTO> selectList();

	void delete(int num);

}
