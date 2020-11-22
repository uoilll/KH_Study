package kh.java.inherit.product.after;

public class SmartPhone extends Computer {

//	private String os;
	
	private String carrier; //통신사

	public SmartPhone() {}

	public SmartPhone(String brand, String productName, int price, String os, String carrier) {
		super(brand, productName, price, os);
//		this.os = os;
		this.carrier = carrier;
	}
	
	@Override
	public String getProductInfo() {
		return super.getProductInfo() +", "+ carrier;
	}
	
	
///////////////////////////////////
//	public String getOs() {
//		return os;
//	}
//
//	public void setOs(String os) {
//		this.os = os;
//	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	
	
}
