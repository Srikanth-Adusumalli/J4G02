package assignment;

public class ArrayBook {
	int bookId;
	String bookName;
	String bookAuthor;
	
	 public ArrayBook(int bookId, String bookName, String bookAuthor) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
	}


	public void display()
	    {
	        System.out.println("Book id is: " + bookId + " " + " Book name is: "
	                           + bookName + "   " + "Book Author is:" + bookAuthor);
	    }

	public static void main(String[] args) {	
		ArrayBook[] ab=new ArrayBook[5];
		ab[0]=new ArrayBook(1,"Java","joshua");
		ab[1]=new ArrayBook(2,"Python","Eric");
		ab[2]=new ArrayBook(3,"Machine","xyz");
		ab[3]=new ArrayBook(4,"Abinitio","anji");
		ab[4]=new ArrayBook(5,"Salesforce","prakash");
		
		for(ArrayBook book:ab) {
			book.display();
		}
		
	}

}
