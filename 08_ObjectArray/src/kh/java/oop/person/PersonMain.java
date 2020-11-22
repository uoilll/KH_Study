package kh.java.oop.person;

public class PersonMain {
	public static void main(String[] args) {
		
		PersonManager pm = new PersonManager();
		pm.insertPerson(new Person("홍길동"));
		pm.insertPerson(new Person("신사임당"));
		pm.insertPerson(new Person("세종대왕"));
		
		pm.printPerson();
		
		//1.
//		Person[] arr = new Person[3];
//				
//		arr[0] = new Person("홍길동");
//		arr[1] = new Person("신사임당");
//		arr[2] = new Person("세종대왕");
		
		//2. 배열 초기화식 : 배열할당 + 배열요소할당
//		Person[] arr = {
//				new Person("홍길동"),
//				new Person("신사임당"),
//				new Person("세종대왕")
//		};
		
//		System.out.println("------------");
//		//출력
//		for(int i = 0; i < arr.length; i++) {
//			arr[i].printPersonInfo();
//		}
	}
}
