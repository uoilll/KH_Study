package kh.java.oop.field;

public class IphoneMain {
	
	/**
	 * 클래스변수 : 프로그램시작시(해당 클래스가 최초 사용시) ~ 프로그램 종료시
	 * 인스턴스변수 : 객체생성시 ~ 객체소멸시(가비지컬렉터에 의한 삭제)
	 * 지역변수 : 메소드호출시 ~ 메소드 종료시
	 */

	public static void main(String[] args) {
		
		Iphone hong = new Iphone();
		hong.setOwner("홍길동");
		hong.setPhone("01012341234");
		
		Iphone sin = new Iphone();
		sin.setOwner("신사임당");
		sin.setPhone("01098769876");
		
		System.out.printf("%s : %s\n",hong.getOwner(),hong.getPhone());
		System.out.printf("%s : %s\n",sin.getOwner(),sin.getPhone());
		
		//static
//		hong.width = 15;
//		System.out.println(hong.width);
//		System.out.println(sin.width);
		System.out.println(Iphone.WIDTH);
		System.out.println(Iphone.HEIGHT);
//		Iphone.WIDTH = 13; //상수이므로 값변경 불가
		
		hong.heySiri(2, 10);
		sin.heySiri(3, 5);
		
		
		//홍 아이폰 객체 삭제
		hong = null;
	}

}
