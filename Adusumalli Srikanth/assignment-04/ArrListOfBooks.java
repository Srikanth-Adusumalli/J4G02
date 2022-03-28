package assignment4;

import java.util.ArrayList;

public class ArrListOfBooks {

	public static void main(String[] args) { 
	
		    ArrayList<String> books = new ArrayList<>();
		    books.add("IronMan");
		    books.add("SoftSkills");
		    books.add("Java");
		    books.add("Python");
		    System.out.println("ArrayList: " + books);

		    for (String Books : books) {
		      System.out.print(Books);
		      System.out.print(", ");
		    }
	}

}
