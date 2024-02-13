package ex04;

public class 로또2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a = 10;
		int b = 20;
		
		System.out.println(a + " : " +b);
		
		int c = a;
		a = b;
		b = c;
		
		System.out.println(a + " : " +b);*/
		
		int[] lotto = new int[45]; //lotto 안에는 1~45까지의 숫자가 들어있다
		
		for(int i = 0; i<lotto.length;i++)
			lotto[i] = i+1; // 0+1 = 1 즉 i =1 부터 시작
		for(int i = 0; i<1000; i++) {
			int num = (int)(Math.random()*44)+1; // 1~44 출력
			int tmp = lotto[0];
			lotto[0] = lotto[num];
			lotto[num]=tmp;
		}
		
		for(int i = 0; i<lotto.length; i++)
			System.out.print(lotto[i] + " ");
		
	}

}
