package net.datasa.test.domain.entity;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 리플 Entity
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "market_reply")
public class ReplyEntity {
	// 리플 일련번호
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "reply_num")
	private Integer replyNum;
	
	// 본문글 정보 (외래키)
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "board_num", referencedColumnName = "board_num")
	BoardEntity board;
	
	// 작성자 정보 (외래키)
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "member_id", referencedColumnName = "member_id")
	MemberEntity member;
	
	// 리플내용
	@Column(name = "reply_text", nullable = false)
	private String replyText;
}
