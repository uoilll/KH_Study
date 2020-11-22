package kh.java.inherit.product.after;

public class Desktop extends Computer{

//	private String os;
	
	private String monitor;
	
	private String keyboard;
	
	public Desktop() {}

	public Desktop(String brand, String productName, int price, String os, String monitor, String keyboard) {
		
//		this.brand = brand;
//		this.productName = productName;
//		this.price = price;
		
		//1. public 메소드를 통해 위회 접근
//		setBrand(brand);
//		setProductName(productName);
//		setPrice(price);				
		//2. super 부모생성자를 이용한 값대입
		//최상단 단 한번만 사용가능하다.
		super(brand, productName, price, os);	
		
//		this.os = os;
		this.monitor = monitor;
		this.keyboard = keyboard;
	}
	
	//출력 
	//이거 사용하지말고 아래 오버라이드로 출력하기
//	public String getDesktopInfo() {
//		return getBrand() +", "+ getProductName() +", "+ getPrice() +", "+ os +", "+ monitor +", "+ keyboard;
//	}

	//오버라이드 하는 것을 명시적으로 표현
	//부모메소드의 시그니쳐와 다른 경우, 컴파일 오류 유발
	@Override
	public String getProductInfo() { 
		//부모클래스 product의 getProductInfo호출
		return super.getProductInfo() +", "+ monitor +", "+ keyboard;
	}

	
	
	////////////////////////////////////////////
	
//	public String getOs() {
//		return os;
//	}
//
//	public void setOs(String os) {
//		this.os = os;
//	}

	public String getMonitor() {
		return monitor;
	}

	public void setMonitor(String monitor) {
		this.monitor = monitor;
	}

	public String getKeyboard() {
		return keyboard;
	}

	public void setKeyboard(String keyboard) {
		this.keyboard = keyboard;
	}
	
	
	
	
}
