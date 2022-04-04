package p4;

public class BookConstructure {
		int bookId=01;
		String bookName="java";
		String bookAuthor="James Gosling";
		
		  void displayBookDetails() {
			  System.out.println(bookId+" "+bookName+" "+bookAuthor);
		  }

		public static void main(String[] args) {
			BookConstructure b1=new BookConstructure();
		    b1.displayBookDetails();

		}

	}


