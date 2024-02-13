package test04;

public class Car_exam {

	public static void main(String[] args) {
		Car car = new Car();
		
		car.displayCarDatails();
		
		car.setCar("그랜저", "현대", "2020", "흰색");
		System.out.println("--------------------------");
		car.displayCarDatails();
		
		System.out.println("--------------------------");
		car.setMake("기아");
		car.setModel("k5");
		car.displayCarDatails();
	}

}

