package com.kh.test.random;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {

	public static void main(String[] args) {
		
		RandomTest r = new RandomTest();
//		r.test1();
		r.test2();
		r.test3();

	}
	
	//문제1
	public void test1() {
		Random r = new Random();
		
		//0~9까지의 랜덤수
		int a = r.nextInt(10);
		System.out.println(a);
		
		//1~10까지의 랜덤수
		int b = r.nextInt(10) + 1;
		System.out.println(b);
		
		//20~35까지의 랜덤수
		int c = r.nextInt(16) + 20;
		System.out.println(c);
		
		//0또는1
		int d = r.nextInt(2);
		System.out.println(d);
		
		//다른풀이
//		System.out.println("0~9까지의 랜덤수 : "+r.nextInt(10));
//		System.out.println("1~10까지의 랜덤수 : "+(r.nextInt(10)+1));
//		System.out.println("20~35까지의 랜덤수 : "+(r.nextInt(16)+20));
//		System.out.println("0 또는 1 : "+(r.nextInt(2)));
	}
	
	//문제2
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("==가위 바위 보 게임==");
		System.out.print("숫자를 선택하세요(1.가위 / 2.바위 / 3.보) : ");
		
		int num = sc.nextInt();
		
		int com = (int)(Math.random() * 3 + 1);
		
		String numStr = (num == 1) ? "가위" : (num == 2 ? "바위" : "보");
		String comStr = (com == 1) ? "가위" : (com == 2 ? "바위" : "보");
		
		System.out.println("========결과========");
		System.out.println("당신은 "+numStr+"를 냈습니다.");
		System.out.println("컴퓨터는 "+comStr+"를 냈습니다.");
		System.out.println("===================");
		
		if((com - num == -1) || (com - num == 2)) {
			System.out.println("당신이 이겼습니다. ㅠ.ㅠ");
		}else if(com - num == 0) {
			System.out.println("비겼습니다.");
		}else {
			System.out.println("컴퓨터가 이겼습니다. ^.^");
		}
	}
	
	//가위바위보게임 다른풀이
		public void test3() {
			Scanner sc = new Scanner(System.in);
			System.out.println("==가위 바위 보 게임==");
			System.out.print("숫자를 선택하세요(1.가위|2.바위|3.보)> ");
			
			int user = sc.nextInt();
			String userStr = user == 1 ? "가위" : (user == 2 ? "바위" : "보");
			
			Random r = new Random();
			int com = r.nextInt(3)+1;
			String comStr = com == 1 ? "가위" : (com == 2 ? "바위" : "보");
			
			System.out.println("====결과====");
			System.out.printf("당신은 %s를 냈습니다\n",userStr);
			System.out.printf("컴퓨터는 %s를 냈습니다\n",comStr);
			System.out.println("============");
			
			if((com==1 && user==3)||(com==2 && user==1)||(com==3 && user==2)) {
				System.out.println("컴퓨터가 이겼습니다.^^");
			}else if((com==1 && user==2)||(com==2 && user==3)||(com==3 && user==1)) {
				System.out.println("당신이 이겼습니다.ㅠㅠ");
			}else {
				System.out.println("비겼습니다.");
			}
			
		}

}
