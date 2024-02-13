package ex04;

public class Array02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.int형 배열 생성 후 랜덤(1~100)을 이용해서 10개(배열크기) 값 저장
		// 2.그 배열 총점과 평균 구하기
		
		double avg=0;
		int total=0;
		
		int[] arrNum = new int[10];
		
		//1~100이 값을 랜덤하게 추출해서 저장
		for(int i=0; i<arrNum.length; i++) {
			int num = (int) (Math.random()*100)+1;
			arrNum[i] = num;
		}
		
		//배열 10개값 출력
		for(int i =0; i<arrNum.length; i++)
			System.out.print(arrNum[i] + " ");
		System.out.println("\n--------------------------------");
		
		//배열 총점과 평균 구하기
		for(int i = 0; i<arrNum.length; i++)
			total += arrNum[i];
		
		//System.out.println("총점 : " + total + " , 평균 : " + (double)total/arrNum.length);
		avg = (double)total/arrNum.length;
		System.out.println("총점 : " + total + " , 평균 : " + avg);
		System.out.println("--------------------------------");
		
		//최대값 구하기
		int max = 0;
		 for(int i=0; i<arrNum.length; i++) {
			 if(max < arrNum[i]) {
				 max = arrNum[i];
			 }
		 }
		System.out.println("최대값 : " + max);
		System.out.println("--------------------------------");
		
		//정렬 하기 ...
		
	}
}
