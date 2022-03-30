package com.Assignment5;

import java.util.ArrayList;

public class FirstNumberStreamAPI {

	public static void main(String[] args) {

		ArrayList<Integer> number = new ArrayList<Integer>();
		number.add(1);
		number.add(15);
		number.add(55);
		number.add(64);
		number.add(12);
		number.add(77);
		number.add(11);
		number.add(14);
		number.add(89);
		number.add(23);

		int firstNumber = number.stream().filter(n -> n > 20).findFirst().get();
		System.out.println(firstNumber);

	}

}
