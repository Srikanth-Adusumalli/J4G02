
public class ConstructorBook {
	int bookId=01;
	String bookName="java";
	String bookAuthor="James Gosling";
	
	  void displayBookDetails() {
		  System.out.println(bookId+" "+bookName+" "+bookAuthor);
	  }

	public static void main(String[] args) {
	   ConstructorBook b1=new ConstructorBook();
	    b1.displayBookDetails();

	}

}
