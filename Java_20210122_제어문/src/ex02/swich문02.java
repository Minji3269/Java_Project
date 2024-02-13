package ex02;

public class swich문02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int gd = '2'; // int 정수형
		
		switch(gd){
		case'1' :
			System.out.println("매우 우수");
			break; //이후 답변을 결과에 나오지않게 멈추게 해준다( break  = 벗어나다 )
		case'2' :
			System.out.println("우수");
			break;
		case'3' :
			System.out.println("좋음");
			break;
		case'4' :
			System.out.println("좀 더 열심히 노력하세요");
			break;
		case'5' :
			System.out.println("미흡");
			break;
		default:
			System.out.println("잘못된 등급");
		}
	}

}
