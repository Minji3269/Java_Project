package ex01;

public class NewestPhone extends Phone {
	private String model;
	private String color;
	
	private boolean wifi;
	
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
	public void youtube() {
		System.out.println("유튜브 연결");
	}
}

