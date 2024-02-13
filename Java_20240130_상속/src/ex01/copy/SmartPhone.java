package ex01.copy;

public class SmartPhone extends Phone  {
		
	private String model;
	private String color;
	
	private boolean wifi;
	
	public SmartPhone() {
		System.out.println("SmartPhone()");
	}
	public SmartPhone(String model, String color, boolean wifi) {
		super(model,color);
		System.out.println("String color, boolean wifi");
		this.wifi = wifi;
	}
	@Override
	public String toString() {
		return "SmartPhone [model=" + model + ", color=" + color + ", wifi=" + wifi + "]";
	}
	public void bell() {
		System.out.println("전화 벨이 울린다");
	}
	public void sendVoice(String message) {
		System.out.println("자신 : " + message);
	}
	public void receiveVoice(String message) {
		System.out.println("상대방 : " + message);
	}
	public void hangUp() {
		System.out.println("전화를 끊습니다");
	}
	public void internet() {
		System.out.println("인터넷 연결");
	}
}
