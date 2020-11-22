package kh.java.test.array;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Test5 t = new Test5();
		t.test();

	}

	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호 입력: ");
		String num = sc.next();
		
		final int ssnCnt = 13;
		char[] arr1 = new char[ssnCnt];
//		char[] arr1 = new char[13];
		char[] arr2 = arr1.clone();
		
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = num.charAt(i);
		}
		for(int i = 7; i < 13; i++) {
			arr2[i] = '*';
		}
				
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]);
		}
		
	}
	
}
