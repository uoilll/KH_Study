package kh.java.polymorphism.device;

public class TV extends Device{

	private int channel;

	public TV() {}

	public TV(String brand, String deviceName, int price, int channel) {
		super(brand, deviceName, price);
		this.channel = channel;
	}
	
	public void channelUp() {
		
	}
	public void channelDown() {
		
	}
//////////////////////////////////////////
	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	
	
}
