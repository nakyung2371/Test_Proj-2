package com.naver.Test_Proj2;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Member {

	//Primary key: 정수, 자동 값 증가, H2 DB는 Local3, 값을 Jpa의 save() 메소드를 사용해서 레코드 2개
	//입력
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(length=100)
	private String name;
	
	@Column(length=200)
	private String email;
	
	@Column(length=100)
	private String phone;
	
	@Column(length=100)
	private Double weight;
	
	private LocalDateTime createDate;
}
