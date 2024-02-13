package ex01;

import java.util.Scanner;

public class 버스요금02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//버스요금 class 와 동일한 문제
		//65세이상 무료 -> 조건 추가
		Scanner s = new Scanner(System.in);
		
		final int CHARGE = 1500;
		double fee = 0;
		
		System.out.println("나이를 입력하세요 :");
		int age = s.nextInt();
		if(age >= 65) // 밑에 명령어 줄이 한 줄일 때 {} 생략 가능
			fee = CHARGE * 0;
		else if(age>=20) 
			fee = CHARGE * 1.0;
		else if(age >= 14) 
			fee = CHARGE * 0.25;
		else if(age >= 4) 
			fee = CHARGE * 0.5;
		else 
			fee = CHARGE * 0;
		
		System.out.println("당신 요금은 : " + (int)fee + "원");

	}

}
