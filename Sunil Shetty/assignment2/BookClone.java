package com.learnjobs.assignment;

public class BookClone implements Cloneable {
	int bookID;
	String bookName;

	public BookClone(int bookID, String bookName) {

		this.bookID = bookID;
		this.bookName = bookName;
	}

	public void displayBookInformation() {
		System.out.println(this.bookID + "," + this.bookName);

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		BookClone books = new BookClone(10, "java");
		BookClone books1 = null;
		try {
			books1 = (BookClone) books.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		books.displayBookInformation();
		books1.displayBookInformation();
	}

}
