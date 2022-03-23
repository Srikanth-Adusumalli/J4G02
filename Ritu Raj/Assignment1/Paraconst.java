package Printname;

public class Paraconst {
	int bookid;
	String bookname;
	String bookauthor;
	public Paraconst(int bookid, String bookname, String bookauthor) {
		this.bookid=bookid;
		this.bookname=bookname;
		this.bookauthor=bookauthor;
		
	}
	@Override
	public String toString() {
		return "Paraconst [bookid=" + bookid + ", bookname=" + bookname + ", bookauthor=" + bookauthor + "]";
	}
	

}
