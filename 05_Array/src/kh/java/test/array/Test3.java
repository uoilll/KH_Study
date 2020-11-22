package kh.java.test.array;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Test3 t = new Test3();
		t.test();

	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력값: ");
		String str = sc.next();
		
		System.out.print("검색값: ");		
		char ch = sc.next().charAt(0);
		
		char[] arr = new char[str.length()]; //검색값을 입력값까지할당
		for(int i = 0; i < str.length(); i++) { //요소 값 대입
			arr[i] = str.charAt(i);
		}
		
		//갯수세기
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(arr[i] == ch) {
				count++;
			}
		}
		
		System.out.println("출력: 입력하신 문자열 "+str+"에서 찾으시는 문자 "+ch+"는(은) "+count+"입니다.");
	}

}
