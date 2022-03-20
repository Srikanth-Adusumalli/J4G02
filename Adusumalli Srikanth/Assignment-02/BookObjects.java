package com.assignment2;

public class BookObjects {
	public static void main(String[] args) {
		String s1 = "NewThings";
		String s2 = "NewThings";
		String s3 = "NewBook";
		System.out.println(s1.equals(s3));
		if(s1.equals(s2)) {
			System.out.println("both strings are equal");
		} else {
			System.out.println("both strings are not equal");
		}
	}
}
