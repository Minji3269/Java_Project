package ex03;

public class For01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 ~ 5  까지의 합을 구하는 for 문
		
		int sum = 0;
		for(int i=1; i<=5; i++) { //초입값, 조건 , 증가값
			sum = sum + i ;
		}
		
		System.out.println("누적 합 :" + sum);

	}

}
