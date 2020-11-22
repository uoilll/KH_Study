package com.oop.person.controller;

import java.util.Scanner;

import com.oop.person.model.vo.Person;

public class PersonController {

	Scanner sc = new Scanner(System.in);
	final int LENGTH = 5;
	Person[] person = new Person[LENGTH];
	
	public void insertPerson() {
		for(int i = 0; i < person.length; i++) {
			Person p = new Person();
			System.out.print("이름: ");
			p.setName(sc.next());
			System.out.print("나이: ");
			p.setAge(sc.nextInt());
			System.out.print("키: ");
			p.setHeight(sc.nextDouble());
			System.out.print("몸무게: ");
			p.setWeight(sc.nextDouble());
			System.out.print("재산: ");
			p.setMoney(sc.nextLong());
			
			person[i] = p;
		}
	}
	//출력메소드
	public void printPerson() {
		for(int i = 0; i < person.length; i++) {
			System.out.println(person[i].information());
		}
	}
	//평균구하는메소드
	public void getPersonAvg() {
		System.out.println("--평균--");
		
		double[] sum = new double[4];
		//0:나이 1:키 2:몸무게 3:재산
		for(int i = 0; i < person.length; i++) {
			Person p = person[i];
			sum[0] += p.getAge();
			sum[1] += p.getHeight();
			sum[2] += p.getWeight();
			sum[3] += p.getMoney();
		}
		System.out.println("평균 나이 : "+(sum[0]/person.length));
		System.out.println("평균 키 : "+(sum[1]/person.length));
		System.out.println("평균 몸무게 : "+(sum[2]/person.length));
		System.out.println("평균 재산 : "+(sum[3]/person.length));
		
//		int sum1 = 0;
//		int sum2 = 0;
//		int sum3 = 0;
//		int sum4 = 0;
//		for(int i = 0; i < person.length; i++) {
//			sum1 += person[i].getAge();
//			sum2 += person[i].getHeight();
//			sum3 += person[i].getWeight();
//			sum4 += person[i].getMoney();
//			i++;
//		}
//		int avg1 = sum1 / person.length;
//		int avg2 = sum2 / person.length;
//		int avg3 = sum3 / person.length;
//		int avg4 = sum4 / person.length;
//		
//		System.out.println("평균나이: "+avg1+", 평균키: "+avg2+", 평균몸무게: "+avg3+", 평균재산: "+avg4);
		
	}
	
}
