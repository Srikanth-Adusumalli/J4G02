package ArrayList;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListBook {
	public static void main(String[] args) {

		ArrayList<String>Books = new ArrayList<>();
		// TODO Auto-generated method stub

		Books.add("Ramayana by Valmiki");
		Books.add("Suparipalana by Vyasashailendra joshi");
		Books.add("Bhagavad gita by Vyasa");
		Books.add(" Quran by Abu Bakr");
		Books.add("Bibble by Daniel");


		Iterator<String> Iterate = Books.iterator();
		System.out.println("Books: ");
		while(Iterate.hasNext()) {
			System.out.println(Iterate.next());
			System.out.println("  ");
		}
	}
}




