
public class ModifyBook {
	int bookId;
	String bookName;
	String bookAuhor;
	private String bookAuthor;
	
	ModifyBook(int bookId,String bookName,String bookAuthor){
		this.bookId=bookId;
		this.bookName=bookName;
		this.bookAuthor=bookAuthor;
		
	}
	
	public void printBook() {
		System.out.println(bookId+","+bookName+","+bookAuthor);
		
	}

	public static void main(String[] args) {
		ModifyBook book1=new ModifyBook(001,"The world","HA");
		ModifyBook book2=new ModifyBook(002,"Environment","RRI");
		ModifyBook book3=new ModifyBook(003,"nation","SRI");
		
		book1.printBook();
		book2.printBook();
		book3.printBook();
	

	}

}

