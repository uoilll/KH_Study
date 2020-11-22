package com.kh.edu;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestJavaApi {

	/*
	 * public static void main(String[] args) { Date d = new Date();
	 * SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	 * System.out.println(sdf.format(d));
	 * 
	 * }
	 */
	
	public static void main(String[] args) {
		TestJavaApi t = new TestJavaApi();
		t.test();
	}
	
	//application programming interface (api)
	private void test() {
		
		//Date메소드 : Deprecated 메소드는 더이상 사용해서는 안된다.
		Date d = new Date();
		System.out.println(
				(d.getYear()+1900)+"/"+
				(d.getMonth()+1)+"/"+
				 d.getDate());
		
		//Calender
		Calendar cal = Calendar.getInstance();
		System.out.println(
				cal.get(Calendar.YEAR)+"/"+
				(cal.get(Calendar.MONTH)+1)+"/"+
				cal.get(Calendar.DATE));
		
		//SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(sdf.format(d));
		
	}

}
