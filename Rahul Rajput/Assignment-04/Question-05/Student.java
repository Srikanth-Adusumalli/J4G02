package com.Assignment4;

public class Student implements Comparable<Student> {
	String name;
	int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	public int compareTo(Student o) {
		if (age == o.age)
			return 0;
		else if (age < o.age)
			return 1;
		else
			return -1;
	}

}
