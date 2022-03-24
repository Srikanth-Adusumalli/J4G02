package com.Assignment4;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Book> a = new ArrayList<Book>();
		Book b = new Book(100, "Rahul");
		Book b1 = new Book(101, "Aditya");
		Book b2 = new Book(102, "Ritu");
		Book b3 = new Book(103, "Aman");
		Book b4 = new Book(104, "Sumit");
		a.add(b);
		a.add(b1);
		a.add(b2);
		a.add(b3);
		a.add(b4);
		Iterator<Book> it = a.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
