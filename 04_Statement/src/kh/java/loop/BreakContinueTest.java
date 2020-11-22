package kh.java.loop;

import java.util.Scanner;

/**
 * break : 반복문을 끝내는 구문. 현재블럭을 빠져나간다.
 * 
 * continue : 이하 구문을 실행하지 않고, 반복문을 다시 실행
 */
public class BreakContinueTest {

	public static void main(String[] args) {
		BreakContinueTest b = new BreakContinueTest();
//		b.test1();
//		b.test2();
//		b.test3();
		b.test4();

	}
	
	// 1~100까지 수 중에 맞추기 up down 게임
	public void test4() {
		Scanner sc = new Scanner(System.in);
		int rndNum = (int)(Math.random() * 100 + 1);
		System.out.println("[ "+ rndNum + " ]");
		while(true) {
			System.out.print("숫자를 입력하세요(1~100): ");
			int num = sc.nextInt();
			
			if(num > rndNum) { //큰수를 말한 경우
				System.out.println("Down!");
			}else if(num < rndNum) { //작은수 말한 경우
				System.out.println("Up!");
			}else { //정답
				System.out.println("정답입니다.");
				break;
			}
		}
	}
	
	/**
	 * @실습문제 :
	 * 1부터 사용자 입력까지 홀수의 합을 출력하세요.
	 */
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력> ");
		int num = sc.nextInt();
		
		int i = 1;
		int sum = 0;
		
		while(true) {
			
			if(i % 2 == 1) {
				sum += i;
			}
			if(i == num) {
				break;
			}
			i++;
		}
		System.out.println("1부터 "+num+"까지 홀수의 합은 "+sum);
	}
	
	//1부터 100까지 짝수만 출력
	public void test2() {
		//방법1
		int i = 0;
		while(i < 100) {
			i++;
			//홀수 일때는 반복문을 건너뛰기
			if(i % 2 != 0) {
				continue;
				//이하구문을 실행하지 않고 반복문 다시 실행
				//while 조건식으로 이동, for문은 증감식으로 이동
			}
			System.out.println(i);
		}
		System.out.println("-----------");
		//방법2
		i = 1;
		while(i <= 100) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}
	
	//1부터 사용자입력값까지 출력
	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력> ");
		int num = sc.nextInt();
		
		int i = 1;
		while(i <= num) {
			System.out.println(i);
			i++;
		}
		System.out.println("----------");
		i = 1;
		while(true) {
			System.out.println(i);
			
			//반복문 중지 조건식
			if(i == num) {
				break;
			}
			
			i++;
		}
	}

}
