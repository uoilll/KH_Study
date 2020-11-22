package com.oop.emp.run;

import java.util.Scanner;

import com.oop.emp.model.Employee;

public class EmpTest2 {
	//여러메소드에서 사용할 수 있도록 멤버변수로 선언
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		EmpTest2 t = new EmpTest2();
		t.mainMenu();
		
	}

	public void mainMenu() {
		Employee e = null;
		String menu = "******* 사원 정보 관리 프로그램 **********\n"
				    + "1. 새 사원 정보 입력\n"
				    + "2. 사원 정보 삭제\n"
				    + "3. 사원정보 출력\n"
				    + "9. 끝내기\n"
				    + "*************************************\n"
				    + "선택하세요 =>";
		
		int choice = 0;
		while(true){
			System.out.print(menu);
			choice = sc.nextInt();
			switch (choice) {
				case 1:
					e = new Employee();
					e.empInput();
					break;
				case 2: 
					//사원정보삭제는 참조주소값을 삭제한다.
					//실제 heap영역의 객체 삭제는 garbage collector가 담당.
					e = null; 
					System.out.println("사원정보가 삭제되었습니다.");
					break;
				case 3: 
					//사원정보 미입력시 출력하지 않도록함.
					//NullPointerException 유발
					if(e==null) {
						System.out.println(">>먼저 사원정보를 입력하세요.");
						break;
					}else {	
						e.empOutput();
						break;
					}
			}
			if(choice==9) break;
		}

	}

}
