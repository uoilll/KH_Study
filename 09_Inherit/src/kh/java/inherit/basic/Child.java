package kh.java.inherit.basic;

public class Child extends Parent {

	/**
	 * 물려받은 메소드를 다시 쓰기
	 * overriding
	 */	
	public void say() {
		System.out.println("안녕하세요, 자식입니다.");
	}
	
	//부모에 없는 메소드 추가
	public void doGame() {
		System.out.println("자식은 게임을 즐~");
	}
}
