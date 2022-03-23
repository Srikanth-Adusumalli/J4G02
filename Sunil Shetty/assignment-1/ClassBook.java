package com.learnsjobs.assignment;

public class ClassBook {

	int bookId;
	String bookName, bookAuthor;

	ClassBook() {
		this.bookId = 1;
		this.bookName = "java";
		this.bookAuthor = "sam";
	}

	public ClassBook(int bookId, String bookName, String bookAuthor) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
	}

	public void printBook() {
		System.out.println(this.bookId + " ," + this.bookName + " ," + this.bookAuthor);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassBook classbook = new ClassBook();
		ClassBook classbook1 = new ClassBook(3, "java 8.0", "james");
		ClassBook classbook2 = new ClassBook(4, "java 9.0", "johnny");

		classbook.printBook();
		classbook1.printBook();
		classbook2.printBook();
	}

}
