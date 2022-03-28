package assignment4;

import java.util.HashMap;

public class HashMap1 {
	public static void main(String[] args) {
		
		HashMap<String,Integer> numbers = new HashMap<>();

	    System.out.println("Initial HashMap: " + numbers);
	    numbers.put("One", 1);
	    numbers.put("Two", 2);
	    numbers.put("Three", 3);
	    numbers.put("Four", 4);
	    numbers.put("Five", 5);
	    numbers.put("Six", 6);
	    numbers.put("Seven", 7);
	    numbers.put("Eight", 8);
	    numbers.put("Nine", 9);
	    numbers.put("Ten", 10);
	    System.out.println("HashMap: " + numbers);
	}

}
