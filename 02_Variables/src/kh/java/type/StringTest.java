package kh.java.type;

public class StringTest {

	/**
	 * 자료형
	 * - 기본형 (boolean char byte short int long float double)
	 * - 참조형
	 */
	public static void main(String[] args) {
		
		//기본형변수
		boolean b = true;
		char c = '캬';
		String str = "안녕하세요"; //값그대로 대입하여 출력
		
		//참조형변수
		StringTest st = new StringTest();
		String s = new String("안녕"); // new연산자로 값 전달해서 출력
		
		//"지하철" (metro1과 metro2 결과값은 같다)
		String metro1 = "지하철";
		String metro2 = new String("지하철");
		
		System.out.printf("metro1 = %s\n", metro1);
		System.out.printf("metro2 = %s\n", metro2);
	}

}
