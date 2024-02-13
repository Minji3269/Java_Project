/*
 * 매서드명 : change
 * 매개변수 : int
 * 반환타입 : int[]
 * 기능 : change 함수 정수값을 전달 하면 그 정수 수 만큼 배열 크기를 생성해서 전달
 *       배열안에는 1~10까지 난수 입력
*/

public class sample03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("정수 전달 하면 정수 크기만큼 배열을 생성해서 돌려주네!");
		
		int[] numArr = change(5);
		for(int i = 0; i<numArr.length;i++)
			System.out.print(numArr[1] + " ");
	}
		static int [] change(int num) {
			int[] arrNum = new int[num];
			for(int i = 0; i<arrNum.length;i++)
				arrNum[i] = (int)(Math.random()*10)+1;
			
			return arrNum;
		}
}
