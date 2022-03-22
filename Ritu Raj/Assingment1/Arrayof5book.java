package Printname;

public class Arrayof5book {
	int bookid;
	String bookname;
	String bookauthor;
	public Arrayof5book(int bookid, String bookname, String bookauthor) {
		this.bookid=bookid;
		this.bookname=bookname;
		this.bookauthor=bookauthor;

}
	@Override
	public String toString() {
		return "Arrayof5book [bookid=" + bookid + ", bookname=" + bookname + ", bookauthor=" + bookauthor + "]";
	}
}