package p4;

public class Book {
	

		
		public static  int bookId;
		public String bookName;
		public static String bookAuthor;

		public Book(int bookId, String bookName, String bookAuthor) {
			super();
			this.bookId = bookId;
			this.bookName = bookName;
			this.bookAuthor = bookAuthor;
		}
		
		public void printBook() {	
			System.out.println(this.bookId+" , "+this.bookName+" ,"+this.bookAuthor);
			}
		
		
		public static void main(String args[]){
			
			Book book=new Book(bookId, bookAuthor, bookAuthor);
			book.printBook();
			
		} 
		
		
		}
		
	



