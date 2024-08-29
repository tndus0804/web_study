package com.dsa.web6.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="ajax_comment")
public class CommentEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer num;
	
	String name;
	String comment;
	/*
	-- DB에 추가할 테이블 (댓글 기능) web6
	create table ajax_comment (
		num		int				primary key auto_increment,
		name	varchar(30)		not null,
		comment varchar(1000)	not null
	);
	 */
}
