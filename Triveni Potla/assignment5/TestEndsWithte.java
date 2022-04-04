package com.test.thread;

import java.util.ArrayList;
import java.util.List;

public class TestEndsWithte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("White");
		list.add("Black");
		list.add("Creame");
		list.add("Twite");
		list.add("theete");
       System.out.println(list.stream().anyMatch(p->p.endsWith("te")));
	}

}
