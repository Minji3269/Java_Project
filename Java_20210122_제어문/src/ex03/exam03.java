package ex03;

import java.util.Scanner;

public class exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("------------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
		System.out.println("------------------------------");
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("선택 >");
		
		int n = s.nextInt();
		
		
		switch(n) {
		case 1 :
			System.out.println("예금액 >" + 10000);
			break;
		case 2 :
			System.out.println("출금액 >" + 20000);
			break;
		case 3 :
			System.out.println("잔고 >" + 9000);
			break;
		case 4 :
			System.out.println("프로그램 종료");
			break;
		}
	}
}
