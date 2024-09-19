package javapractice;



public class book {

	String title;
	String author;
	int pageCount;
	static int totalBooks;

	public static void main(String[] args) {

		book b1 = new book();
		b1.title = "book1";
		b1.author = "author2";
		b1.pageCount = 201;
		totalBooks++;

		book b2 = new book();
		b2.title = "book2";
		b2.author = "author3";
		b2.pageCount = 202;
		totalBooks++;

		book b3 = new book();
		b3.title = "book3";
		b3.author = "author3";
		b3.pageCount = 203;
		totalBooks++;
		
		System.out.println(b1.author);
		System.out.println(b2.author);
		System.out.println(b3.author);
		System.out.println(totalBooks);
		
		b1.pageCount = 301;
		
		System.out.println(b1.pageCount);
		
		book b4 = new book();
		totalBooks++;

		System.out.println(b4.author);
		System.out.println(totalBooks);
		
	}

}
