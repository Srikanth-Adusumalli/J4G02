package assignment1;

public class Book1 {
	int bookId;
	String bookName;
	String bookauthor;
	
	//Defaultconstructor
	Book1()
	{
		System.out.println("Default Constructor");
	}
	Book1(Integer bookId,String bookName,String bookAuthor)
	{
		System.out.println("Parameter Constructor");
		this.bookId=bookId;
		this.bookName=bookName;
		this.bookauthor=bookAuthor;
	}
	
	public void printBook()
	{
	   System.out.println(this.bookId);
	   System.out.println(this.bookName);
	   System.out.println(this.bookauthor);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book1 b=new Book1(1,"Java","James Gosling");
		b.printBook();

	}

}
