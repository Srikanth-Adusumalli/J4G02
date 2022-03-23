package com.learnjobs.assignment;

import java.util.HashSet;

public class PrintBookObjectProcessing {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintBookObject PrintBookObject = new PrintBookObject(1, "java1.0", "sam", 200);
		PrintBookObject PrintBookObject1 = new PrintBookObject(2, "java2.0", "john", 100);
		PrintBookObject PrintBookObject2 = new PrintBookObject(3, "java2.0", "sunil", 700);
		PrintBookObject PrintBookObject3 = new PrintBookObject(4, "php1.0", "gosling", 600);
		PrintBookObject PrintBookObject4 = new PrintBookObject(5, "c++.1.0", "peter", 500);

		HashSet<PrintBookObject> PrintBookObjectcollection = new HashSet<PrintBookObject>();
		PrintBookObjectcollection.add(PrintBookObject);
		PrintBookObjectcollection.add(PrintBookObject1);
		PrintBookObjectcollection.add(PrintBookObject2);
		PrintBookObjectcollection.add(PrintBookObject3);
		PrintBookObjectcollection.add(PrintBookObject4);

		for (PrintBookObject b : PrintBookObjectcollection) {
			System.out.println(b);
		}

	}
}