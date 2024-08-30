package net.datasa.test.domain.dto;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 리플 DTO
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReplyDTO {
	private Integer replyNum;			//리플 일련번호
	private Integer boardNum;			//게시글 일련번호
	private MemberDTO member;			//작성자 아이디
	private String contents;			//리플 내용

}
