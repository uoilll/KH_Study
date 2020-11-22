package kh.java.inherit.product.before;

public class ProductBeforeMain {

	public static void main(String[] args) {
		
		Desktop d = new Desktop("삼성", "오딧세이", 1_500_000, "windows10", "27인치 모니터", "기계식 키보드");
		SmartPhone s = new SmartPhone("애풀", "아이폰11", 1_000_000, "ios", "kt");
		Television t = new Television("LG", "롤러블", 3_000_000, 75);
		
		System.out.println(d.getDesktopInfo());
		System.out.println(s.getSmartPhoneInfo());
		System.out.println(t.getTelevisionInfo());

	}

}
