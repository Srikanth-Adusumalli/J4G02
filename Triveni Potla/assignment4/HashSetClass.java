package com.test.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class HashSetClass {

	public static void main(String[] args) {
		
	    Set set = new HashSet<Book2>();
		
		set.add(new Book2(1, "book1","triveni", 12.00));
		set.add(new Book2(2, "book2","Prassana", 20.00));
		set.add(new Book2(3, "book3","Sireesha", 40.00));
		set.add(new Book2(4, "book4","ranjitha", 30.00));
		set.add(new Book2(5, "book5","jyothi", 50.00));
		
		Iterator<Book2> itr = set.iterator();
		while(itr.hasNext()) {
			Book2 bk = itr.next();
			
			System.out.println(bk.id+"..."+bk.name+"..."+bk.auther+"..."+bk.price);
			
		}

	}

}

class Book2{
	int id;
    String name;
    String auther;
    double price;
	public Book2(int id, String name, String auther, double price) {
		super();
		this.id = id;
		this.name = name;
		this.auther = auther;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book1 [id=" + id + ", name=" + name + ", auther=" + auther + ", price=" + price + "]";
	}


}