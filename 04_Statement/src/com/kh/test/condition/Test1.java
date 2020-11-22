package com.kh.test.condition;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Test1 t = new Test1();
		t.test();
		t.test1();

	}
	
	//문제1
	public void test() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 1번째 입력> ");
		int num1 = sc.nextInt();
		
		System.out.print("정수 2번째 입력> ");
		int num2 = sc.nextInt();
		
		System.out.print("연산자 (+ - * /) 입력> ");
		String op = sc.next();
		
		if(op.equals("+")) { //"abc".equals(userInput)이런식으로 쓰는게 문자열비교
			System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
		}else if(op.equals("-")) {
			System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
		}else if(op.equals("*")) {
			System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
		}else if(op.equals("/")) {
			System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
		}else {
			System.out.println("잘못 입력 하셨습니다.  프로그램을 종료합니다.");
		}
		return;
		
	}
	
	//문제1 다른풀이
	private void test1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하세요 ==>");
		int a = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 ==>");
		int b = sc.nextInt();
		
		//조기 return
		if(a < 0 || b < 0) {
			System.out.println("잘못된 연산기호를 입력하셨습니다. 프로그램을 종료합니다.");
			return;// 이하는 실행하지 않고, 메소드 호출부로 돌아간다.
		}
		
		System.out.print("연산기호를 입력하세요(+,-,*,/,%) ==>");
		char op = sc.next().charAt(0);
		int result = 0;
		
		//조기return
		if(op!='+' && op!='-' && 
		   op!='*' && op!='/' && op!='%'){
			System.out.println("잘못된 연산기호를 입력하셨습니다. 프로그램을 종료합니다.");
			return;
		}
		
		if(op=='+'){
			result = a+b;
		}
		else if (op=='-') {
			result = a-b;
		} 
		else if (op=='*') {
			result = a*b;
		}
		else if (op=='/') {
			result = a/b;
		}
		else if (op=='%') {
			result = a%b;
		}

		System.out.printf("입력값 > a=%d, b=%d, %c%n",a,b,op);
		System.out.println(""+a+op+b+"="+result);
		
		return; //모든 메소드 마지막에 생략된 구문
	}

}
