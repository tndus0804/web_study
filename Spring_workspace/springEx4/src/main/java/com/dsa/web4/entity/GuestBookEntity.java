package com.dsa.web4.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "guestbook13")
@Builder
@AllArgsConstructor
@NoArgsConstructor
// Auditing 기능을 사용하기 위해 Entity 클래스에 추가하는 어노테이션
// 엔티티의 생성 및 수정 시점에 자동으로 특정 필드를 업데이트해주는 역할, 기능
@EntityListeners(AuditingEntityListener.class)
public class GuestBookEntity {
	@Id
	// Primary key 생성 전략, MySQL의 AUTO_INCREMENT 방식을 이용
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "num")
	private Integer num;
	
	@Column(name = "name", nullable=false, length = 100)
	String name;
	
	@Column(name = "password", nullable = false, length = 100)
	String password;
	
	@Column(name = "message", nullable = false, columnDefinition = "text")
	String message;
	
	// Entity가 생성된 날짜와 시간을 자동으로 저장하기 위해 사용
	// LocalDateTime, LocalDate, Date 타입의 필드와 함께 사용
	@CreatedDate
	@Column(name = "inputdate")
	LocalDateTime inputdate;
	
}
