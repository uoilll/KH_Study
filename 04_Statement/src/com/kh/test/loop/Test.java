package com.kh.test.loop;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Test t = new Test();
//		t.test1();
//		t.test2();
//		t.test3();
		t.test4();

	}
	
	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력> ");
		String str = sc.next();
		System.out.print("검색할 문자 입력> ");
		char ch = sc.next().charAt(0);
		
		int num = 0; //문자열에서 검색한 문자가 포함된 갯수
		
		if((ch>=65 && ch<=90) || (ch>=97 && ch<=122)) {
			for(int i = 0; i < str.length(); i++) {
				if(ch == str.charAt(i)) {
					num += 1;
				}
			}
		}else {
			System.out.println("영문자가 아닙니다.");
			return;
		}
		
		System.out.println(ch+"가 포함된 갯수: "+num+"개");
	}
	
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력> ");
		int dan = sc.nextInt();
		System.out.println(dan+"입력");
		
		for(int i = 1; i < 10; i++) {
			System.out.println(dan+" * "+i+" = "+dan*i);
		}
	}
	
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력> ");
		int num = sc.nextInt();
		
		System.out.print(num+"입력: ");
		
		for(int i = 1; i <= num; i++) {
			if(i%2==1) {
				System.out.print("수");
			}else {
				System.out.print("박");
			}
		}
	}

	public void test1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력> ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 0; i < num; i+=2) {
			sum += i;
		}
		System.out.println(sum);
	}
}
