package com.kh.test.break_continue;

import java.util.Random;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Test2 t = new Test2();
		t.test();

	}

	public void test() {
		Random r = new Random();
		int radNum = r.nextInt(50)+1;
		
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		
		while(true) {
			System.out.print("정수 입력> ");
			int num = sc.nextInt();	
			
			if(num > radNum) {
				System.out.println("입력하신 정수보다 작습니다.");
			}else if(num < radNum) {
				System.out.println("입력하신 정수보다 큽니다.");
			}else {
				System.out.println("정답입니다. "+i+"회 만에 정답을 맞추셨습니다.");
				break;
			}
			i++;
		}
	}
}
