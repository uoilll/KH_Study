package com.oop.emp.model;

import java.util.Scanner;

public class Employee {
	
	private int empNo;
	private String empName;
	private String dept;
	private String job;
	private int age;
	private char gender;
	private int salary;
	private double bonusPoint;
	private String phone;
	private String address;
	
	
	//setter
	public void setNo(int empNo) {
		this.empNo = empNo;
	}
	public void setName(String empName) {
		this.empName = empName;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setBonus(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setAddr(String address) {
		this.address = address;
	}
	
	//getter
	public int getNo() {
		return empNo;
	}
	public String getName() {
		return empName;
	}
	public String getDept() {
		return dept;
	}
	public String getJob() {
		return job;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	public int getSalary() {
		return salary;
	}
	public double getBouns() {
		return bonusPoint;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddr() {
		return address;
	}
	
	//입력
	public void empInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("사번: ");
		empNo = sc.nextInt();
		setNo(empNo);
		System.out.print("이름: ");
		empName = sc.next();
		setName(empName);
		System.out.print("소속부서: ");
		dept = sc.next();
		setDept(dept);
		System.out.print("직급: ");
		job = sc.next();
		setJob(job);
		System.out.print("나이: ");
		age = sc.nextInt();
		setAge(age);
		System.out.print("성별: ");
		gender = sc.next().charAt(0);
		setGender(gender);
		System.out.print("급여: ");
		salary = sc.nextInt();
		setSalary(salary);
		System.out.print("보너스포인트: ");
		bonusPoint = sc.nextInt();
		setBonus(bonusPoint);
		System.out.print("핸드폰: ");
		phone = sc.next();
		setPhone(phone);
		sc.nextLine();
		System.out.print("주소: ");
		address = sc.nextLine();
		setAddr(address);	
	}
	
	//출력
	public void empOutput() {
		System.out.println("사번: "+empNo);
		System.out.println("이름: "+empName);
		System.out.println("소속부서: "+dept);
		System.out.println("직급: "+job);
		System.out.println("나이: "+age);
		System.out.println("성별: "+gender);
		System.out.println("급여: "+salary);
		System.out.println("보너스포인트: "+bonusPoint);
		System.out.println("핸드폰: "+phone);
		System.out.println("주소: "+address);
	}
	
	//삭제 //결과값을 삭제
	public void del(){
		empNo = 0;
		empName = null;
		dept = null;
		job = null;
		age = 0;
		gender = ' ';
		salary = 0;
		bonusPoint = 0.0;
		phone = null;
		address = null;
	}
}
