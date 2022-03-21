package com.Assignment2;

public class StringDemo {
	public static void main(String[] args) {

		String a = "RAHUL";
		String s = "rahul";
		String b = "sumit";

		System.out.println(a.equals(s));

		System.out.println(a.equalsIgnoreCase(s));

		System.out.println(a.compareTo(s));

		System.out.println(s.endsWith("L"));

		System.out.println(b.startsWith("s"));
	}

}
