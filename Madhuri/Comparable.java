package Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Comparable {
	public static void main(String args[]) {
		ArrayList<Comparable1> cl = new ArrayList<Comparable>();
		cl.add(new Comparable(101, "Vijay", 23));
		cl.add(new Comparable(103,"madhu",12));
		cl.add(new Comparable(105, "Jai", 21));

		Collections.sort(c1);
		for (Comparable ct : c1) {
			System.out.println(ct.rollno + " " + ct.name + " " + ct.age);
		}
	}

}


