package Assingment2;

public class Booktest {

	public static void main(String[] args) {
		
				Book books = new Book(10, "java");
				Book books1 = new Book(101, "java");

				if (books.equals(books1)) {
					System.out.println("books are equal");
				} else {
					System.out.println("books are unequal");
				}
	}

}
