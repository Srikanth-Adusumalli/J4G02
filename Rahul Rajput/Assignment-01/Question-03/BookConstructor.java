package com.Question1;

public class BookConstructor {

	int bookId;
	String bookName;
	String BookAuthor;

	public BookConstructor(int bookId, String bookName, String BookAuthor) {

		this.bookId = bookId;
		this.bookName = bookName;
		this.BookAuthor = BookAuthor;

	}

	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", BookAuthor=" + BookAuthor + "]";
	}

}
