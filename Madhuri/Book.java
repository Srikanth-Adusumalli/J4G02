package book;
public class Book {
	int bookid;
	String bookname;
	String bookauthor;
	public Book(int bookid, String bookname, String bookauthor) {
				this.bookid = bookid;
		this.bookname = bookname;
		this.bookauthor = bookauthor;
	}
	public static void book(Book b) {
		System.out.println(b.bookid+""+b.bookauthor+""+b.bookname);
	}
public static void main(String args[]) {	
 Book b=new Book(102,"madhu","madhuri"); 
 book(b);
}
}