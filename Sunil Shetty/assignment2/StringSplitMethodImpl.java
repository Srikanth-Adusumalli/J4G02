package com.learnjobs.assignment;

public class StringSplitMethodImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "hello_good_morning";

		String[] strings = string.split("_");
		for (String w : strings)

			System.out.println(w);
	}

}
