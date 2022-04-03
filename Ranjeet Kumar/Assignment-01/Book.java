package welcome.java;

public class Book {
	String bookName;
	String bookAuthor;
	double bookprice;
	public Book(String bookName , String bookAuthor ,double bookprice) {
	super();
		this.bookName=bookName;
		this.bookAuthor=bookAuthor;
		this.bookprice=bookprice;
	}
public void displayInformation() {
	System.out.println(bookName+ "   " +bookAuthor + "   " + bookprice);
}
}
