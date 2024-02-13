package test01;

public class EBook extends Book {

	private double fileSize;
	private String format;
	
	public EBook() {}
	
	public EBook(String title,String author, int publicationYear,double fileSizer,String format) {
		super(title,author,publicationYear);
		this.fileSize = fileSize;
		this.format = format;
	}

}
