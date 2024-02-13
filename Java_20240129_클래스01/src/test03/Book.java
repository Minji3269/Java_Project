package test03;

public class Book {
		private String title;
		private String author;
		private String publisher;
		private int price;
		
		Book(){
			title = "제목없음";
			author = "저자없음";
			publisher = " 출판사없음";
			price = 0;
		}
		
		Book(String t,String a, int p){
			title = t;
			author = a;
			price = p;
			publisher = "한빛미디어";
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
