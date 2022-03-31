package com.strings;
import java.util.ArrayList;
import java.util.stream.Stream;
public class AnyMatchDemo {
	public static void main(String[] args) {
		ArrayList<String> Match = new ArrayList<String>();
		Match.add("Intermediate");
		Match.add("proniounciation");
		Match.add("Verbal");
		Match.add("Appretiate");
		Match.add("Underlina");
		  boolean m = Match.stream().anyMatch(s -> s.endsWith("te"));
		  System.out.println(m);
		Stream<String> streamlist = Match.stream();
		streamlist.filter(n -> n.endsWith("te")).forEach(n -> System.out.println(n));
	}

	}

