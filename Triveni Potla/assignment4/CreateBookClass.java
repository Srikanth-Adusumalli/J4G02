package com.test.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CreateBookClass implements Comparator<Book1>{
public static void main(String args[]) {
	 ArrayList<Book1> list
     = new ArrayList<>();
	   list.add(new Book1(1, "book1","triveni",12));
       list.add(new Book1(2,  "book2","ranjitha",20));
       list.add(new Book1(3,  "book3","siri",40));
       list.add(new Book1(4, "book4","prsanna",30));
       list.add(new Book1(5,"book5", "jyothi",10));

       System.out.println(list);

       Collections.sort(list, new CreateBookClass());

       System.out.println("\nSorted by price");

       for (int i = 0; i < list.size(); i++)
           System.out.println(list.get(i));

   }

@Override
public int compare(Book1 o1, Book1 o2) {
	// TODO Auto-generated method stub
	return (int) (o1.price-o2.price);
}

	
}


class Book1{
	int id;
    String name;
    String auther;
    double price;
	public Book1(int id, String name, String auther, double price) {
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