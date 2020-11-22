package kh.java.oop.student.run;

import java.util.Scanner;

import kh.java.oop.student.controller.StudentManager;
import kh.java.oop.student.model.vo.Student;

public class StudentRun {

	public static void main(String[] args) {
//		StudentRun s = new StudentRun();
//		s.manageStudent();

		//코드가 가진 성격별로 분리
		//학생관리객체 생성 및 메소드 호출
		StudentManager sm = new StudentManager();
		sm.manageStudent();
	}
/*
	public void manageStudent() {
		
		Student[] arr = new Student[5];
		
//		arr[0] = inputStudnet();
//		arr[1] = inputStudnet();
//		arr[2] = inputStudnet();
//		arr[3] = inputStudnet();
//		arr[4] = inputStudnet();
		
		//객체 사용자 입력
		for(int i = 0; i < arr.length; i++) {
			arr[i] = inputStudent();
		}
		//객체출력
		for(int i = 0; i < arr.length; i++) {
			Student s = arr[i];
			System.out.println(s.print());
		}
		
	}


	public Student inputStudent() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생명: ");
		String name = sc.next();
		System.out.print("점수: ");
		int point  = sc.nextInt();
		
		return new Student(name, point);
	}

	public void manageStudent_() {
		//객체배열 선언
		Student[] stdtArr;
		//객체배열 할당
		stdtArr = new Student[5];
		
		System.out.println(stdtArr[0]);
		System.out.println(stdtArr[1]);
		System.out.println(stdtArr[2]);
		System.out.println(stdtArr[3]);
		System.out.println(stdtArr[4]);
		
		//배열요소 대입
		stdtArr[0] = new Student("홍길동",80);
		stdtArr[1] = new Student("신사임당",95);
		stdtArr[2] = new Student("세종대왕",70);
		stdtArr[3] = new Student("장영실",87);
		stdtArr[4] = new Student("이황",99);
		
//		System.out.println(stdtArr[0]);
//		System.out.println(stdtArr[1]);
//		System.out.println(stdtArr[2]);
//		System.out.println(stdtArr[3]);
//		System.out.println(stdtArr[4]);
//		
		for(int i = 0; i < 5; i++) {
			System.out.println(stdtArr[i]);
			//또는
//			Student s = stdtArr[i];
//			System.out.println(s);
			//또는
//			System.out.println(s.print());
		}
	}
*/
	
}
