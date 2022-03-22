
public class Book {
	int bookId=12;
	String bookName="abc";
	String bookAuthor="def";
	void diplayBookDetails()
	{
		System.out.println(bookId+""+bookName+""+bookAuthor);
	}
	public static void main(String[] args) {
		Book b1=new Book();
		b1.diplayBookDetails();
		// TODO Auto-generated method stub

	}

}