package com.Question1;

public class Book {

	static int bookId;
	static String bookName;
	static String bookAuthor;

	public Book() {

	}

	public void printBook(int bookId, String bookName, String bookAuthor) {

		Book.bookId = bookId;
		Book.bookName = bookName;
		Book.bookAuthor = bookAuthor;

		System.out.println("[bookId=" + bookId + ", bookName=" + bookName + ", BookAuthor=" + bookAuthor + "]");
	}

}
