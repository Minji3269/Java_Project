package test01;

public class AnimalController {

	public static void main(String[] args) {
		/* ->다형성을 만족하지 않는다.. make sound()가 반복되네..
		Bird b = new Bird();
		b.makeSound();
		
		Dog d = new Dog();
		d.makeSound();
		
		Cat c =  new Cat();
		c.makeSound();*/
		sound(new Bird());
		sound(new Dog());
		sound(new Cat());
	}
	static void sound(Animal animal) {
		animal.makeSound();
	}
}
