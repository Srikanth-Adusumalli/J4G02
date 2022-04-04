package p2;

public class Book {
	 private String title;
	 private String author;
     private int year;
	 public Book(String title, String author, int year) {
		super();
		this.title = title;
		this.author = author;
		this.year = year;
	}
     
	public static void main(String args[]) {
		Book b1 = new Book("abc","xyz",20);
		Book b2 = new Book("abc","xyz",20);
		
		if(b1.equals(b2)) {
			System.out.println("Both Object Equals");
		}else {
			System.out.println("Both Object Not Equals");
		}
		System.out.println(b1==b2);
		System.out.println(b1.equals(b2));
	}
		
       
 }
     


