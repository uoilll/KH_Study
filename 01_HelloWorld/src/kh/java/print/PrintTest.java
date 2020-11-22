package kh.java.print;

//클래스
public class PrintTest {

	//메소드
	public static void main(String[] args) {
		
		PrintTest p = new PrintTest();
		p.printValueTest();
		
//		p.printTest();
		
//		p.escapingTest();		
		
//		p.shakeIt();
	}
	
	
	/**
			"ShakeIt 알람"
	--------------------------------------------
		흔들기	쏴리질러	터치하기	원터치
	--------------------------------------------
	아침부터 쌩쑈를 해야 알람을 끌수 있음.
		
	 */
	//메소드
	public void shakeIt() {
		System.out.println("\t\t\"ShakeIt 알람\"\n"
				+"--------------------------------------------\n"
				+"\t흔들기\t쏴리질러\t터치하기\t원터치\n"
				+"--------------------------------------------\n"
				+ "아침부터 썡쑈를 해야 알람을 끌수 있음");
	}
	
	
	/**
	 * escape(탈출하다) 문자 
	 * 인쇄되지 않거나 키보드로 표현 불가능한 기능성문자를 표현
	 * \(역슬래시) + 문자
	 * 
	 * - \n : 개행처리
	 * - \t : 탭처리(tab)
	 * - \r : carriage return 
	 * 		  \r\n = \n과 같은 처리
	 * - \\ : \(역슬래시)를 문자 그대로 사용
	 * - \"  
	 * - \' 
	 * 
	 */
	//메소드
	public void escapingTest() {
		
		System.out.println("가\n나\t다");
		
		System.out.println("a\\b\\c\\d"); //a\b\c\d
		System.out.println("그는 말했다. '안녕~'");
		System.out.println("그는 말했다. \"안녕~\""); //그는 말했다. "안녕~"
		
		System.out.println("C:\\Workspaces\\java_workspace"); //C:\Workspaces\java_workspace		
	}
	
	
	//메소드
	public void printTest() {
		
		//출력메소드
		//println 출력 + 줄바꿈
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		
		//print 출력
		System.out.print(1);
		System.out.print(2);
		System.out.print(3);
		
		//\n은 개행문자 (줄바꿈 처리 문자) (escape)
		System.out.print("\n" + 1 + "\n\n"); //\n\n 연속 두번 줄바꿈
		System.out.print(2 + "\n");
		System.out.print(3);		
	}
	
	
	//메소드
	public void printValueTest() {
		
		//숫자
		System.out.println(123);
		System.out.println(45.678);
		System.out.println(12 + 34); // 12 + 34 우선 계산된 후, 결과가 println에 전달된다.
		System.out.println(46);
		System.out.println(1 + (3 * 2));
		
		//문자 (딱 한개의 문자) : 'a' 'b' '가' '나' '馬' '*' 
		//''(X) 'ab'(X)
		//문자열 (0개 이상의 문자) : "" "안녕" "korea"
		System.out.println('a');
		System.out.println('馬');
		System.out.println("안녕하세요");
		
		//문자|문자열은 더하기 연산 지원
		System.out.println('a' + "bcde");
		System.out.println("어디" + "가세요" + "?");
		//문자열과 숫자의 더하기 연산은 문자열로 처리된다.
		System.out.println(12 + "4"); //12는 숫자 "4"는 문자 그러므로 "124"
		System.out.println(1 + 2 + "3"); //3+"3"=>33"
		System.out.println("1" + 2 + 3); //"1"+2=>"12", "12"+3=>"123"
		
		//문자는 숫자와 만나면, 숫자로 처리된다.
		//문자는 문자열과 만나면, 문자열로 처리된다.
		System.out.println('a' + 1); //98
		System.out.println('a' + "가나다"); //a가나다
		
		//ASCII Code 아스키코드
		//문자를 숫자로 변환하기위한 약속 (매핑) : a=97 b=98...
		System.out.println('c' + 3); //99+3=102
		System.out.println('Z' - 3); //90=3=87
		System.out.println('0' + 3); //38+3=51
		System.out.println('A' + 'a'); //65+97=162
	}
	
}
