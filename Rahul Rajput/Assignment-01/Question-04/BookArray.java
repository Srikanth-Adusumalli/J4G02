package com.Question1;

public class BookArray {
	int id;
	String bookName;
	String Author;

	public BookArray(int id, String bookName, String author) {

		this.id = id;
		this.bookName = bookName;
		this.Author = author;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", Author=" + Author + "]";
	}

}
