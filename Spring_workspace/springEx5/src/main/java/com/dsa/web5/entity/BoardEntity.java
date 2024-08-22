package com.dsa.web5.entity;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 게시글 정보 엔티티
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "web5_board")
public class BoardEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "board_num")
	private Integer boardNum;
	
	// 다대일 관계. 게시글 여러개가 회원정보 하나를 참조
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "member_id", referencedColumnName = "member_id")
	private MemberEntity member;
	
	@Column(name = "title", nullable = false, length = 100)
	private String title;
	
	@Column(name = "contents", nullable = false, columnDefinition = "text")
	private String contents;
	
	@Column(name = "view_count", columnDefinition = "integer default 0")
	private Integer viewCount = 0;
	
	@Column(name = "like_count", columnDefinition = "integer default 0")
	private Integer likeCount = 0;
	
	@Column(name = "original_name")
	private String originalName;
	
	@Column(name = "file_name")
	private String fileName;
	
	@CreatedDate
	@Column(name = "create_date", columnDefinition = "timestamp default current_timestamp")
	private LocalDateTime createDate;
	
	@LastModifiedDate
	@Column(name = "update_date", columnDefinition = "timestamp default current_timestamp")
	private LocalDateTime updateDate;
	
	// 일대다 관계, 게시글에 달린 댓글들의 목록을 저장
	// orphanRemoval = true: 게시글에서 댓글이 삭제되면,
	// 						 데이터베이스에서도 해당 댓글이 삭제됩니다.
	// mappedby => board라는 변수에 의해서 참조
	// cascade => 참조, 한쪽을 지운다면 같이 지운다
	@OneToMany(mappedBy = "board", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<ReplyEntity> replyList;
	
}
