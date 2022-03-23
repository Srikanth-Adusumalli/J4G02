package com.learnjobs.assignment;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamGreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> str = Arrays.asList(1, 2, 12, 31, 3, 4, 5, 6, 7, 8, 9, 10, 2, 33, 43, 23, 12, 35, 87, 54, 556,
				8765, 43, 34);
		Optional<Integer> data = str.stream().filter(n -> n > 20).findFirst();
		// .forEach(System.out::println);
		System.out.println(data.get());

	}

}
