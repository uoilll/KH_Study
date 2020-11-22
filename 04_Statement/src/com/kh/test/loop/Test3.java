package com.kh.test.loop;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Test3 t = new Test3();
//		t.test();
		t.test2();

	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력> ");
		int dan = sc.nextInt();
		
		if(dan>9 || dan<1) {
			System.out.println("잘못입력하셨습니다.");
			return;
		}
		
		for(int i = 1; i<10; i++) {
			System.out.println(dan+" * "+i+" = "+dan*i);
		}
	}
	
	//while문으로 사용하기
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력> ");
		int dan = sc.nextInt();
		
		if(dan>9 || dan<1) {
			System.out.println("잘못입력하셨습니다.");
			return;
		}
		
		int i = 1;
		while(i<10) {
			System.out.println(dan+" * "+i+" = "+dan*i);
			i++;
		}
	}

}
