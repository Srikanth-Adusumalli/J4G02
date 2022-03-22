
public class ArrayOperation {
	int bookId;
	String bookName;
	String bookAuthor;
	ArrayOperation(int bookId, String bookName, String bookAuthor ){
	 this.bookId = bookId;
	 this.bookName = bookName;
	 this.bookAuthor = bookAuthor;
	}
	public static void main(String[] args) {
		ArrayOperation book = new ArrayOperation(101,"Java","Stiphen");
		ArrayOperation book1 = new ArrayOperation(102,"Python","John");
		ArrayOperation book2= new ArrayOperation(103,"PHP","Tony");
	        
		book.printbook();
		book1.printbook();
		book2.printbook();
			}
	private void printbook() {
		System.out.println(bookId+","+bookName+","+bookAuthor);
		
	}
}

	