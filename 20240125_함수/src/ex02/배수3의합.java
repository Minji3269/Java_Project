package ex02;

public class 배수3의합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		for(int i = 0; i<=100; i++) {
			if(i%3 == 0) {
			sum += i;
			}
		}
		System.out.println("3의 배수의 합 : " + sum);
		
		int[]arr = {10,20,30};
		
		for(int i = 0; i<arr.length; i++)
			System.out.println(arr[i] + " ");
		
		int[] numArr = arr;
		for(int i = 0; i<arr.length; i++)
			numArr[i] += 100;
		
		System.out.println();
		
		for(int i = 0; i<arr.length; i++)
			System.out.println(arr[i] + " ");
	}

}
