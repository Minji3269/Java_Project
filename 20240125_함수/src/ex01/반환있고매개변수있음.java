package ex01;

public class 반환있고매개변수있음 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("최대값 출력");
		
		int max = max(25,10);
		
		System.out.println("최대값 : " + max );
	}
	
	static int max(int num1, int num2) {
		if(num1 > num2)
			return num1;
		else
			return num2;
	}
}
