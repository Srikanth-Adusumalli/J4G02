package com.Assignment4;

public class Book {

	int Bookid;
	String BookName;

	public Book(int bookid, String bookName) {
		Bookid = bookid;
		BookName = bookName;

	}

	public Book() {
	}

	public String toString() {
		return "Book [Bookid=" + Bookid + ", BookName=" + BookName + "]";
	}

}
