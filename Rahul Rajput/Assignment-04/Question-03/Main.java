package com.Assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		BookComparator b = new BookComparator(101, "Java", "Rahul", 500.00);
		BookComparator b1 = new BookComparator(102, "Java", "Rahul", 600.00);
		BookComparator b2 = new BookComparator(103, "Java", "Aditya", 400.00);
		BookComparator b3 = new BookComparator(104, "Java", "Rahul", 1000.00);
		BookComparator b4 = new BookComparator(105, "Java", "Rahul", 900.00);
		List<BookComparator> l = new ArrayList<BookComparator>();

		l.add(b);
		l.add(b1);
		l.add(b2);
		l.add(b3);
		l.add(b4);
		Comparator<BookComparator> c = Comparator.comparing(BookComparator::getPrice);
		Collections.sort(l, c);
		for (BookComparator s : l) {
			System.out.println(s);
		}

	}

	public int compare(BookComparator o1, BookComparator o2) {
		return 0;
	}

}
