package com.kh.test.loop;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Test4 t = new Test4();
//		t.test();
//		t.test_1();
		t.test2();

	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력> ");
		String str = sc.next(); 
		
		System.out.print("검색할 문자 입력> ");
		char ch = sc.next().charAt(0);		
		
		int num = 0; // 문자열에서 검색할 문자가 해당되는 문자 갯수
		
		if((ch>=65 && ch<=90) || (ch>=97 && ch<=122)) {
			for(int i = 0; i < str.length(); i++) {
				if(ch == str.charAt(i)) {// str에 i번째 문자와 ch가 같다면
					num += 1;
				}
			}
		}else {
			System.out.println("영문자가 아닙니다.");
			return;
		}
		
		System.out.println(ch+"가 포함된 갯수: "+num+"개");
	}
	
	//while사용하기
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력> ");
		String str = sc.next(); 
		
		System.out.print("검색할 문자 입력> ");
		char ch = sc.next().charAt(0);		
		
		int num = 0; // 문자열에서 검색할 문자가 해당되는 문자 갯수
		
		if((ch>=65 && ch<=90) || (ch>=97 && ch<=122)) {
			int i = 0;
			while(i<str.length()) {
				if(ch == str.charAt(i)) {
					num +=1 ;
				}
				i++;
			}
		}else {
			System.out.println("영문자가 아닙니다.");
			return;
		}
		
		System.out.println(ch+"가 포함된 갯수: "+num+"개");
	}
	
	
	
	//다른풀이
	private void test_1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("> 문자열을 입력 : ");
		String str = sc.nextLine();
		
		System.out.print("> 검색할 문자 입력 : ");
		char srchChar = sc.next().charAt(0);
		
		// 2.문자 유효성 체크
		if((srchChar >= 'A' && srchChar <='Z') || (srchChar >= 'a' && srchChar <='z')) {
			// 1.개수보관할 변수
			int cnt = 0;
			
			for(int i=0; i<str.length(); i++){
				char c = str.charAt(i);
				if(c==srchChar)
					cnt++;
			}
			
			System.out.println("'"+srchChar+"'가 포함된 갯수 : "+cnt+"개");
		}
		else {
			System.out.println("영문자가 아닙니다.");
		}
		
		
		
		
	}

}
