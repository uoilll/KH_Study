package kh.java.oop.field;

/**
 * kh학생정보를 관리
 *  - 교육원명
 *  - 교육원 전화번호
 *  - 학생명
 *  - 강의장명
 *  - 전화번호
 *  
 *  void printInfo() : 모든 정보를 출력하기
 */
public class KHStudent {
	public static final String KHNAME = "kh정보교육원";
	public static final String KHPHONE = "0212341234";
	
	private String name;
	private char hallName;
	private String phone;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setHallName(char hallName) {
		this.hallName = hallName;
	}
	public char getHallName() {
		return hallName;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone() {
		return phone;
	}
	
	public void printInfo() {
		System.out.printf("%s(%s) : %s(%c) %s%n", 
						  KHNAME, KHPHONE, 
						  name, 
						  hallName, 
						  phone);
	}
	
	
}
