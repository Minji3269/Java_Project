package ex01;

public class Test {

	public static void main(String[] args) {
		
		new Sample();
		new Sample();
		new Sample();
		new Sample();
		Sample s = new Sample();
		
		System.out.println("s.count");
	}

}

class Sample{
	static int count;
	
	public Sample() {
		count++;
	}
}
