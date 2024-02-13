package ex03;

public class exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1~100 사이에 홀수와 짝수의 합 구하기
		
		int even = 0; //짝수의 합
		int odd = 0;  //홀수의 합
		
		for(int i=1; i <= 100; i++) {
			if(i%2 == 0)
				even += i; // even = even +i;
			else
				odd += i; // odd = odd + i;
		}
		
		System.out.println("짝수의 합 :" + even);
		System.out.println("홀수의 합 :" + odd);
	}

}
