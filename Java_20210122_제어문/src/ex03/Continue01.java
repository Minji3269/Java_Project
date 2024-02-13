package ex03;

public class Continue01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 ~ 10 사이의 홀수의 합 구하기
		int sum1 = 0;
		
		for(int i = 1; i<=10; i++) {
			if(i%2 == 1) // i를 2로 나눴을 때 나머지가 1이다 -> 홀수
				sum1 += i;
		}
		
		System.out.println(" 결과1 : " + sum1);
		System.out.println("------------------------------------");
		
		int sum2 = 0;
		for(int i = 1; i<=10; i+=2) { //i가 1에서부터 2씩 증가 -> 홀수
			sum2 += i;
		}
		System.out.println(" 결과2 : " + sum2);
		System.out.println("------------------------------------");
		
		int sum3 = 0;
		for(int i = 1; i<=10; i++) {
			if(i%2 ==0)
				continue; // continue 사용
			
			sum3 += i;
		}
		System.out.println(" 결과3 : " + sum3);
	}

}
