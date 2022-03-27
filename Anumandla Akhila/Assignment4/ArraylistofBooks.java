package Assignment4;
import java.util.Iterator;
import java.util.ArrayList;

public class ArraylistofBooks {



			public static void main(String[] args) {
				
				ArrayList<String>Books = new ArrayList<>();
				
				
				Books.add("india is my country");
				Books.add("the nation");
				Books.add("pm of narendra modi");
				Books.add("cm of kcr");
				Books.add("the politionism");
				
				
				Iterator<String> Iterate = Books.iterator();
				System.out.println("Books: ");
				
				while(Iterate.hasNext()) {
					System.out.println(Iterate.next());
					System.out.println("  ");
				}
			}
}
				

