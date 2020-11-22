package kh.java.inherit.product.after;

public class Television extends Product {

	private int size;

	public Television() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Television(String brand, String productName, int price, int size) {
		super(brand, productName, price);
		this.size = size;
	}
	
	@Override
	public String getProductInfo() {
		return super.getProductInfo() +", "+ size;
	}
	
	
}
