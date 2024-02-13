package test02;

public class BookController {
	public static void main(String[] args) {
	
		details(new TextBook("java" , "신용권" , 2023));
		details(new Magazine("js", "조운" , 2022));
		details(new Novel("리액트" , "관우" , 2021));
	}
	
	static void details(Book book) {
		String msg = book.getDetails();
		System.out.println(msg);
	}
}
