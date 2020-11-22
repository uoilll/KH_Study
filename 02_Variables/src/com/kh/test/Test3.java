package com.kh.test;

public class Test3 {

	public static void main(String[] args) {
		
		 Test3 t = new Test3();
//		 t.test1();
//		 t.test2();
//		 t.test3();		 
		 t.test4();

	}

	
	//printf
	/**
	 * 너비 / 정렬 지정하기
	 * %[flag][width]형식문자
	 *  %-10d -> 10byte의 공간에 좌측정렬할
	 *  %10d -> 10byte의 공간에 우측정렬
	 */
	private void test4() {
		int i = 12345;
		System.out.printf("%10d\n", i);
		System.out.printf("%-10d\n", i);
		
	}


	//printf
	/**
	 * System.out.printf(형식문자열, 값1, 값2,...)
	 * 
	 * 데이터타입별 형식문자를 이용해서 값으 출력하는 메소드
	 */
	private void test3() {
		boolean bool = true;
		System.out.printf("bool = %b\n", bool); //\n을 %n이라 써도 됨
		
		char ch = '헐';
		System.out.printf("ch = %c\n", ch);
		
		//%d : decimal
		int iNum = 100;
		long lNum = 999;
		System.out.printf("iNum = %d, lNum = %d\n", iNum,lNum);
		
		//%f : float
		float fNum = 123.456f;
		double dNum = 123.1234567890;
		System.out.printf("fNum = %.2f, dNum = %.10f\n", fNum,dNum);
		
		//%s : 문자열
		String name = "홍길동";
		System.out.printf("name = %s\n", name);
		System.out.printf("%s %s %s %s %s\n", bool, ch, iNum, lNum, fNum);
	}

///////////////////////////////////////////////////////////////////////////////	
	private void test2() {
		String name = "홍길동";
		int age = 22;
		char gender = '남';
		String addr = "경기도 광주시";
		String phone = "01012341234";
		String email = "hgd@naver.com";
		
		System.out.println("=======================================================================");
		System.out.println("이름\t 나이\t 성별\t 전화번호\t\t 이메일\t\t 주소");
		System.out.println("=======================================================================");
		System.out.printf("%s\t %d\t %c\t %s\t %s\t %s\n",name,age,gender,phone,email,addr);
		
		name = "홍길순";
		age = 20;
		gender = '여';
		phone = "010123412341";
		email = "hgs@gmail.com";
		addr = "전라남도 광주시";
		System.out.printf("%s\t %d\t %c\t %s\t %s\t %s\n",name,age,gender,phone,email,addr);
	}

	private void test1() {
		int a = 100;
		long b = 999_900_000_000L;
		System.out.println("정수형 " + a + ", " + b);
		
		float c = 486.520f;
		double d = 567.890123;
		String e = String.format("%.3f", c);
		System.out.println(e+"(float), "+d);
		
		char f = 'A';
		System.out.println(f);
		
		String g = "Hello world";
		System.out.println(g);
		
		boolean h = true;
		System.out.println(h);
	}

}
