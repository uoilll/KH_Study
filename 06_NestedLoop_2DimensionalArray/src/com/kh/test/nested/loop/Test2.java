package com.kh.test.nested.loop;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Test2 t = new Test2();
		t.test();

	}

	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		
		if(num <= 0) {
			System.out.println("양수가 아닙니다.");
		}
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 0; i < num-1 ; i++) {
			//방법1
//			for(int k = 0; k <= i; k++) {
//				System.out.print(" ");
//			}
//			for(int j = num-1; j > i; j--) {				
//				System.out.print("*");
//			}		
			//방법2
			for(int j = 0; j < num; j++) {
				if(j <= i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}			
			}
			System.out.println();
			
		}
	}
}
