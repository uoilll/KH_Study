package kh.java.oop.student;

public class Run {

	public static void main(String[] args) {
		
//		//객체생성
//		Student s1 = new Student();
//		s1.name = "김철수";
//		s1.gender = '남';
//		s1.age = 20;
//		s1.introduce();
//		
//		Student s2 = new Student();
//		s2.name = "이영희";
//		s2.gender = '여';
//		s2.age = 20;
//		s2.introduce();
	
		//////////////////////////////////////
		//캡슐화
		
		Student s = new Student();
		
		s.setName("홍길동");
		s.setGender('남');
		s.setAge(20);
		s.introduce();

	}

}
