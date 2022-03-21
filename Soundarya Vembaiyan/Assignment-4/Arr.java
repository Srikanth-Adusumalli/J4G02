//ass-4--1
package Module4;

import java.util.ArrayList;
import java.util.Iterator;

public class Arr {

	public static void main(String[] args) {

		ArrayList<String> Books = new ArrayList<>();

		Books.add("JAVA");
		Books.add("PYHTON");
		Books.add("HTML");
		Books.add("C#");
		Books.add("PHP");

		Iterator<String> Iterate = Books.iterator();
		System.out.println("Books About Languages: ");

		while (Iterate.hasNext()) {
			System.out.println(Iterate.next());
			System.out.println(" ");
		}
	}

}
