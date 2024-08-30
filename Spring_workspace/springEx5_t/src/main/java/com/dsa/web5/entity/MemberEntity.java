package com.dsa.web5.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 회원 정보 Entity
 * Service <-> Repository = JPA 매핑
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "web5_member")
public class MemberEntity {
	@Id
	@Column(name = "member_id", length = 30)
	String memberId;
	
	@Column(name = "member_password", nullable = false, length = 100)
	String memberPassword;
	
	@Column(name = "member_name", nullable = false, length = 30)
	String memberName;
	
	@Column(name = "email", length = 50)
	String email;
	
	@Column(name = "phone", length = 30)
	String phone;
	
	@Column(name = "address", length = 200)
	String address;
	
	@Column(name = "enabled", columnDefinition = "tinyint(1) default 1 check(enabled in (0, 1))")
	Boolean enabled;
	
	@Column(name = "rolename", columnDefinition = "varchar(30) default 'ROLE_USER' check(rolename in ('ROLE_USER', 'ROLE_ADMIN'))")
	String rolename;
	
	// DB에 Insert 되기 전에 실행되는 콜백 메서드를 지정하는 어노테이션
	// @PrePersist: JPA API에서 제공하는 Annotation
	@PrePersist
	public void prePersist() {
		if(enabled == null) this.enabled = true;
		if(rolename == null) this.rolename = "ROLE_USER";
	}
	
	
}
