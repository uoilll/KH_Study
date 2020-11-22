package kh.java.test.array;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Test4 t = new Test4();
//		t.test1();
		t.test2();

	}
	
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("전화번호 입력: ");
		String phone = sc.next();
		System.out.println(phone.substring(0, 3)+"****"+phone.substring(7, 11));
	}

	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("전화번호 입력: ");
		String phone = sc.next();
		
		
		final int numCnt = 11;	
		char[] arr1 = new char[numCnt];
//		char[] arr1 = new char[11];
		char[] arr2 = arr1.clone();
		
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = phone.charAt(i);
		}
		for(int i = 3; i < 7; i++) {
			arr2[i] = '*';
		}
				
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]);
		}
		
	}
}
