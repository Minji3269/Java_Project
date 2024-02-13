package ex02;

public class exam06 {

	public static void main(String[] args) {
		powerOn();
		powerOff();
		
		int num = plus(5,2);
		System.out.println(num);
		
		double avg = divide(5,2);
		System.out.println(avg);
	}
	// TODO Auto-generated method stub
	static void powerOn(){
		System.out.println("전원을 껍니다");
	}
	static void powerOff(){
	System.out.println("전원을 껍니다");
	}
	static int plus(int x, int y){
		int result = x + y;
		return result;
	}
	static double divide(int x, int y){
		double result = (double)x / (double)y;
		return result;
	}
	}
