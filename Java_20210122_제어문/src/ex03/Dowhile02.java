package ex03;

import java.util.Scanner;

public class Dowhile02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input, answer,count;
		input = answer = count = 0;
		
		answer =(int) ((Math.random())*100)+1;
		
		Scanner s = new Scanner(System.in);
		
		do {
			System.out.println("1과 100 사이의 정수를 입력하세요 : ");
			input = s.nextInt();
			count++;
			
			if(input > answer)
				System.out.println("더 작은 수 입력 : ");
			else if(input < answer)
				System.out.println("더 큰 수 입력 : ");
		}while(input != answer);
		
		//Math.random();
		
		System.out.println(count + "회" + input + "맞추었습니다.");
	}

}
