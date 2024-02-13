package ex08;

class Box<T>{
	private T obj;
	
	void set(T obj) {
		this.obj = obj;
	}
	T get() {
		return this.obj;
	}
}

class BoxFactory{
	public static <T> Box <T> makeBox(T o){
		Box<T> box = new Box<T>();
		box.set(o);
		return box;
	}
}
public class GenericMethod01 {

	public static void main(String[] args) {
		Box<String> sBox = BoxFactory.makeBox("korea");
		System.out.println(sBox.get());
		
		Box<Integer>iBox = BoxFactory.makeBox(100);
		System.out.println(iBox.get());
	}

}
