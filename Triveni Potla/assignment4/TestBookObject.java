package com.test.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class TestBookObject {
public static void main(String args[]) {

	        ArrayList<Book> list
	            = new ArrayList<>();
	  
	        list.add(new Book(1, "abc"));
	        list.add(new Book(2, "xyz"));
	        list.add(new Book(3, "pqr"));
	        list.add(new Book(4, "ifg"));
	        list.add(new Book(5, "jkl"));
	       
	  
	        Iterator<Book> iter
	            = list.iterator();
	  
	        while (iter.hasNext()) {
	        	Book b = iter.next();
	            System.out.println(b.id + " "+b.bookName);
	        }
	    }
	}
	class Book{
		int id;
		String bookName;
		
		public Book(int id,String bookName) {
			this.id=id;
			this.bookName=bookName;
			
		}

		@Override
		public String toString() {
			return "Book [id=" + id + ", bookName=" + bookName + "]";
		}
		
		
	}