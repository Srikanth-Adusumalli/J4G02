package com.java.Module4;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class BookListShorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<BookListShorting>list = new LinkedList<BookListShorting>();
		
		list.add(new BookListShorting1(1,"java","james",550));
		list.add(new BookListShorting1(110,"javascript","satya",450));
		list.add(new BookListShorting1(15,"python","pichai",600));
		list.add(new BookListShorting1(14,"php","stfen",170));
		list.add(new BookListShorting1(121,"angular","john",200));
		
		//sorting by the price of book
		
		Comparator<BookListShorting> b1 = Comparator.comparing(BookClass1::getBookPrice);
		
		Collections.sort(list,b1);
		System.out.println("Sorted By Price");
		for(BookListShorting1 b :list) {
			System.out.println(b.bookId+" "+b.bookName+" "+b.authorName+" "+b.bookPrice);
		}

	}

}