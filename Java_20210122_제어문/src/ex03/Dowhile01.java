package ex03;

public class Dowhile01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int i = 0;     //초기값
		
		do {
			i++;       // 증가값
			sum += i;
		//}while(i<=10); //조건
		}while(i < 10);
			
		System.out.println("sum :" + sum);
		
	}

}
