package ex02;

public class swich문03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String gd = "kor"; // String 문자열
		
		switch(gd){
		case"kor" :
			System.out.println("매우 우수");
			break; //이후 답변을 결과에 나오지않게 멈추게 해준다( break  = 벗어나다 )
		case"eng" :
			System.out.println("우수");
			break;
		case"math" :
			System.out.println("좋음");
			break;
		case"sci" :
			System.out.println("좀 더 열심히 노력하세요");
			break;
		case"com" :
			System.out.println("미흡");
			break;
		default:
			System.out.println("잘못된 등급");
		}
	}

}
