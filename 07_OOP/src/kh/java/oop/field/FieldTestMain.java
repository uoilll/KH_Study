package kh.java.oop.field;

public class FieldTestMain {

	public static void main(String[] args) {
		FieldTest f = new FieldTest();
//		f.test1();
//		f.test2();
		
		FieldTest k = new FieldTest();
		f.test3(k);
		System.out.println(k.a);
		
		System.out.println("this@test3 : " +f.hashCode());
		System.out.println("k@thest3 : "+k.hashCode());

	}

}
