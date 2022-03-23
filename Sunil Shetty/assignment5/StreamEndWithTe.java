package com.learnjobs.assignment;

import java.util.Arrays;
import java.util.List;

public class StreamEndWithTe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> str = Arrays.asList("sunil", "sunilte", "shette", "busy", "maching");
		boolean ans = str.stream()
				// .filter(string->string.endsWith("te"))
				.anyMatch(string -> string.contains("shette"));
		// .forEach(System.out::println);
		System.out.println(ans);

	}

}
