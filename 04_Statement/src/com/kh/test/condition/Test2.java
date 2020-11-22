package com.kh.test.condition;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Test2 t = new Test2();
		t.test();
		t.test1();
	}

	//문제2
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1~10 사이의 정수를 입력하시오.> ");
		int num = sc.nextInt();
		
		if(num >= 1 && num <= 10) {
			if(num % 2 == 0) {
				System.out.println("짝수다.");
			}else {
				System.out.println("홀수다.");
			}
		}else {
			System.out.println(" 반드시 1~10사이의 정수를 입력해야 합니다.");
		}
	}
	
	//문제2 다른풀이
	private void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1에서 100사이의 정수를 하나 입력하세요 ==>");
		int num = sc.nextInt();
		
		String result = "";
		
		if(num>0 && num <=100){			
			if(num%2 == 0){
				result = "짝수를 입력하셨습니다.";
			}
			else{
				result = "홀수를 입력하셨습니다.";
			}
		}
		else {
			result = "1에서 100사이의 정수가 아닙니다.";
		}
		
		System.out.println(result);
		
	}
}
