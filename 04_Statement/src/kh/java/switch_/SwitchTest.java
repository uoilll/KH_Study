package kh.java.switch_;

import java.util.Scanner;

/**
 * if문 논리형에 따라 분기
 * switch 값에 따라 분기
 */
public class SwitchTest {

	public static void main(String[] args) {
		
		SwitchTest s = new SwitchTest();
//		s.test1();
//		s.test2();
//		s.test3();
		s.test4();
		s.test4_1();

	}
	
	
	/**
	 * @실습문제: 수도세 계산 프로그램
	 * 사용자에게 용도와 물사용량을 입력받아서, 수도세를 계산할것
	 *  - 사용요금 = 용도별 가격 * 사용량
	 *  - 수도세 = 사용요금 5%
	 *  - 총 납부금액 = 사용요금 + 수도세
	 *  
	 *  용도별 가격
	 *  1. 가정용 50원/liter
	 *  2. 상업용 45원/liter
	 *  3. 공업용 30원/liter
	 *  
	 *  상업용, 250L 사용시
	 *  출력결과 :
	 *  --- 총 사용요금 ---
	 *   - 상업용을 사용하고 계십니다.
	 *   - 사용요금 : 11250월
	 *   - 수도세 : 562원
	 *   - 총 납부금액 : 11812원
	 */
	public void test4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==사용하는 용도 선택==");
		System.out.println(" 1. 가정용 50원/liter 2. 상업용 45원/liter 3. 공업용 30원/liter");
		System.out.print("> ");
		
		int choice = sc.nextInt();
		
		System.out.println("사용량 입력(liter)");
		System.out.print("> ");
		
		int liter = sc.nextInt();
		
		int use = 0;
		
		double waterTax = use*0.05;
		
		double total = use+waterTax;
		
		String c = choice == 1? "가정용" : (choice == 2 ? "상업용" : "공업용");
		
		switch(choice) {
		case 1: use = 50*liter ; break;
		case 2: use = 45*liter ; break;
		case 3: use = 30*liter ; break;
		default : System.out.println("잘못 입력하셨습니다."); return;
		}
		
		
		System.out.println("--- 총 사용요금 ---");
		System.out.println(c+"을 사용하고 계십니다.");
		System.out.println("사용요금: "+use+"원");
		System.out.println("수도세: "+waterTax+"원");
		System.out.println("총납부금액: "+total+"원");
	}
	//실습문제 다른 풀이
	public void test4_1() {
		Scanner sc = new Scanner(System.in);
		String menu = "-------------------\n" + 
					  "1. 가정용 50원/liter\n" + 
					  "2. 상업용 45원/liter\n" + 
					  "3. 공업용 30원/liter\n" +
					  "--------------------\n" +
					  "용도 선택 > ";
		System.out.print(menu);
		int choice = sc.nextInt();
		System.out.print("사용량 입력(liter) > ");
		int used = sc.nextInt();
		
		int price = 0; //사용요금
		double tax = 0; //수도세
		int total = 0; //총납부금액
		String type = ""; //용도
		
		switch(choice) {
		case 1 : 
			price = 50 * used;
			type = "가정용";
			break;
		case 2 : 
			price = 45 * used;
			type = "상업용";
			break;
		case 3 : 
			price = 30 * used;
			type = "공업용";
			break;
		default : 
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		
		tax = price * 0.05;
		total = (int)(price + tax); 
		
		//결과출력
		System.out.println("--- 총 사용요금 ---\r\n" + 
						   "- " + type + "을 사용하고 계십니다.\r\n" + 
						   "- 사용요금 : " + price + "원\r\n" + 
						   "- 수도세 : " + tax + "원\r\n" + 
						   "- 총납부금액 : " + total + "원");
	
	}
	
	
	/**
	 * @실습문제 : 사용자로부터 회원등급을 입력받습니다.
	 * (골드, 실버 , 브론즈) 등급별로 선물을 부여하세요.
	 * 1. 골드 : 스마트 tv
	 * 2. 실버 : 전자렌지
	 * 3. 브론즈 : 전기다리미
	 */
	public void test3() {
		Scanner sc = new Scanner(System.in);
		
//		String str = "==자신의 회원등급을 선택하세요.==\n" 
//				+ "1. 골드 2. 실버 3. 브론즈\n"
//				+ "> ";
//		System.out.print(str);
		
		System.out.println( "==자신의 회원등급을 선택하세요.==");
		System.out.println("1. 골드 2. 실버 3. 브론즈");
		System.out.print("> ");
		
		int choice = sc.nextInt();
		String gift = "";
		
		switch(choice) {
		case 1: gift = "스마트tv"; break;
		case 2: gift = "전자렌지"; break;
		case 3: gift = "전기다리미"; break;
		default : System.out.println("잘못입력하셨습니다."); return;
		}
		
		//fall through현상
//		switch(choice) {
//		case 1: gift += "스마트tv, ";
//		case 2: gift += "전자렌지, "; 
//		case 3: gift += "전기다리미"; break;
//		default : System.out.println("잘못입력하셨습니다."); return;
//		}
		
		System.out.println("회원님은 [ "+gift+" ]에 당첨되셨습니다.");
		
	}
	
	
	public void test2() {
		Scanner sc = new Scanner(System.in);
		String menu = "=============\n"
				+ "1. 순대국\n"
				+ "2. 김치찌개\n"
				+ "3. 순두부찌개\n"
				+"-------------\n"
				+"> ";
		System.out.print(menu);
		
		int choice = sc.nextInt();
		//결과 문자열
		int price = 0;
		
		switch(choice) {
		case 1: price = 8000; break;
		case 2: price = 7000; break;
		case 3: price = 7000; break;
		default : System.out.println("잘못입력하셨습니다."); return;
		}
		
		System.out.println("가격은 [ "+price+" ]원 입니다.");
	}
	
	
	/*
	 * 괄호 안에는 byte, short, int, char, String, enum(열거형)등이 올수 있다.
	 *  - long, float, double 실수는 사용불가
	 *  - String은 jdk1.7부터 사용가능
	 * 
	 * switch(변수|계산식){
	 * 		case 값1:
	 * 			//실행문1
	 * 			break;
	 *  	case 값2:
	 * 			//실행문2
	 * 			break;
	 * 			...
	 * 		default : 
	 * 			//기본 실행문(모든 case에 해당되지 않는 경우)
	 * }
	 */
	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴를 선택하세요.");
		System.out.println("1.사과 2.바나나 3.오렌지");
		System.out.print("> ");
		
		int choice = sc.nextInt();
		//결과 문자열
		String color = "";
		
		switch(choice) {
		case 1:
			color = "빨간색";
			break; //현재 블럭을 빠져나가기
		case 2:
			color = "노란색";
			break;
		case 3:
			color = "주황색";
			break;
		default :
			System.out.println("잘못 입력하셨습니다");
			return;
		}
		System.out.println("선택한 과일의 색상은 [ " +color+ " ] 입니다.");
	}

}
