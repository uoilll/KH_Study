package kh.java.array;

/**
 * 변수 : 하나의 자료형, 한가지 값을 보관
 * 
 * 배열 : 하나의 자료형, 여러가지 값을 보관
 *
 */
public class ArrayTest {

	public static void main(String[] args) {
		
		ArrayTest a = new ArrayTest();
//		a.test1();
//		a.test2();
//		a.test3();
//		a.test4();
//		a.test5();
//		a.test6();
		a.test7();
	}
	
	/**
	 * 배열 초기화
	 *  - 배열 할당 및 값대입
	 */
	public void test7() {
//		int[] arr = new int[5];
//		arr[0] = 1;
//		...
//		arr[4] = 5;		
		int[] arr1 = {1,2,3,4,5};
		
		int[] arr2 = new int[]{1,3,5}; //배열 크기를 지정하지 말것
	}
	
	/**
	 * 배열의 특징
	 *  - 배열의 크기는 변경할 수 없다.
	 *  - 배열의 삭제는 참조형변수에 null을 대입해서 처리
	 */
	public void test6() {
		int[] arr1 = new int[5];
		System.out.println(arr1.length);
		//hashCode : 객체가 가진 고유값(주소값 아님)
		System.out.println(arr1.hashCode());
		
		//새로운 배열을 할당
		arr1 = new int[10];
		System.out.println(arr1.length);
		System.out.println(arr1.hashCode());
		
		//배열삭제
		arr1 = null;
		
		//참조형변수가 heap에 가리키는 객체가 없을때(null인 경우)
		//메소드, 속성등을 참조하면 NullPointerException 예외 발생
//		System.out.println(arr1.length);//에러,NullPointerException 예외 발생
//		System.out.println(arr1.hashCode());
		
		System.out.println("프로그램종료");
	}
	
	/**
	 * @실습문제
	 *  알파벳 소문자배열을 만들고,
	 *  모든요소를 한줄로 출력
	 *  a, b, c, d, e, ... , z (26개)
	 */
	public void test5() {
		//1.배열생성
		char[] arr = new char[26];
		
		//2.요쇼값대입 , 3. 요소값출력

//		char ch = 'a';
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] += ch++;
//			System.out.print(arr[i]);
//			if(i != arr.length - 1) {
//				System.out.print(", ");
//			}
//		}
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (char)('a'+i);
			System.out.print(arr[i]);
			System.out.print( (i<arr.length-1) ? ", " : "" );
		}
	}
	
	public void test4() {
		//1.배열선언 및 할당
		int[] numArr = new int[8];
		
		//2.요소의 값대입
		//규칙이 있는경우만 반복문 사용
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = (i + 1); //1~8출력
			numArr[i] = (i + 1) * 10; //10 20 30 40 50 60 70 80 출력
			numArr[i] = (i + 1) * 2;//i*2+2도됨 //2 4 6 8 10 12 14 16 출력
		}
		
		//3.요소값사용
		//2, 4, 6, 8, 10, 12, 14, 16으로 출력
		
//		System.out.print(numArr[0]);
//		for(int i = 1; i < numArr.length; i++) {
//			System.out.print(", "+numArr[i]);			
//		}
		
		for(int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i]);
			if(i != numArr.length-1) {
				System.out.print(", ");
			}			
		}
		
		
		
	}
	
public void test3() {
		
		String[] strArr = new String[10];
		strArr[0] = "홍길동";
		strArr[1] = "둘리";
		strArr[2] = "도우너";
		
//		System.out.println(strArr[0]);
//		System.out.println(strArr[1]);
//		System.out.println(strArr[2]);
		
//		System.out.println(strArr[10]); // ArrayIndexOutOfBoundsException:
		
		System.out.println(strArr.length);
		//배열(객체)는 length 속성이 있다.
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
	}
	
	/**
	 * @실습문제 : 
	 *  문자배열을 이름길이로 생성하고,
	 *  각 인덱스에 이름을 대입후 출력할 것.
	 */
	public void test2() {
		//1. 배열선언
//		char[] nameArr;
		
		//2. heap에 배열할당
//		nameArr = new char[3];
		
		char[] nameArr = new char[3];
		
		//3. 요소에 값대입
		nameArr[0] = '홍';
		nameArr[1] = '길';
		nameArr[2] = '동';
		
		//4. 출력
		System.out.println(""+nameArr[0]+nameArr[1]+nameArr[2]);
		System.out.println(nameArr[1]);
		System.out.println(nameArr[2]);
	}
	
	public void test1() {
		//변수공간은 초기화되지 않고, 쓰레기값이 들어있다.
		int kor;
		int eng;
		int math;
		
		//callstck의 변수는 초기화(값대입)하지 않고는 사용할 수 없다.
//		System.out.println(kor);
//		System.out.println(eng);
//		System.out.println(math);
		
		kor = 80;
		eng = 100;
		math = 90;
		
		
		//1. 배열변수 선언
		int[] arr;
		
		//2. 배열 할당(heap영역에 확보)
		//배열크기를 반드시 지정할 것.
		//heap은 자료형별 기본값으로 초기화된다.
		//int : 0, double : 0.0, boolean : false, char : ' '
		//참조형 : null
		arr = new int[3];
		
		//배열 요소 값대입
		arr[0] = 80;
		arr[1] = 100;
		arr[2] = 90;
		
		//배열 요소 값 확인
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		
		
	}
	
	
}
