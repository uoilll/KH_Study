package com.kh.function.run;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Test t = new Test();
//		t.opSam1();
//		t.opSam2();
		t.opSam3();
		

	}

	private void opSam3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력> ");
		int i = sc.nextInt();
		
		String str = i > 0 ? "양수다":"양수가 아니다";
		System.out.println(str);
		
	}

	private void opSam2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생이름> ");
		String name = sc.nextLine();
		
		System.out.print("학년> ");
		int gra = sc.nextInt();
		
		System.out.print("반> ");
		int cl = sc.nextInt();
		
		System.out.print("번호> ");
		int num = sc.nextInt();
		
		System.out.print("성별> ");
		char c = sc.next().charAt(0);
		String str = c == 'M' ? "남학생" : "여학생";
		
		System.out.print("성적> ");
		double g = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s은 성적이 %.2f이다.",gra,cl,num,str,name,g);
		
	}

	private void opSam1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어> ");
		int ko = sc.nextInt();
		
		System.out.print("영어> ");
		int en = sc.nextInt();
		
		System.out.print("수학> ");
		int ma = sc.nextInt();
		
		int total = ko+en+ma;
		System.out.println("총점: "+total);
		
		double av = total/3;
		System.out.println("평균: "+av);
		
		String str = ko >= 40 && en >= 40 && ma >= 40 && av >= 60 ? "합격" : "불합격";
		
		System.out.println(str);
	}

}
