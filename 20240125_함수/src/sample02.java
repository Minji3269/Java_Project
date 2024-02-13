import java.util.function.Function;

public class sample02 {

	public static void main(String[] args) {
		System.out.println("Hello ~ !!!!!!!!!");
		
		int num = max(100,20); // 함수 호출
		
		System.out.println("최대값 : " + num);
	}
	//매개변수 정수형 2개를 입력 받아서, 정수값을 변형
	static int max(int n1, int n2)
	{
		System.out.println("난 함수 !");
		return n1>n2 ? n1:n2;  //최대값 반환
	}
	static int min(int n1, int n2)
	{
		System.out.println("난 함수 !");
		return n1<n2 ? n1:n2; // 최소값 반환
	}

}
