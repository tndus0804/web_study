package net.datasa.web4.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GuestBookDTO {
	
	Integer num;				// 글번호 / 기본키
	String name;				// 작성자 이름
	String password;			// 비밀번호
	String message;				// 게시글 내용
	LocalDateTime inputdate;	// 작성시간
}
