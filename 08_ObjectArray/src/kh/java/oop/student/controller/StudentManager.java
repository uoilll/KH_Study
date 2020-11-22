package kh.java.oop.student.controller;

import java.util.Scanner;

import kh.java.oop.student.model.vo.Student;


/**
 * StudentManager ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ>(실선) Student
 * 연관관계 : 멤버변수로 Student를 참조한다.
 * 
 * has a 포함관계 
 *  - A has a B
 *  - StudentManager has a Student
 *  
 * is a 상속관계
 */
public class StudentManager {
	
	public static final int MAX_STUDENT = 100;
	
	private Student[] arr = new Student[MAX_STUDENT];
	private int idx = 0; //학생 인덱스 변수
	private Scanner sc = new Scanner(System.in);
	
	public void manageStudent() {
		System.out.println("-----학생관리 시작-------");
		
		//1. 사용자 입력값으로 학생객체 생성
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = inputStudent();
//		}
		
		while(true) {
			arr[idx] = inputStudent();
			idx++;
			
			System.out.print("추가입력하시겠습니까? (y/n): ");
			char yn = sc.next().charAt(0);
			if(yn == 'n') {
				break;
			}
		}
		
		//2. 학생 객체 출력
		printStudent();
	}
	
	
	/**
	 * 2. 배열 인덱스 변수 idx
	 */
	public void printStudent() {
		for(int i = 0; i < idx; i++) {
			System.out.println(arr[i].print());
		}
	}
	
	/**
	 * 1. null여부 검사후 print 메소드 출력
	 */
	public void printStudent_() {
		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i].print());//arr[i]는 주소값나오므로 원하는 프린트내용이 나오려면 arr[i].print()
//			System.out.println(i+" : "+arr[i]);
			if(arr[i]!=null) {
				System.out.println(arr[i].print());
			}else {
				break;
			}
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
}
