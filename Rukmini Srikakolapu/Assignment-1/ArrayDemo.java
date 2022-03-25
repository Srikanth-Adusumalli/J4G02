package assignment1;



public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Book book1 = new Book( 2,"Learn Java","JamesGosling");
		
		Book book2 = new Book(3,"LearnJava","JamesGosling");
		Book[] books = {book1,book2};
		
		for(Book book : books)
		{
			book.printBook();
		}
		
		
	}

}
