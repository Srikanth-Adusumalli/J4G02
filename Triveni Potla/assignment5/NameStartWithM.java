package com.test.thread;

import java.util.ArrayList;
import java.util.List;

public class NameStartWithM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>();
		
		list.add("Triveni");
		list.add("Prasanna");
		list.add("Sireesha");
		list.add("Ranjitha");
		list.add("Mounika");
		list.add("Manisha");
		list.add("Mohini");
		list.add("Moksha");
		list.add("Deva");
		list.add("Vijay");
		list.add("Pavan");
		list.add("Mahima");
		list.add("Manju");
		list.add("Teja");
		list.add("thanuja");
		list.add("Lakshmi");
		list.add("Indira");
		list.add("Swathi");
		list.add("Sruthi");
		list.add("Sukhi");
		
		
		list.stream().filter(p->p.startsWith("M")).forEach(p->{
			System.out.println(p);
		});
		

	}

}
