package com.kh.test.loop;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Test6 t = new Test6();
		t.test();

	}

	public void test() {
		Scanner sc = new Scanner(System.in);
		String menu = "메뉴\r\n" + 
				"    김밥류 ===================\r\n" + 
				"    1.원조김밥===========1500원\r\n" + 
				"    2.치즈김밥===========2000원\r\n" + 
				"    3.참치김밥===========2300원\r\n" + 
				"    라면류 ===================\r\n" + 
				"    4.그냥라면===========3000원\r\n" + 
				"    5.치즈라면===========3500원\r\n" + 
				"    6.짬뽕라면===========4000원\r\n" + 
				"    분식류 ===================\r\n" + 
				"    7.떡볶이=============2500원\r\n" + 
				"    8.순대==============2500원\r\n" + 
				"    9.오뎅==============1000원\r\n" + 
				"    기타 ====================\r\n" + 
				"    10.음료수===========1000원\r\n"+
				"선택하세요 > ";
		String name = "";
		int total = 0;
		int num = 0; 
		int choice = 0;
		int sum = 0; 
		char yn = 'n';
		String all = ""; 
		do {
			System.out.print(menu);
			choice = sc.nextInt();
			System.out.print("수량을 선택하세요.> ");
			num = sc.nextInt();
			
			switch(choice) {
				case 1: name = "원조김밥"; sum += 1500*num; break;
				case 2: name = "치즈김밥"; sum += 2000*num; break; 
				case 3: name = "참치김밥"; sum += 2300*num; break; 
				case 4: name = "그냥라면"; sum += 3000*num;  break; 
				case 5: name = "치즈라면"; sum += 3500*num; break; 
				case 6: name = "짬뽕라면"; sum += 4000*num; break; 
				case 7: name = "떡볶이"; sum += 2500*num; break; 
				case 8: name = "순대"; sum += 2500*num; break; 
				case 9: name = "오뎅"; sum += 1000*num; break; 
				case 10: name = "음료수"; sum += 1000*num; break;
				default : System.out.println("잘못입력하셨습니다");
			}
			total += sum;
			all += (name+": "+num+"개 - "+sum+"원\n");
			System.out.print("더주문하시겠습니까? (y/n) > ");
			yn = sc.next().charAt(0);						
		}while(yn=='y');
	System.out.println("주문하신 정보는 다음과 같습니다.");
	System.out.println("----------------------------");
	System.out.println(all);
	System.out.println("----------------------------");
	System.out.println("합계: "+total);
	}
}
