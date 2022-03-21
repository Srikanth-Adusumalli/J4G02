package com.Assignment2;

public class StringSpilit {

	public static void main(String[] args) {

		String a = "i am going in the market";
		String[] arr = a.split("  ");
		for (String s : arr)
			System.out.println(s);

	}

}
