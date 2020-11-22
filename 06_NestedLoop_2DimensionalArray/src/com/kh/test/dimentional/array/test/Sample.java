package com.kh.test.dimentional.array.test;

import java.util.Random;

public class Sample {

	public static void main(String[] args) {
		Sample s = new Sample();
//		s.exercise1();
		s.exercise2();

	}
	
	public void exercise2() {								
		int[][] arr = new int[4][4];						// 행렬 생성
		int sum = 0;										// 합계용 변수
		
		
		for(int i = 0; i < arr.length-1; i++) {
			sum = 0; 									//for문돈 sum 초기화시키기
			
			for(int j = 0; j < arr[0].length-1; j++) {
				// 합계 전 랜덤 변수 할당
				int rnd = (int)(Math.random()*100+1);
				arr[i][j] = rnd;
				sum += rnd;									// 해당 행의 열 합계
			}
			arr[i][3] = sum;							// 합계출력해야 하는 열부분
			arr[arr.length-1][arr[0].length-1] += sum;
		}
		
		for(int j = 0; j < arr[0].length-1; j++) {
			sum = 0;
			for(int i = 0; i <arr.length-1; i++) {
				int rnd = (int)(Math.random()*100+1);
				arr[i][j] = rnd;
				sum += rnd;	
				
			}
			arr[3][j] = sum;
			arr[arr.length-1][arr[0].length-1] += sum;
		}
	    
		
		//값읽기
	    String header = "\t0열\t1열\t2열\t3열\n"
	                 + "-----------------------------------------------------------";
	    System.out.println(header);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i+"행\t");
			for(int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]+"\t"); 			// 행열출력
			}
			System.out.println();
		}
	}
	
////////////////////////////////////////////////////////////////////////////////
	public void exercise1() {								
		int[][] arr = new int[3][4];						// 행렬 생성
		int sum = 0;										// 합계용 변수
		
		for(int i = 0; i < arr.length; i++) {
			sum = 0; //for문돈 sum 초기화시키기
			
			for(int j = 0; j < arr[0].length-1; j++) {
				// 합계 전 랜덤 변수 할당
//				arr[i][j] = (int)(Math.random()*100+1);
//				sum += arr[i][j];							// 해당 행의 열 합계
				
				int rnd = (int)(Math.random()*100+1);
				arr[i][j] = rnd;
				sum += rnd;									// 해당 행의 열 합계
			}
			arr[i][3] = sum;								// 합계출력해야 하는 열부분
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]+" "); 			// 행열출력
			}
			System.out.println();
		}
	}
	
	
}
