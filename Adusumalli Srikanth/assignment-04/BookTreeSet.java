package assignment4;

import java.util.TreeSet;

public class BookTreeSet {
	

		public static void main(String[] args) {
			TreeSet<Book> bookTreeSet = new TreeSet<Book>();
			 bookTreeSet.add(new Book(104,"Python","Rossum",430.0));
			 bookTreeSet.add(new Book(102,"Java","Sort",1700.0));
			 bookTreeSet.add(new Book(105,"Abinitio","EYX",700.0));
			 bookTreeSet.add(new Book(101,"Informatica","ABC",650.0));
			 bookTreeSet.add(new Book(103,"Core Java","XYZ",200.0));
			System.out.println(bookTreeSet);
			
		}
	}
