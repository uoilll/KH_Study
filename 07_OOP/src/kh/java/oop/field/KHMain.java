package kh.java.oop.field;

import java.io.ObjectInputStream.GetField;

public class KHMain {

	public static void main(String[] args) {
		KHStudent s1 = new KHStudent();
		
		s1.setName("홍길동");
		s1.setHallName('M');
		s1.setPhone("0101234124");
		
		KHStudent s2 = new KHStudent();
		
		s2.setName("신사임당");
		s2.setHallName('M');
		s2.setPhone("010987098777");
		
//		System.out.println("교육원: "+KHStudent.KHNAME+"\n"
//				+ "교육원번호: "+KHStudent.KHPHONE+"\n"
//				+ "수강생 이름: "+ s.getName() +"\n"
//						+ "강의장: "+s.getHallName()+"\n"
//								+ "수강생 전화번호: "+s.getPhone()+"\n");
//		
//		System.out.println("교육원: "+KHStudent.KHNAME+"\n"
//				+ "교육원번호: "+KHStudent.KHPHONE+"\n"
//				+ "수강생 이름: "+ s2.getName() +"\n"
//						+ "강의장: "+s2.getHallName()+"\n"
//								+ "수강생 전화번호: "+s2.getPhone()+"\n");
		
		s1.printInfo();
		s2.printInfo();

	}

}
