package kh.java.polymorphism.device;

public class DeviceMain {

	public static void main(String[] args) {
		Device[] arr = new Device[10];
		arr[0] = new TV("삼성", "평면TV", 3_000_000, 10);
		arr[1] = new TV("LG", "울트라평면TV", 2_500_000, 20);
		arr[2] = new Laptop("LG", "그램17", 2_000_000, 512);
		arr[3] = new Laptop("apple", "맥북16", 3_000_000, 1024);
		
		for(Device d : arr) {
			if(d instanceof TV) {
				((TV)d).channelUp();
			}else if(d instanceof Laptop) {
				System.out.println(((Laptop)d).getCapacity());
			}
			System.out.println(d.toString());
		}
	
	
	
	}
}
