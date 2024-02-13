package ex03;

import java.util.Scanner;

public class exam06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//세정수를 입력 받아서 최대값 구하기
		int num1 = 5 , num2 = 50 , num3 = 15;
		
		int max;
		
		max = num1;
		
		if(max > num2) {
			if(num3>max) {
				max=num3;
			}
		}else {
			if(num2 > num3) {
				max=num2;
			}else {
				max=num3;
			}
		}
		System.out.println("최대값 : "+ max);
	}
}

