package test02;

public class TextBook extends Book {
	
	public TextBook(String title, String author, int year) {
		super(title , author, year);
	}
	
	@Override
	String getDetails() {
		return super.getDetails() + " : 학문분야";
	}
}
