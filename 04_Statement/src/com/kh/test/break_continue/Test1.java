package com.kh.test.break_continue;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Test1 t = new Test1();
//		t.test1();
		t.test2();

	}	

	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요. => ");
		int num1 = sc.nextInt();
		System.out.print(" 다른 정수를 하나 입력하세요. => ");
		int num2 = sc.nextInt();
		System.out.println("====================");
				
		int sum = 0; //큰수의 홀수 합
		int i = 1;
	
				
		if(num1 > num2) {
			i = num2;			
			for(i = num2; i <= num1; i++) {
				if(i % 2 == 1) {
					sum += i;
				}
			}
			System.out.println(num2+"에서 "+num1+"까지의 홀수의 합은 "+sum+"입니다.");
		}else {
			i = num1;			
			for(i = num1; i <= num2; i++) {
				if(i % 2 == 1) {
					sum += i;
				}
			}
			System.out.println(num1+"에서 "+num2+"까지의 홀수의 합은 "+sum+"입니다.");
		}
	}
	
	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력> ");
		int num = sc.nextInt();
		
		int mul = 1;
		int i = 1;
		
		while(true){				
			if(i % 2 == 1) {
				mul *= i;
			}
			if(i == num){
				break;
			}
			i++;
		}
		System.out.println(mul);
	}

}
