public class Book1 {
	int bookId;
	String bookName;
	public Book1(int bookId, String bookName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
	}
//	
	public String toString() {
		return bookId+" , "+bookName;
	}
	
	
	public boolean equals(Object o) {
		Book1 e = (Book1)o;
		if(this.bookId ==e.bookId)
			return true;
		return false;
	}
	
	public static void main(String args[]) {
		Book1 book2 = new Book1(11,"Navya Reddy");
		Book1 book3 = new Book1(15,"Navya");
		if (book2.equals(book3)) 
			System.out.println("books are equal");
		else 
		    System.out.println("books are not equal");
			
		
	}

}

