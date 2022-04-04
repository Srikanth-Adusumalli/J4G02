package com.test.thread;

import java.util.ArrayList;
import java.util.List;

public class TestStramApi {

	public static void main(String[] args) {
      List<String> list = new ArrayList<String>();
      
      list.add("Scince");
      list.add("Physics");
      list.add("Social");
      list.add("Arts");
      list.add("SanScrit");
      
     list.stream().filter(p->p.startsWith("S")).forEach(p->{
    	   System.out.println(p);
     });
    long l= list.stream().filter(p->p.startsWith("S")).count();
    System.out.println(l);  
   
	}

}
