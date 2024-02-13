package ex01;

import java.util.Scanner;

public class 버스요금01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 버스 요금이 1500원 일 때
		 * 0~3세 100% 할인
		 * 4~13세 50% 할인
		 * 13~19세 25% 할인
		 * 20세 이상 0% 할인
		 * 나이 입력하면 할인을 기반해서 프로그램 작성하기
		 */
		Scanner s = new Scanner(System.in);
		
		final int CHARGE = 1500;
		double fee = 0;
		
		System.out.println("나이를 입력하세요 :");
		int age = s.nextInt();
		
		if(age>=20) {
			fee = CHARGE * 1.0;
		}else if(age >= 14) {
			fee = CHARGE * 0.25;
		}else if(age >= 4) {
			fee = CHARGE * 0.5;
		}else {
			fee = CHARGE * 0;
		}
		
		System.out.println("당신 요금은 : " + (int)fee + "원");

	}

}
