package com.Assignment4;

import java.util.HashSet;

public class HashsetDemo {

	public static void main(String[] args) {
		Book b = new Book(111, "Aditya");
		Book b1 = new Book(112, "Rahul");
		Book b2 = new Book(113, "Ritik");

		HashSet<Book> h = new HashSet<>();
		h.add(b);
		h.add(b1);
		h.add(b2);
		for (Book book : h) {
			System.out.println(book);
		}
	}

}
