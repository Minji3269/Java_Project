
public class exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 메서드명 : abs
 * 반환타입 : int
 * 매개변수 : int
 * 기능 : 주어진 값의 절대값을 반환한다.
 */
		
		System.out.println("절대값 출력 프로그램");
		int num = abs(10);
		
		System.out.println("절대값 : " + num);
		
	}
	static int abs(int num) {
		//return num>0 ? num : -num;
		return Math.abs(num);
	}

}
