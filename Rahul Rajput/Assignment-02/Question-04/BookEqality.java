package com.Assignment2;

public class BookEqality {

	public static void main(String[] args) {
	
		Book b1=new Book("Rahul", 50.2,"Java book");
		Book b2=new Book("Rahul", 50.2,"Java book");
		boolean h=b1.equals(b2);
		System.out.println(h);

	}
}
