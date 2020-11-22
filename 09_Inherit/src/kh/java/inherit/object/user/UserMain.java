package kh.java.inherit.object.user;

public class UserMain {

	public static void main(String[] args) {

		UserMain um = new UserMain();
		um.test1();
//		um.test2();
//		um.test3();
		
	}
	
	public void test3() {
		User user = new User("user", "1234");
		User copy = user.clone(); 
		//상속한 user에서는 사용 가능하지만 그 밖에선 사용 불가 사용하기위해 User클래스에 오버라이드해줌
		
		System.out.println(user); //[username = user, password = 1234]
		System.out.println(copy); // 위에와 같이 출력
		
		System.out.println(user == copy); //false // user와 copy는 출력은 같아도 다른 객체
	}
	
	/**
	 * equals()
	 * 객체간 동등비교 결과를 리턴
	 * 
	 * equals의 결과가 동일하다면, hashCode호출결과도 동일해야 한다.
	 */
	public void test2() {
		User u1 = new User("hong", "1234");
		User u2 = new User("hong", "1234");
		
		System.out.println(u1 == u2); //객체간 주소값 비교 //false
		System.out.println(u1.equals(u2)); //객체단위 비교 //false
		System.out.println(u1.hashCode()); //해쉬코드보기
		System.out.println(u2.hashCode()); 
		//u1과 u2의 해쉬코드는 다르다. user.java에서 오버라이드와 (username+password).hashCode();해주면서 동일한 해쉬코드를 만들어준다
		
	}
	
	/**
	 * toString()
	 * 객체가 문자열로 표현되야 할 때 자동으로 호출되는 
	 * Object의 메소드
	 */
	public void test1() {
		User u = new User("hong" , "1234");
		System.out.println(u); //[username = hong, password = 1234]
		System.out.println(u.toString()); //위랑 같음
		System.out.println(u.getClass().getName()); //kh.java.inherit.object.user.User
	}

}
