package com.learnjobs.assignment;

import java.util.Objects;

public class Book implements Comparable<Book> {

	int id;
	String name;
	String author;
	@Override
	public int hashCode() {
		return Objects.hash(author, id, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		Book other = (Book) obj;
		if (this.name.equals(other.name))
			return true;
		return false;
	}

	int price;

	public Book(int id, String name, String author, int price) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		if (this.price == o.price)
		return 0;
		else if(this.price > o.price)
		{
			return 1;
		}
		else
		return -1;
	}


}
