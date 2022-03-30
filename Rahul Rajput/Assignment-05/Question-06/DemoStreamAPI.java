package com.Assignment5;

import java.util.ArrayList;
import java.util.stream.Stream;

public class DemoStreamAPI {

	public static void main(String[] args) {
	 ArrayList<String> al=new ArrayList<String>();
	 al.add("Mohit");
	 al.add("Manish");
	 al.add("Sumit");
	 al.add("Suresh");
	 al.add("Manoj");
	 al.add("Rahul"); 
	 al.add("Aditya");
	 al.add("Nitin");
	 al.add("Suraj");
	 al.add("Manisha");
	 al.add("Ritik");
	 al.add("Monu");
	 al.add("Sammer");
	 al.add("Akhil");
	 al.add("Chetan");
	 al.add("Chirag");
	 al.add("Yash");
	 al.add("Sunita");
	 al.add("Sahil");
	 al.add("Sameer");
	
	Stream<String> streamlist= al.stream();
	streamlist.filter(m-> m.startsWith("M")).forEach(m-> System.out.println(m));

	}

	
	}











