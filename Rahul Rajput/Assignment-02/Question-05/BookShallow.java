package com.Assignment2;

public class BookShallow implements Cloneable {
	String BookAuthorName;
	double BookPrice;
	String BookName;

	public BookShallow(String bookAuthorName, double bookPrice, String bookName) {
		super();
		BookAuthorName = bookAuthorName;
		BookPrice = bookPrice;
		BookName = bookName;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) {

		BookShallow b1 = new BookShallow("Rahul", 560, "Java book");
		try {
			BookShallow b2 = (BookShallow) b1.clone();
			System.out.println("Object - " + b1.BookAuthorName + " " + b1.BookPrice);
			System.out.println("Copy Object - " + b2.BookAuthorName + " " + b2.BookPrice);

		} catch (CloneNotSupportedException e) {

			e.printStackTrace();
		}

	}

}
