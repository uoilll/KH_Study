package com.oop.method.static_;

public class StaticMethod {
	//Field
    private static String value = "java";
    
    public static void toUpper() {
    	value = value.toUpperCase();
    	System.out.println(value);
    }
    
    public static void setChar(int index, char ch) {
//    	if(index < 0 || index >= value.length()) {
//    		return;
//    	}
    	value = value.substring(0, index) + ch + value.substring(index+1);
    	System.out.println(value);
    }
    
    public static int valueLength() {
    	
    	return value.length();
    }
    
    public static String valueConcat(String str) {
    	
    	return value + str;
    }
    
    
}
