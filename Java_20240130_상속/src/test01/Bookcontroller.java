package test01;

public class Bookcontroller {

	public static void main(String[] args) {
		Book book = new Book();
		book.displayInfo();
		
		EBook ebook = new EBook("스프링워크북","구멍가게",2023,10.2,"pdf");
		
		ebook.displayInfo();
	}

}
