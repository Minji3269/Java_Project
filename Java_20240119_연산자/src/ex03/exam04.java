package ex03;

import java.util.Scanner;

public class exam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//문제. 숫자가 3의 배수 이면서 5의 배수일 때 "좋아요"출력 그렇지 않으면 "싫어요"출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요");
		
		int num = sc.nextInt();
		
		if (num%3 == 0) { 
			if(num%5 == 0) {
			System.out.println("좋아요"); 
			}else {
			System.out.println("싫어요");
			}
		}else if (num%5 == 0) { 
			if(num%3 == 0) {
			System.out.println("좋아요"); 
			}else {
			System.out.println("싫어요");
			}
		}else {
			System.out.println("싫어요");
		}
	}
}

