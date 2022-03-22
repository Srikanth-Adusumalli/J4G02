/*
 * package com.java.Module4;
 * 
 * public class ListItemsCLass {
 * 
 * public static void main(String[] args) { BookListShorting1 li=new
 * BookListShorting1(1, "bcjh", "cdsd",5); li.getBookPrice();
 * li.getAuthorName(); li.getBookId(); li.getBookName();
 * li.setAuthorName("cdss"); li.setBookPrice(89); }
 * 
 * 
 * 
 * if(li.getBookPrice());
 * 
 * } }
 */
package pratice1;

public class Book {
	String bookName;
	String bookAuthor;
//	double bookPrice;
	int bookId;
	public Book(String bookName, String bookAuthor, int bookId) {
		super();
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookId = bookId;
	}
	
	public void displaybookInformation() {
		System.out.println( bookName+" "+bookAuthor+" "+bookId);
	}

}