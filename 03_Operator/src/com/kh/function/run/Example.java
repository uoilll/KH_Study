package com.kh.function.run;

import java.util.Scanner;

public class Example {

//	public static void main(String[] args) {
//		Example e = new Example();
//		e.opSample1();
//		e.opSample2();
//		e.opSample3();
//		
//
//	}
//	

	//문제3
	public void opSample3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력> ");
		int i = sc.nextInt();
		String str = i > 0 ? "양수다" : (i==0?"0이다":"음수다.");
		
		System.out.println(str);
		
		
	}

	//문제2
	public void opSample2() {
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("학생이름> ");
//		String name = sc.nextLine();
//		
//		System.out.print("학년> ");
//		int grade = sc.nextInt();
//		
//		System.out.print("반> ");
//		int cl = sc.nextInt();
//		
//		System.out.print("번호> ");
//		int num = sc.nextInt();
//		
//		sc.nextLine();
//		
//		System.out.print("성별(M|F)> ");
//		String gender = sc.nextLine();
//		
//		System.out.print("성적> ");
//		double grades = sc.nextDouble();
//		
//		if(gender.equals("M")) {
//			System.out.printf("%d학년 %d반 %d번 남학생 %s은 성적이 %.2f이다.",grade,cl,num,name,grades);
//		}else {
//			System.out.printf("%d학년 %d반 %d번 여학생 %s은 성적이 %.2f이다.",grade,cl,num,name,grades);
//		}
		
		
		System.out.print("학생이름> ");
		String name = sc.nextLine();
		
		System.out.print("학년> ");
		int grade = sc.nextInt();
		
		System.out.print("반> ");
		int cl = sc.nextInt();
		
		System.out.print("번호> ");
		int num = sc.nextInt();
		
		System.out.print("성별(M|F)> ");
		char gender = sc.next().charAt(0);		
		String strg = (gender == 'm' || gender == 'M') ? "남학생" : "여학생";
		
		System.out.print("성적> ");
		double grades = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s은 성적이 %.2f이다.",grade,cl,num,strg,name,grades);
		
	}

	//문제1
	public void opSample1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어> ");
		int ko = sc.nextInt();
		
		System.out.print("영어> ");
		int en = sc.nextInt();
		
		System.out.print("수학> ");
		int math = sc.nextInt();
		
		int total = ko+en+math;
		
		float average = total/3;
		
		System.out.println("합계: "+total);
		System.out.println("평균: "+average);
		
		String str = ko >= 40 && en >= 40 && math >= 40 && average >= 60 ? "합격" : "불합격";
		System.out.println("=="+ str +"==");
		
	}

}
