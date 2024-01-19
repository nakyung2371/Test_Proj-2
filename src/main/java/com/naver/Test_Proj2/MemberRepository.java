package com.naver.Test_Proj2;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long>{
	//CRUD 메소드
	/*
	   findAll()	: select * from member;
	   save()		: insert, update
	   delete()		: delete
	 */

}
