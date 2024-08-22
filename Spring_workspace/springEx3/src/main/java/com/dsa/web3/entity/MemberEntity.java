package com.dsa.web3.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
// JPA에서 데이터베이스 테이블과 매핑되는 자바 클래스를 정의하기 위해 사용하는 어노테이션
@Entity
// 엔티티가 매핑될 테이블 지정. 생략하면 클래스 이름이 테이블 이름으로 사용
@Table(name="member13")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberEntity {
	// 엔티티 클래스에는 반드시 @Id 어노테이션을 사용하여 식별자 필드를 지정해야 함(기본키)
	@Id
	/*
	 * @column : 클래스 멤버 변수를 데이터 베이스 테이블의 컬럼과 매핑
	 *     - name : 컬럼이름 지정
	 *     - nullable : false로 설정하면 해당 컬럼은 NOT NULL 제약조건 가짐
	 *     - length : 테이터 크기
	 *     - unique : true로 설정하면 해당 컬럼에 UNIQUE 제약조건 가짐
	 */
	@Column(name = "id", nullable = false, length = 30)
	private String id;
	@Column(name = "pw", length = 50)
	private String pw;
	@Column(name = "name")
	private String name;
	@Column(name = "phone")
	private String phone;
	@Column(name = "address")
	private String address;
}
