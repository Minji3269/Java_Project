package ex04;

class Box<T>{
	private T obj;
	void set(T obj) {
	}
	T get() {
		return obj;
	}
}

public class BoxEx01 {
	
	
	public static void main(String[] args) {
		
		Box<Integer> iBox =  new Box<Integer>();
		iBox.set(123);
		int num = iBox.get();
		System.out.print(num);
		
		System.out.println("-------------------------");
		
		Box<Double>dBox = new Box<Double>();
		dBox.set(12.3);
		double dNum = dBox.get();
		System.out.print(dNum);
	}

}
