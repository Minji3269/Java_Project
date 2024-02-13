package ex04;

public class Array01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int형 배열 사용
		int sum;
		
		int[] arrNum = new int[5]; // 원하는 자료의 개수를 기입
		
		arrNum[0] = 10;
		arrNum[1] = 20;
		arrNum[2] = 30;
		arrNum[3] = 40;
		arrNum[4] = 50;
		
		for(int i = 0; i<5; i++)
			System.out.print(arrNum[i] + " "); // " " 으로 공백을 만들어준다
		
		System.out.println("\n-----------------");
		
		int[] arrNum2 = {11,12,13,14,15}; //직접 원하는 자료를 기입
		
		for(int i = 0; i<5; i++)
			System.out.print(arrNum2[i] + " ");
		
		System.out.println("\n-----------------");
		
		int[] arrNum3 = {11,22,33,44,55,66}; 
		
		for(int i = 0; i<arrNum3.length; i++) // 출력을 원하는 개수 만큼 i의 방 개수를 정해준다
											  // length가 방개수를 배열의 크기만큼 자동으로 지정해준다	
			System.out.print(arrNum3[i] + " ");
		
	}

}
