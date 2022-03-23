package com.learnjobs.assignment;

import java.util.Objects;

public class PrintBookObject{

	int id;
	String name;
	String author;
	int price;

	public PrintBookObject(int id, String name, String author, int price) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
	}

	@Override
	public String toString() {
		return "PrintBookObject [id=" + id + ", name=" + name + ", author=" + author + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		// return Objects.hash(author, id, name, price);
		return name.length() *4;
	}

	@Override
	public boolean equals(Object obj) {
		PrintBookObject other = (PrintBookObject) obj;
		if (this.name.equals(other.name))
			return true;
		return false;
	}

}
