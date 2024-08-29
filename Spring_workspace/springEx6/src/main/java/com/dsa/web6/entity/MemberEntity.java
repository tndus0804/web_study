package com.dsa.web6.entity;

import jakarta.persistence.Entity;
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
@Table(name="ajax_member")
public class MemberEntity {
	@Id
	String id;
	String name;
}

/*

-- ID 중복검사 기능 (회원정보)
create table ajax_member(
	id		varchar(30) primary key,
	name	varchar(30) not null
);
 */