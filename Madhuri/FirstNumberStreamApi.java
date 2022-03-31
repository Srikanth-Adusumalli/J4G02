package com.API;

import java.util.ArrayList;

public class FirstNumberStreamApi {
	public static void main(String[] args) {
	ArrayList<Integer> number = new ArrayList<Integer>();
	number.add(4);
	number.add(17);
	number.add(23);
	number.add(65);
	number.add(18);
	number.add(74);
	number.add(116);
	number.add(19);
	number.add(20);
	number.add(25);
	int firstNumber = number.stream().filter(n -> n > 20).findFirst().get();
	System.out.println(firstNumber);
}
}