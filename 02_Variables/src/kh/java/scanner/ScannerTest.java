package kh.java.scanner;

import java.util.Scanner;

/**
 * java.util.Scanner는 jdk1.5부터 사용자입력값처리를 담당한다.
 * 이전에는 BefferedReader를 대체했다.
 * 
 * 사용자입력값 가져오기 + 형변환
 * 
 * 1. next계열
 * 2. nextLine 계열
 */
public class ScannerTest {

	public static void main(String[] args) {
		
		ScannerTest s = new ScannerTest();
//		s.test1();
//		s.test2();
		s.test3();
	}	
	
	
	/**
	 * @실습문제
	 * 사용자로부터 이름, 나이, 주소, 키(실수)를 입력받아 출력하세요.
	 */
	private void test3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름> ");
		String name = sc.next();
		
		System.out.print("나이> ");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("주소> ");
		String addr = sc.nextLine();
		
		System.out.print("키> ");
		double height = sc.nextDouble();
		
		System.out.printf("이름: %s\n 나이: %d\n 주소: %s\n 키:%.1f\n",name,age,addr,height);
		
	}


	/**
	 * nextLine계열
	 * 개행문자까지 읽어온 후, 개행문자를 제외한 문자열을 반환
	 * 
	 * 주의할점
	 * next - nextLine 연이어 사용할때,
	 * next : 공백/개행문자 전까지만 입력버퍼에서 읽어가므로, 개행문자 입력버퍼에 남는다.
	 * nextLine : 버퍼에 남은 개행문자를 읽어서 처리
	 */
	private void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름> ");
		String name = sc.next();
		
		//next -> nextLine연결시 개행문자 버리기
		sc.nextLine();
		
		System.out.print("주소> ");
		String addr = sc.nextLine();
		System.out.printf("이름: %s\n 주소: %s\n",name,addr);
		
//		System.out.print("문자열을 입력하세요> ");
//		String s = sc.nextLine();
//		System.out.printf("[%s]을 입력하셨습니다.\n", s);
		
	}
	
	
	/**
	 * next계열
	 *  - nextInt()
	 *  - nextDouble()
	 *  - nextBoolean()
	 *  - next()
	 */
	private void test1() {
		//System.in : 사용자 입력(키보드)
		//System.out : 시용자 표준출력(콘솔)
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("정수를 입력하세요> ");
//		int userNum = sc.nextInt();
//		System.out.printf("[%d]를 입력하셨습니다.\n", userNum);
		
//		System.out.print("실수를 입력하세요> ");
//		double userDouble = sc.nextDouble();
//		System.out.printf("[%f]를 입력하셨습니다.\n", userDouble);
		
//		System.out.print("논리형값을 입력하세요 (true | false)> ");
//		boolean userBool = sc.nextBoolean();
//		System.out.printf("[%b]를 입력하셨습니다.\n", userBool);
		
		//sc.nextChar()는 존재하지 않는다.
		//문자열을 읽어온 다음, 첫글자만 가져오기
//		System.out.print("한글자만 입력하세요> ");
//		String userInput = sc.next(); //문자열 가져오기
//		char ch = userInput.charAt(0);
//		char ch = sc.next().charAt(0);
//		System.out.printf("[%c]를 입력하셨습니다./n", ch);
		
		//문자열
		//사용자 입력값 중 공백/개행문자 전까지만 읽어온다.
		System.out.print("문자열을 입력하세요> ");
		String s = sc.next();
		System.out.printf("[%s]를 입력하셨습니다.\n", s);
		
		
	}

}
