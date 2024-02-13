package test03_2;

public class Book {
		String title;
		String author;
		String publisher;
		int price;
		
		Book(){
			this("제목없음","저자없음","출판사없음",0);
		}
		
		Book(String t,String a, int p){
			this(t,a,"출판사없음",p);
		}
		
		Book(String t,String a,String b, int p){
			title = t;
			author = a;
			publisher = b;
		    price = p;
		}
		
		void displayInformation() {
			System.out.println("제목 : " + title);
			System.out.println("저자 : " + author);
			System.out.println("출판사 : " + publisher);
			System.out.println("가격 : " + price);
		}
}
