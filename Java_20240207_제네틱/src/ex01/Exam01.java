package ex01;

class A {
	void funA() {
		System.out.println("funA");
	}
}
class B extends A {
	void funB() {
		System.out.println("funB");
	}
}
class C extends B{
	void funC() {
		System.out.println("funA");
	}
}

public class Exam01 {

	public static void main(String[] args) {
		
		//상위 클래스는 하위 클래스 참조 가능
		A a1 = new A();
		A a2 = new B();
		A a3 = new C();
		
		//B b1 = new A(); 하위클래스는 상위클래스 참조 불가 ==> 왜?
		B b2 = new B();
		B b3 = new C();
		
		//C c1 = new A(); 불가 ...
		//C c2 = new B(); 불가 ...
		C c3 = new C();
		
		//강제타입변환
		A aa1 = new B();
		//B bb1 = aa1; 불가 ==> 왜?
		B bb2 = (B)aa1; //가능 ==> 왜?
		
		A aa2 = new C();
		
		C cc1 = (C)aa2; //가능 ==> 왜?
		
		System.out.println("----------------1차 여기까지 ...");
	}

}
