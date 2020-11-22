package com.kh.test.loop;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Test5 t = new Test5();
		t.test();

	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		String member = "";
		int totAge = 0;
		int totHeight = 0;
		int totWeight = 0 ;
		
		int i = 1;
		
		while(i <= 3) {
			System.out.println("==입력==");
			System.out.print("이름> ");
			String name = sc.next();
			System.out.print("나이> ");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.print("주소> ");
			String addr = sc.nextLine();
			System.out.print("키> ");
			int height = sc.nextInt();
			System.out.print("몸무게> ");
			int weight = sc.nextInt();
			sc.nextLine();
			System.out.print("연락처> ");
			String phone = sc.next();
			
			member += (i+" "+name+" "+age+"세 "+addr+" "+height+"cm "+weight+"kg "+phone+"\n");			
			totAge += age;
			totHeight += height;
			totWeight += weight;
			
			i++;			
		}
		int averAge = totAge/(i-1);
		int averHeight = totHeight/(i-1);
		int averWeight = totWeight/(i-1);
		System.out.println("================ 저장회원===============");
		System.out.println(member);
		System.out.println("========================================");
		System.out.println("평균나이: "+averAge+"세 / 평균키: "+averHeight+"cm / 평균몸무게: "+averWeight+"kg");
	}
}
