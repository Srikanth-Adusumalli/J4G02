package com.Assignment4;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<Integer, String> h = new HashMap<Integer, String>();
		h.put(101, "Rahul");
		h.put(102, "Aditya");
		h.put(103, "Nitin");
		h.put(104, "Ritik");
		h.put(105, "Aman");
		h.put(106, "Shubham");
		h.put(107, "Suraj");
		h.put(108, "Sumit");
		h.put(109, "Akbar");
		h.put(110, "Rohit");

		for (Map.Entry m : h.entrySet()) {
			System.out.println(m.getKey() + " - " + m.getValue());

		}

	}

}
