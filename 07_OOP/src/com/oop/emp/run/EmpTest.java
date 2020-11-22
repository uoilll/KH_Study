package com.oop.emp.run;

import java.util.Scanner;

import com.oop.emp.model.Employee;

public class EmpTest {

	public static void main(String[] args) {
		Employee emp = new Employee();
		
		Scanner sc = new Scanner(System.in);
		String memnu = ("******* 사원 정보 관리 프로그램 ********\n"
				+"1. 새 사원 정보 입력 \n"
				+"2. 사원 정보 삭제 \n"
				+"3. 사원정보 출력 \n"
				+"9. 끝내기\n"
				+ "선택 > ");
		
		int choice = 0;
		char yn = 'n';
		
		do {
			System.out.print(memnu);
			choice = sc.nextInt();
			switch(choice) {
			case 1: emp.empInput(); System.out.println("저장되었습니다."); break;
			case 2: emp.del(); System.out.println("삭제되었습니다."); break;
			case 3: emp.empOutput(); System.out.println("끝"); break;
			case 9: break;
			default : System.out.println("잘못입력하셨습니다.");
			}
			System.out.print("정보를 더 보시겠습니까? (y/n)> ");
			yn = sc.next().charAt(0);
		}while(yn == 'y');

	}

}
