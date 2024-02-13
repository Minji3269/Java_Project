package ex03;

public class exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1~100 사이에 3배수 이면서 5배수 의 합과 갯수를 구하시오
		
		int sum = 0;
		int count = 0;
		
		for(int i=1; i<101; i++) {
		
			if(i%3==0 && i%5==0) {
				sum += i; //합 구하기
				count++; //증가하기
			}
		}
		
		System.out.println("3과 5의 배수 합은 :" + sum);
		System.out.println("3과 5의 배수의 개수는 :" + count);
	}
}
