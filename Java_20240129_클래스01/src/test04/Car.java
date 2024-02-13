package test04;

public class Car {
		private String make;
		private String model;
		private String year;
		private String color;
		
		//private boolean engine;
		
		Car(){}
		
		void setMake(String m) {
			make = m;
		}
		
		void setModel(String m) {
			model = m;
		}
		
		void setCar(String m,String mo,String y,String c){
			make = m;
			model = mo;
			year = y;
			color = c;
		}
		
		/*boolean startEngine() {
			return engine = true;
		}
		
		boolean stopEngine() {
			return engine = false;
		}*/
		void displayCarDatails() {
			System.out.println("제조사 : " + make);
			System.out.println("모델 : " + model);
			System.out.println("연식 : " + year);
			System.out.println("색깔 : " + color);
		}
}
