package com.test.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

interface ImplimentFunctionInterface{
	boolean filterOddNumbers(int elementList);
}

public class TestFunctionalInterface {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		
		list.add(1);
		list.add(20);
		list.add(40);
		list.add(5);
		list.add(3);
		
		list.forEach(p->{
			System.out.println(p);
		});
		 
		
		 list.stream().filter(n -> n%2!=0).forEach(p->{
			 System.out.println(p);
		 });
		 
	}
}
