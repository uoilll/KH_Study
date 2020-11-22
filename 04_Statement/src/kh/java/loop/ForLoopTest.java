package kh.java.loop;

import java.util.Scanner;

/**
 * 반복문
 *  - for
 *  - while
 *  - do ~ while
 */
public class ForLoopTest {

	public static void main(String[] args) {
		ForLoopTest f = new ForLoopTest();
//		f.test1();
//		f.test2();
//		f.test3();
		f.test4();

	}
	
	
	/**
	 * 블럭 스코프
	 */
	public void test4() {
//		String name = "홍길동";
//		for(int i = 0; i < 3; i++) {
//			System.out.println(name);
//		}
		
		//1+2+3+4+5+6+7+8+9+10
//		int sum = 0;
//		for(int i =1; i<=10; i++) {
//			sum += i; //sum = sum + i
//		}
//		System.out.println(sum);
		
		//1부터 사용자가 입력한 양수까지의 합을 구하여라
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 >");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			sum += i; 
		}
		System.out.println(sum);
	}
	
	
	/**
	 * 이름을 반복 출력해드립니다.
	 */
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름입력> ");
		String name = sc.next();
		System.out.print("반복 횟수> ");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			System.out.println((i+1) + name);
		}
	}
	
	
	/**
	 * @실습문제: 구구단 2단
	 * 
	 *  2 * 1 = 2
	 *  2 * 2 = 4
	 *  ...
	 *  2 * 9 = 18
	 */
	public void test2() {
		int dan = 2;
		System.out.println("구구단 " + dan + "단");
		for(int i = 1; i < 10; i++) {
			System.out.println(dan + " * " + i + " = "+ dan*i);
		}
	}
	

	/**
	 * for(초기식; 조건식; 증감식){
	 * 		//반복실행구문
	 * }
	 * 
	 * - 초기식: for문실행시 최초 1회만 실행. 증감변수를 선언.
	 * - 조건식: 매턴마다 검사해서 true이면 반복구문 실행, false면 반복문 종료
	 * - 증감식: 매턴마다 증감변수 처리
	 * 
	 * 처리순서
	 * 1. 초기식
	 * 2. 조건식
	 * 3. 반복구문 실행
	 * 4. 증감식
	 * 
	 * 5. 조건식
	 * 6. 반복구문 실행
	 * 7. 증감식
	 * 	   ...
	 * 8. 조건식 false이면 반복문 중지
	 *  
	 *  
	 * - 몇번 반복할 것인가? 10
	 * - 증감변수는 어떻게 변화하는가? 11 ... 20
	 */
	public void test1() {
		for(int i = 11; i <= 20; i++) { //i++ 대신 i+=1(i=i+1) 사용가능
			System.out.println(i+" Hello World~");
		}	
		
		//10~1
		for(int i = 10; i >=1; i--) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		//1부터 20사이의 홀수 출력
		for(int i = 1; i <=20; i+=2) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		for(int i = 1; i <=20; i++) {
			if(i % 2 != 0) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println();
		
		//20 18 16 14 10 8 6 4 2 
		for(int i = 20; i>1; i-=2) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		for(int i = 20; i>0; i-=2) {
			if(i % 2 == 0) {
				System.out.print(i+" ");
			}
		}
		
		
	}
	
	
}
