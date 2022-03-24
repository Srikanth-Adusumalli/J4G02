package com.Assignment4;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student("Rahul", 22));
		al.add(new Student("Rahul", 20));
		al.add(new Student("Rahul", 15));
		al.add(new Student("Rahul", 30));
		al.add(new Student("Rahul", 25));
		Collections.sort(al);
		for (Student s : al) {
			System.out.println(s);
		}
	}

}
