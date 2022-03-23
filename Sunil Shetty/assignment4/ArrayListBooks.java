package com.learnjobs.assignment;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListBooks {

	public static void main(String[] args) {
		// TODO Auto-generated method stuba
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("java book");
		myList.add("php book");
		myList.add("python book");
		myList.add("java 1.0 book");

		Iterator<String> name = myList.iterator();
		while (name.hasNext()) {
			System.out.println(name.next());

		}

	}
}
