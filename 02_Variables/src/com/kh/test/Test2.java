package com.kh.test;

public class Test2 {

	/**
	 * System.out.printf(형식문자열, 값1, 값2....)
	 * 
	 * 데이터타입별 형식문자를 이용해서 값을 출력하는 메소드
	 */
	public static void main(String[] args) {
		String name;
		int age;
		char gender;
		String phone;
		String email;
		String add;
		
		name = "홍길동";
		age = 22;
		gender = '남';
		phone = "01012341234";
		email = "hgd@naver.com";
		add = "경기도 광주시";
		
		System.out.println("=========================================================================");
		System.out.println("\t이름 \t나이 \t성별 \t전화번호 \t\t이메일 \t\t주소		");
		System.out.println("=========================================================================");
		System.out.printf("\t%s \t%d \t%c \t%s \t%s \t%s\n" , name, age, gender, phone, email, add); 
		
		name = "홍길순";
		age = 20;
		gender = '여';
		phone = "010123412341";
		email = "hgs@gmail.com";
		add = "전라남도 광주시";
		System.out.printf("\t%s \t%d \t%c \t%s \t%s \t%s" , name, age, gender, phone, email, add); 
	}

}
