package kh.java.random;

import java.util.Random;
import java.util.Scanner;

/**
 * 난수 생성
 *  - 1. Math.random()
 *  - 2. java.util.Random클래스의 메소드
 */
public class RandomTest {

	public static void main(String[] args) {
		
		RandomTest r = new RandomTest();
//		r.test1();
		r.test2();
//		r.test3();

	}
	
	
	/**
	 * 동전 앞뒤맞추기
	 */
	public void test3() {
		//1.사용자 입력값
		Scanner sc = new Scanner(System.in);
		System.out.print("동전 앞뒤 입력(1. 앞 2. 뒤) > ");
		int userInput = sc.nextInt();
		
		//2.동전(난수) 던지기
//		int coin = (int)(Math.random() * 2 + 1);
		Random rnd = new Random();
		int coin = rnd.nextInt(2) + 1;		
		
		//3.값비교
		System.out.println("---------");
		System.out.println("결과: "+(coin == 1 ? "앞" : "뒤"));
		System.out.println(userInput == coin ? "맞췄습니다." : "틀렸습니다.");
	}
	
	
	/**
	 * Math.random()
	 */
	public void test2() {
		//0.0(inclusive 이상)과 1.0(exclusive 미만)사이의 난수 발생
		double rndNum = Math.random();
		System.out.println(rndNum);
		
		//1~10 사이의 난수
		rndNum = Math.random() * 10 + 1;//1.0이상 11미만
		int result = (int)rndNum;//뒤에 소수점 없애기 정수로만 출력
		System.out.println(rndNum);
		System.out.println(result);
	}
	

	/**
	 * Random
	 *  - 경우의 수
	 *  - 시작값(최소값)
	 */
	public void test1() {
		Random random = new Random();
		//정수 난수 가져오기
		//random.nextInt(경우의 수)+시작값
		
		//1~10까지 10개의 수중에 리턴값
		int rndNum = random.nextInt(10)+1;
		System.out.println(rndNum);
		
		//1~100사이 난수 출력
		int rndNum2 = random.nextInt(100)+1;
		System.out.println(rndNum2);
		
		//50~100사이의 난수 출력
		int rndNum3 = random.nextInt(51)+50;
		System.out.println(rndNum3);
		
		//가위0 바위1 보2
		int rsp = random.nextInt(3);
		System.out.println(rsp);
		String rspStr = rsp == 0 ? "가위" : (rsp == 1 ? "바위" : "보");
		System.out.println(rspStr);
		
		//타입별 난수 지원
		System.out.println(random.nextBoolean()); //true|false
		System.out.println(random.nextDouble());//0.0이상1.0미만의 난수 반환
	}
}
