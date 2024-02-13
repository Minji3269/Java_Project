package ex03;
import java.util.Scanner;
// if 와 else 를 사용하여 조건문 만들기(두가지 조건)
public class exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("당신의 나이를 입력하세요. :");
		
		int age = sc.nextInt(); //정수값을 입력하라는 뜻
		
		if(age>19) {
			System.out.println("성인 입니다.");
		}
		else {
		System.out.println("미성년자 입니다.");

		}
	}
}