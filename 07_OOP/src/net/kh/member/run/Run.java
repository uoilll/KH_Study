package net.kh.member.run;

import java.util.Scanner;

import net.kh.member.model.Member;

public class Run {

	public static void main(String[] args) {
//		Member m = new Member();
//		
//		m.setId("gg");
//		m.setPwd("1234");
//		m.setName("홍길동");
//		m.setAge(20);
//		m.setGender('남');
//		m.setPhone("010123412");
//		m.setEmail("gg@naver.com");
//		
//		String name = m.getId();
//		System.out.println(name); //System.out.println(m.getId());와 같음
//		System.out.println(m.getPwd());
//		System.out.println(m.getName());
//		System.out.println(m.getAge());
//		System.out.println(m.getGender());
//		System.out.println(m.getPhone());
//		System.out.println(m.getEmail());
	
		////////////////////////////////////////
		
		//사용자 입력값으로 member객체 대입하기
		Scanner sc = new Scanner(System.in);
		Member m = new Member();
		
		
		System.out.print("아이디: ");
		String memberId = sc.next();
		m.setId(memberId);
		
		System.out.print("비밀번호: ");
		m.setPwd(sc.next());
		System.out.print("이름: ");
		m.setName(sc.next());
		System.out.print("전화번호: ");
		m.setPhone(sc.next());
		System.out.print("이메일: ");
		m.setEmail(sc.next());
		System.out.print("성별(남/여): ");
		m.setGender(sc.next().charAt(0));
		System.out.print("나이: ");
		m.setAge(sc.nextInt());
		
		String name = m.getId();
		System.out.println(name); //System.out.println(m.getId());와 같음
		System.out.println(m.getPwd());
		System.out.println(m.getName());
		System.out.println(m.getAge());
		System.out.println(m.getGender());
		System.out.println(m.getPhone());
		System.out.println(m.getEmail());
		
	}

}
