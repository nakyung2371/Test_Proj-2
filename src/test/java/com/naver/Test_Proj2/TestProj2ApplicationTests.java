package com.naver.Test_Proj2;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestProj2ApplicationTests {

	@Autowired
	private MemberRepository memberRepository;
	
	@Test
	void jpaInsertTest() {
		
		Member m1 = new Member();
		m1.setName("홍길동");
		m1.setEmail("aaa@aaa.com");
		m1.setPhone("010-1111-1111");
		m1.setWeight(70.0);
		m1.setCreateDate(LocalDateTime.now());
		
		memberRepository.save(m1);
		
		Member m2 = new Member();
		m2.setName("박동동");
		m2.setEmail("bbb@aaa.com");
		m2.setPhone("010-2222-2222");
		m2.setWeight(85.7);
		m2.setCreateDate(LocalDateTime.now());
		
		memberRepository.save(m2);
		
	}

	
	
}
