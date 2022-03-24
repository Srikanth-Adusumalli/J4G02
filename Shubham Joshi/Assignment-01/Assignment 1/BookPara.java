package Assesment;

public class BookPara {

	int bookId;
	String bookName;
	String bookAuthor;
	
	public BookPara(int bookId, String bookName, String bookAuthor) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
	}
	
	public void bookpara()
	{
		System.out.println(this.bookId+" , "+this.bookName+" ,"+this.bookAuthor);
	}
	
	public static void main(String args[])
	{
		BookPara book=new BookPara(1,"java","horseman");
		book.bookpara();
	}
}
