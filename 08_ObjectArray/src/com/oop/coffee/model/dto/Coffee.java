package com.oop.coffee.model.dto;

/**
 * Data Transfer Object DTO
 */
public class Coffee {

	private String origin;
	private String location;
	
	public Coffee() {}
	
	public Coffee(String origin, String location) {
		this.origin = origin;
		this.location = location;
	}
	
	//출력
//	public String information(){
//		return this.origin+" "+this.location+" 커피";
//	}
	
	///////////////////////////////
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
