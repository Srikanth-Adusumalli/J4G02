package assignment4;

import java.util.HashSet;

public class BookHashSet {

	public static void main(String[] args) {
		HashSet<Book> bookHashSet = new HashSet<Book>();
		bookHashSet.add(new Book(104,"Java The Complete Reference","Herbert Schildt",380.0));
		System.out.println(bookHashSet);
	}
}