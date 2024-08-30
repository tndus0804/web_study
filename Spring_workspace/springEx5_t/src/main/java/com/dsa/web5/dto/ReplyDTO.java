package com.dsa.web5.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 리플 정보 DTO
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReplyDTO {
	private Integer replyNum;			//리플 일련번호
	private Integer boardNum;			//게시글 일련번호
	private String memberId;			//작성자 아이디
	private	String memberName;			//작성자 이름
	private String contents;			//리플 내용
	private LocalDateTime createDate;	//작성 시간
}






