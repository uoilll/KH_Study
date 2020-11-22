package kh.java.multi.dimentional.array;

import java.util.Scanner;

public class JaggedArrayTest {

	public static void main(String[] args) {
		JaggedArrayTest j = new JaggedArrayTest();
//		j.test1();
		j.test2();

	}
	
	/**
	 * @실습문제
	 *  3행짜리 2차원배열을 선언후, 
	 *  각 행별 열의 개수는 사용자에게 입력받는다.
	 *  1~100사이의 난수를 대입후,
	 *  5의 배수만 출력
	 *  5의 배수가 없다면 "5의 배수가 존재하지 않습니다" 출력
	 */
	public void test2() {
		int[][] arr = new int[3][];
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1~100중 1행의 열 입력> ");
		int num = sc.nextInt();
		arr[0] = new int[num];
		
		System.out.print("1~100중 2행의 열 입력> ");
		int num2 = sc.nextInt();
		arr[1] = new int[num2];
		boolean flag = false ;//5의 배수가 존재하는가?

		System.out.print("1~100중 3행의 열 입력> ");
		int num3 = sc.nextInt();
		arr[2] = new int[num3];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {				
				arr[i][j] = (int)(Math.random()*100+1);
				
				if(arr[i][j] % 5 == 0) {
					flag = true;
					System.out.printf("arr[%d][%d] = %d\n",i,j,arr[i][j]);
				}				
			}					
		}
		if(!flag) {
			System.out.println("5의 배수가 존재하지 않습니다");
		}
	}

	public void test1() {
		//2차원배열의 크기를 지정하지 않는다.
		int[][] arr = new int[2][];
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		//각각할당
		arr[0] = new int[3];
		arr[1] = new int[2];
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		//요소별 값할당
		arr[0][0] = 20;
		arr[0][1] = 30;
		arr[0][2] = 40;
		
		arr[1][0] = 100;
		arr[1][1] = 200;
//		arr[1][2] = 300; //에러
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("arr[%d][%d] = %d\n", i , j ,arr[i][j]);
			}
		}
		
	}
}
