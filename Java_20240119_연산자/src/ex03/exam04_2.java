package ex03;

import java.util.Scanner;

public class exam04_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//문제. 숫자가 3의 배수 이면서 5의 배수일 때 "좋아요"출력 그렇지 않으면 "싫어요"출력
		//exam04 보다 더 간단한 코드
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요");
		
		int num = sc.nextInt();
		
		if(num%3==0 && num%5==0) {  //&& and 사용하여 두가지 조건을 동시에 적음
			System.out.println("좋아요");
		}else {
			System.out.println("싫어요");
		}
	}
}

