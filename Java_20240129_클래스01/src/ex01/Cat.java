package ex01;

public class Cat {

		//멤버변수 -- 재료 (레시피)
		private String breed;
		private String color;
		//private int age;
		
		//생성자(클래스이름하고 같다) -- 반환타입x
		Cat(){
			
		}
		
		/*void setAge(int n) {
			
			if(age>0 && age<=150)
				age = n;
			else
				System.out.println("나이는 0~150사이");
			
		}*/
		
		//void(반환타입) eat(함수명)()(매개변수)
		//멤버 -- 액션(미역을 3분 불린다...)
		void eat() {
			//System.out.println("나이는 : " + age);
			System.out.println("츄르를 먹는다");
			System.out.println("칼라는 " + color + "이다");
		}
		
		void scratch() {
			
		}
		
		void meow() {
			
		}	
	}
