package com.Assignment5;

import java.util.ArrayList;
import java.util.stream.Stream;

public class AnyMatchDemo {

	public static void main(String[] args) {

		ArrayList<String> Match = new ArrayList<String>();
		Match.add("Componet");
		Match.add("Here");
		Match.add("punit");
		Match.add("Flute");
		Match.add("Translate");

		/*
		 * boolean m = Match.stream().anyMatch(s -> s.endsWith("te"));
		 * System.out.println(m);
		 */

		Stream<String> streamlist = Match.stream();
		streamlist.filter(n -> n.endsWith("te")).forEach(n -> System.out.println(n));

	}

}
