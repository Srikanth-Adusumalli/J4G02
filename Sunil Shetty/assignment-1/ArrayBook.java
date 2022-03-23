package com.learnsjobs.assignment;

public class ArrayBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] book = { new Book("java", "sam", 1200), new Book("java8.0", "joseph", 1500),
				new Book("java9.0", "jerry", 1700), new Book("java10.0", "harry", 1900),
				new Book("java8.0", "martin", 1100) };

		for (Book books : book) {
			books.displayBookInformation();
		}

	}
}
