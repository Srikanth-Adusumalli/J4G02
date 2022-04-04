package com.test.thread;

import java.util.ArrayList;
import java.util.List;

public class FindAndPrintFirstElement {

	public static void main(String[] args) {
     
		List<Integer> list = new ArrayList<Integer>();
		list.add(18);
		list.add(20);
		list.add(13);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(17);
		list.add(80);
		list.add(19);
		list.add(10);
		
		list.stream().filter(p->p>20).limit(1).forEach(p->{
			System.out.println(p);
		});
	}

}
