import java.util.function.Function;

public class sample01 {

	public static void main(String[] args) {
		System.out.println("Hello ~ !!!!!!!!!");
		
		// TODO Auto-generated method stub
		int num = func(100 , 20);
		System.out.println("최대값 : " + num);
	}
	
	static int func(int n1, int n2)
	{
		System.out.println("난 함수 !");
		return n1>n2 ? n1:n2;
	}

}
