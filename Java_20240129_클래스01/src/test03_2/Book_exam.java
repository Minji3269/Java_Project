package test03_2;

public class Book_exam {

	public static void main(String[] args) {
		
		Book book1 = new Book("Java기본","송미영","한빛아카데미",30000);
		book1.displayInformation();
		
		System.out.println("----------------------");
		Book book2 = new Book();
		book2.displayInformation();
		
		System.out.println("----------------------");
		Book book3 = new Book();
		book3.displayInformation();
		
	}

}
