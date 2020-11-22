package com.kh.test;

public class Test1 {

	public static void main(String[] args) {
		
		//1
		int a = 100;
		long b = 999_900_000_000L;
		
		System.out.println(a + ", " + b);
		
		//2
		float c = 486.520f;
		double d = 567.890123;
		String e = String.format("%.3f", c);
		
		System.out.println(e+"(float), " + d);	
		
		//3
		char f = 'A';
		
		System.out.println(f);
		
		//4
		String g = "Hello world";
		
		System.out.println(g);
		
		//5
		boolean h = true;
		
		System.out.println(h);
	}
		

}
