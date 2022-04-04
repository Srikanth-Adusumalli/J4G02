package com.test.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCamperableClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ArrayList<Student> list= new ArrayList<>();
		  list.add(new Student(1,"Triveni", 24));
		  list.add(new Student(2,"Sireesha", 23));
		  list.add(new Student(3,"Prasnna", 22));
		  list.add(new Student(4,"Ranjitha", 23));

	       System.out.println(list);
	       Collections.sort(list);

	       System.out.println("\nSorted by age");

	       for (int i = 0; i < list.size(); i++)
	           System.out.println(list.get(i));


	}

}
class Student implements Comparable<Student>{  
	int rollno;  
	String name;  
	int age;  
	Student(int rollno,String name,int age){  
		this.rollno=rollno;  
		this.name=name;  
		this.age=age;  
	}  
	  
	public int compareTo(Student st){  
		if(age==st.age)  
		return 0;  
		else if(age>st.age)  
		return 1;  
		else  
		return -1;  
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	} 
	
}  