package com.learnsjobs.assignment;

public class Book {

	String bookName,bookAuthor;
	int bookPrice;
	public Book(String bookName, String bookAuthor, int bookPrice) {
		super();
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
	}
public void displayBookInformation() {
	System.out.println(this.bookName+","+this.bookAuthor+","+this.bookPrice);
}
}
