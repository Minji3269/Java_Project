package ex01_2;

public class Cat {

		//멤버변수 -- 재료 (레시피)
		private String breed;
		private String color;
		
		//멤버 변수 값을 대입 및 변경은?
		//생성자를 이용 또는 setter를 이용해서 값을 변경이나 초기화 한다
		
		//추가...setter.,getter
		//setter는 변수값을 변경 할 때 사용
		//getter는 변수값을 읽어올 때 사용
		
		//setter -> set+변수명 조합 -> 카멜표기법
		void setBreed(String s) {
			breed = s;
		}
		void setColor(String c) {
			color = c;
		}
		
		
		
		
		//생성자(클래스이름하고 같다) -- 반환타입x
		Cat(String s, String s2){
			breed = s;
			color = s2;
		}
		
		Cat(){
			
		}
		
		//void(반환타입) eat(함수명)()(매개변수)
		//멤버 -- 액션(미역을 3분 불린다...)
		void eat() {

			System.out.println(breed);
			System.out.println(color);
		}
		
		void scratch() {
			
		}
		
		void meow() {
			
		}	
	}
