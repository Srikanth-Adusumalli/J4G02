package p4;

public class ModifyBook {
	int bookId;
	String bookName;
	String bookAuthor;
	 
	   ModifyBook(int bookId,String bookName,String bookAuthor) {
		   this.bookId=bookId;
		   this.bookName=bookName;
		   this.bookAuthor=bookAuthor;
	   }
	   
	   public void printBook() {
		   System.out.println(bookId+","+bookName+","+bookAuthor);
	   }

	public static void main(String[] args) {
	    ModifyBook book1=new ModifyBook(101,"the nation","AK");
	    ModifyBook book2=new ModifyBook(102,"theory","hkkf");
	    ModifyBook book3=new ModifyBook(103,"wings of fire","APJ");
	    book1.printBook();
	    book2.printBook();
	    book3.printBook();
	}

}
