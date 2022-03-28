package assignment4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortList {
	
		public static void main(String[] args) {
			 List<Book> bookList = new ArrayList<Book>();
			 bookList.add(new Book(104,"Python","Rossum",430.0));
			 bookList.add(new Book(102,"Java","Sort",1700.0));
			 bookList.add(new Book(105,"Abinitio","EYX",700.0));
			 bookList.add(new Book(101,"Informatica","ABC",650.0));
			 bookList.add(new Book(103,"Core Java","XYZ",200.0));
			 
			 bookList.sort(new Comparator<Book>() {
				 				public int compare(Book book1, Book book2) {
				 						return book1.bookPrice.compareTo(book2.bookPrice);}});
			 System.out.println(bookList);
		}
	}

