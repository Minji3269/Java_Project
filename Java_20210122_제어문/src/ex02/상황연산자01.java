package ex02;

public class 상황연산자01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j = 90;
		
		if(j>=60)
			System.out.println("합격");
		else
			System.out.println("불합격");
		
		// 상황 연산자 이용해서 변형
		
		String msg = (j>=60) ? "합격" :  "불합격" ; // ? 참일 때 조건 : 거짓일 때 조건 ;
		//String msg = "합격"
		System.out.println(msg);
	}

}
