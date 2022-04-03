  package welcome.java;

public class ArrayDemo {
	public static void main(String ... args) {
		int [] data= {11,222,333,44,55};
		
		Book[] books= {	new Book("Learn java 7.1","Rakesh",6900),
				new Book("Learn java 9.0","Ramu",700),
				new Book("Learn java 1.7","jac",68800)};



		for(Book book:books) {
			book.displayInformation();
		}


	}
	}
