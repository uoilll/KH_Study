package com.kh.test.break_continue;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Test3 t = new Test3();
		t.test();

	}

	public void test() {
		Scanner sc = new Scanner(System.in);
		
		int i = 2;
		
		while(true) {
			System.out.print("정수 입력> ");
			int num = sc.nextInt();
			i = num;
			if(i >= 2) {
				for(int n = 2; n < i; n++) {
					
					if(i % n == 0) { //소수아닌경우
						System.out.println("소수가 아니다.");
						break;
					}else if(i == n+1) { //소수인경우
						System.out.println("소수다.");
						
					}
				}
				break;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
			}
		}
	}

}
