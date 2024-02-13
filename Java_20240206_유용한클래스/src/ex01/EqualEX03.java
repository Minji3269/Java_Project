package ex01;

public class EqualEX03 {

	public static void main(String[] args) {
		Box b1 = new Box("korea");
		Box b2 = new Box("korea");
		
		System.out.println("1 >> " +(b1 == b2));
		
		System.out.println("2 >> " + (b1.equals(b2)));
	}
}

class Box2{
	int x;
	public Box2(int x) {
		this.x= x;
	}
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Box2) {
			return x == ((Box2)obj).x;
		}
		
		return super.equals(obj);
	}
	//equals 메소드 재정의
}
