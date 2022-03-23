package com.learnjobs.assignment;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ArrayList<Integer> numbers = new ArrayList<Integer>();
		    numbers.add(5);
		    numbers.add(9);
		    numbers.add(8);
		    numbers.add(1);
		    numbers.add(3);
		    numbers.add(76);
		    numbers.add(89);
		    numbers.add(22);
		    Consumer<? super Integer> numbers1=(n) -> { System.out.println(n%2==0);};
		    
		    numbers.forEach( numbers1);
	}
	}

 