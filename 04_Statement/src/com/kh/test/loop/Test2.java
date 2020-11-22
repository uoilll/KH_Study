package com.kh.test.loop;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Test2 t = new Test2();
//		t.test();
//		t.test_2();
		t.test2();

	}

	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력> ");
		int num = sc.nextInt();
		
		for(int i =1; i <=num; i++) {
			if(i%2 != 0) {
				System.out.print("수");
			}else {
				System.out.print("박");
			}
		}						
	}
	
	//while문 으로 사용하기
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력> ");
		int num = sc.nextInt();
		
		int j = 1;
		while(j <= num) {
			if(j%2 == 1) {
				System.out.print("수");
			}else {
				System.out.print("박");
			}
			j++;
		}
	}
	
	//다른풀이
	private void test_2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("> 정수를 입력하세요 => ");
		int num = sc.nextInt();
		
		char odd = '수';
		char even = '박';
		String result = "";
		
		for(int i=1; i<=num; i++) {
			if(i%2==0) 
				result += even;
			else 
				result += odd;
		}//end of for(int i=1; i<=num; i++) 
		
		System.out.println(result);
	}
}
