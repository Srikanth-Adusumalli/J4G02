package assignment;

public class ModifyBook {
	int bookId;
	String bookName;
	String bookAuthor;
	
   public ModifyBook(int bookId,String bookName,String bookAuthor) {
	   this.bookId=bookId;
	   this.bookName=bookName;
	   this.bookAuthor=bookAuthor;

	}
public void printBook() {
	System.out.println(bookId+" "+bookName+" "+bookAuthor);
}
	public static void main(String[] args) {
		ModifyBook b1=new ModifyBook(124,"English","vasu");
		ModifyBook b2=new ModifyBook(143,"java","joshua");
		ModifyBook b3=new ModifyBook(521,"python","Eric");
		
		b1.printBook();
		b2.printBook();
		b3.printBook();

	}

}
