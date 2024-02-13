package ex03;

import java.util.Scanner;

public class Loop01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		System.out.println("5개의 숫자를 입력하세요.");
		
		for(int n = 1; n <=5; n++) {
			Scanner s = new Scanner(System.in);
			int num = s.nextInt();
			sum += num; // sum 은 sum + num 과 같은 코드
		}
		
		System.out.println("합계 :" + sum );
	}

}
