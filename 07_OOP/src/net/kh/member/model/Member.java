package net.kh.member.model;

public class Member {
	
	private String memberId;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	//setter
	public void setId(String memberId) {
		this.memberId = memberId;
	}
	public void setPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}
	public void setName(String memberName) {
		this.memberName = memberName;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	//getter
	public String getId() {
		return memberId;
	}
	public String getPwd() {
		return memberPwd;
	}
	public String getName() {
		return memberName;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	public String getPhone() {
		return phone;
	}
	public String getEmail() {
		return email;
	}
	
}
