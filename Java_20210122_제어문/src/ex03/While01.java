package ex03;

public class While01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 ~ 5  까지의 합을 구하는 while 문
		int sum = 0;
		int i = 1; //초입값
		
		while(i<=5) { // 조건
			sum = sum + i;
			i++; //증가값 -> 증가값이 없으면 무한으로 결과값 출력
		}
		System.out.println("while 누적합 :" + sum);
	}

}
