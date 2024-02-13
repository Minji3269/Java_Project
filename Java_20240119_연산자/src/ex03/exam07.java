package ex03;

import java.util.Scanner;

public class exam07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//세개의 정수를 입력 받은 뒤 가장 작은 값 찾기
		System.out.println("세 개의 정수를 입력하시오");
		
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		if(a<b&&a<c) {
			System.out.println(a+"는 가장 작은 정수 입니다.");
		} else if(b<a&&b<c) {
			System.out.println(b+"는 가장 작은 정수 입니다.");
		} else if(c<a&&c<b) {
			System.out.println(c+"는 가장 작은 정수 입니다.");
		}
	}
}

