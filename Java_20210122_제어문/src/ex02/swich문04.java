package ex02;

public class swich문04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int gd = 100; 
		
		switch(gd / 10) {
		case 10 :
		case 9 :                     //grade >= 90 : 점수가 90점 이상일 때
 			System.out.println("A");
			break; //이후 답변을 결과에 나오지않게 멈추게 해준다( break  = 벗어나다 )
		case 8 :
			System.out.println("B");
			break;
		case 7 :
			System.out.println("C");
			break;
		case 6 :
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}
	}

}
