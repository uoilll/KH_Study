package kh.java.polymorphism.animal;

public class AnimalMain {

	public static void main(String[] args) {

		AnimalMain am = new AnimalMain();
//		am.test1();
		am.test2();
//		am.test3();
//		am.test4();
	}
	
	/**
	 * 다형성과 오버라이딩 
	 * 
	 * 타이거와 라이언 클래스에 say()메소드작성하고 오버라이드 만들어줌
	 * 
	 * 동적바인딩
	 *  - 컴파일시 정적바인딩된 메소드를 실행하면 실제 객체타입기준으로 메소드를 동적으로 실행하는 것.
	 */
	public void test4() {
//		Tiger tiger = new Tiger();
//		tiger.say();
//		
//		Animal animal = tiger;
//		animal.say(); //동적바인딩 //안녕하세요. 호랑이입니다.
		
		Animal[] arr = new Animal[10];
		for(int i = 0; i < arr.length; i++) {
			if(i % 2 == 0) {
				arr[i] = getTiger();
			}else {
				arr[i] = getLion();
			}
		}
		for(Animal a : arr) {
			a.say();
		}
		
	}
	
	
	/**
	 * 1. 부모타입 변수
	 * 2. 매개변수 
	 * 3. 리턴값
	 */
	public void test3() {
		//1. 부모타입변수, 부모타입배열
		Animal[] arr = new Animal[3];
		arr[0] = new Tiger();
		arr[1] = new Lion();
		arr[2] = new Tiger();
		
		//forEach 반복문 (향상된 for문)
		for(Animal a : arr) { 
//			System.out.println(a); // kh.java.polymorphism.animal.Tiger@2a139a55이런식으로 출력
			
			//적절치 않은 타입으로 형변환시 ClassCastException 오류 
//			((Lion)a).kick();//오류
			
			if(a instanceof Tiger) { //a 가 Tiger 냐??
				//true이면 Tiger로 형변환 가능
				((Tiger)a).punch();
			}else if(a instanceof Lion) { //a 가 Lion 이냐??
				//true이면 Lion으로 형변환 가능
				((Lion)a).kick();
			}
		}
		
		//2. 매개변수
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		
		attack(tiger);
		attack(lion);	
		
		//3. 리턴값 처리
		//다형성 처리하면 get타이거랑 get라이언을 에니몰에 담을 수 있다.
		Animal a1 =  getTiger();
		Animal a2 = getLion();
	}
	
	public Tiger getTiger() {
		return new Tiger(); // 새로운 tiger객체를 리턴
	}
	public Lion getLion() {
		return new Lion(); // 새로운 lion객체를 리턴
	}
	
//	public void attack(Tiger t) {}
//	public void attack(Lion l) {}
	//위에 타이거 라이언 따로 해주는것 대신 에니몰로 매개변수를 준 attack 메소드 만들면 2. 매개변수에서 attack(tiger);attack(lion);가 에러 안남
	public void attack(Animal a) {
		
	}

	public void test2() {
		Tiger tiger = new Tiger();
		//여러형태의 변수에 담길수 있다 : 다형성
		Animal animal = tiger;
		Object obj = tiger;
		//tiger > aniaml > object
	}
	
	/**
	 * 다형성
	 * 	- 상속을 이용한 기술
	 *  - 자식타입 객체를 부모타입 참조변수에 대입해 제어하는 것
	 */
	public void test1() {
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		
		//부모타입참조변수 <- 자식타입객체
		//암묵적 형변환 : Upcasting (자동으로 일어남)
		Animal a1 = new Tiger();
		Animal a2 = new Lion();
		
		tiger.say();
		tiger.punch();
		
		a1.say();
//		a1.punch(); // 자식객체를 부모타입 참조변수에 담으면 자식클래스에서 선언된 메소드는 사용할 수 없다.
		
		lion.say();
		lion.kick();
		
		a2.say();
//		a2.kick;
		
		System.out.println("---------------------");
		
		//자식타입으로 다시 형변환하면 사용가능하다.
		//부모타입 -> 자식타입 : 명시적 형변환 할 것. 명시적 형변환 Downcasting
		Tiger a1Tiger = (Tiger)a1;
		Lion a2Lion = (Lion)a2;
		
		a1Tiger.punch();
		a2Lion.kick();
		
		//힙영역의 동일한 객체를 가리킨다.
		System.out.println(a1 == a1Tiger); //true 둘이 객체 같다.
		System.out.println(a2 == a2Lion);
		
	}
}
