//ass-4--5(2)
package Module4;

import java.util.ArrayList;
import java.util.Collections;

public class Comparable2 {

	public static void main(String[] args) {

		ArrayList<Comparable1> c = new ArrayList<Comparable1>();

		c.add(new Comparable1(1, "JAMES", 21));
		c.add(new Comparable1(2, "AYUSH", 22));
		c.add(new Comparable1(3, "LILLY", 23));
		c.add(new Comparable1(4, "MAGILY", 24));

		Collections.sort(c);

		for (Comparable1 c1 : c) {

			System.out.println(c1.rno + " " + c1.name + " " + c1.age);

		}

	}
}
