package net.datasa.web4.service;

import java.util.List;

import net.datasa.web4.dto.GuestBookDTO;

public interface GuestService {

	// 글저장
	void write(GuestBookDTO guestbook);

	// 목록조회
	List<GuestBookDTO> selectAll();

	// 글삭제
	void delete(GuestBookDTO guestbook);

}
