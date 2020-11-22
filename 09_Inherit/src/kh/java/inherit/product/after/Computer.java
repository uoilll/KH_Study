package kh.java.inherit.product.after;

public class Computer extends Product{

	private String os;

	public Computer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Computer(String brand, String productName, int price, String os) {
		super(brand, productName, price);
		this.os = os;
	}
	
	public String getProductInfo() {
		return super.getProductInfo() +", "+ os;
	}
	
	
}
