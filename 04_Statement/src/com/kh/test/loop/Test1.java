package com.kh.test.loop;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Test1 t = new Test1();
//		t.test();
		t.test2();

	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력> ");
		int num = sc.nextInt();
		
		int sum = 0;
		for(int i = 0; i < num; i+=2) {
			sum += i;
		}
		System.out.println(sum);		
	}
	
	//while로 사용하기
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력> ");
		int num = sc.nextInt();
		
		int sum = 0;
		int i = 1;
		while(i < num) {
			if(i % 2 == 0) {
				sum += i;				
			}
			i++;
		}			
		/*
		 	while(i < num) {
				sum += 1;
				i += 2;
			}	
		*/
		System.out.println(sum);
	}
	
}
