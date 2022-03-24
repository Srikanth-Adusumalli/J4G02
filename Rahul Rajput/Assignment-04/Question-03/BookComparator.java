package com.Assignment4;

public class BookComparator {
	int Id;
	String Name;
	String Author;
	Double Price;

	public BookComparator(int id, String name, String author, Double price) {
		Id = id;
		Name = name;
		Author = author;
		Price = price;
	}

	public String toString() {
		return "Book1 [Id=" + Id + ", Name=" + Name + ", Author=" + Author + ", Price=" + Price + "]";
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public Double getPrice() {
		return Price;
	}

	public void setPrice(Double price) {
		Price = price;
	}

}
