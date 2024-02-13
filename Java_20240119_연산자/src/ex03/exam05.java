package ex03;

import java.util.Scanner;

public class exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 두 숫자를 입력하여 큰값 구하기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력 하시요 : ");
		int n1 = sc.nextInt();
		
		System.out.println("두번째 숫자를 입력 하시요 : ");
		int n2 = sc.nextInt();
		
		if(n1>n2) {
			System.out.println("큰 값" + n1);
		}else if(n2>n1){
			System.out.println("큰 값" + n2);
		}else {
			System.out.println("두 수가 같니?");
		}
	}
}

