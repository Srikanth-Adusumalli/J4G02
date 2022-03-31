package Assignment4;
import java.util.ArrayList;
import java.util.Iterator;

public class Arraybooklist {

	public static void main(String[] args) {
		
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("java book");
		myList.add("php book");
		myList.add("python book");
		myList.add("java 1.0 book");

		Iterator<String> name = myList.iterator();
		while (name.hasNext()) {
			System.out.println(name.next());

		}

	}

}
