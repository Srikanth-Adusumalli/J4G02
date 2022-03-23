
package com.learnjobs.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class BookClass {
	

public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Book book = new Book(1,"java1.0","sam",200);
		Book book1 = new Book(1,"java2.0","john",100);
		Book book2 = new Book(1,"java2.0","sunil",700);
		Book book3 = new Book(1,"php1.0","gosling",600);
		Book book4 = new Book(1,"c++.1.0","peter",500);
		
		TreeSet<Book> bookcollection =new TreeSet<Book>();
		bookcollection.add(book);bookcollection.add(book1);bookcollection.add(book2);
		bookcollection.add(book3);bookcollection.add(book4);
		
		for(Book b:bookcollection) {
			System.out.println(b);
		}
	ArrayList<Book> mybooklist =new ArrayList<Book>();
	mybooklist.addAll(bookcollection);
	System.out.println(mybooklist);
		
	Collections.sort(mybooklist, new BookSortPrice());
		System.out.println(mybooklist);

	} 

}
