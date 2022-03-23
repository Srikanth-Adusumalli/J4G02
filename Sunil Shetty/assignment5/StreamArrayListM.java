package com.learnjobs.assignment;

import java.util.Arrays;
import java.util.List;

public class StreamArrayListM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  List<String> str= Arrays.asList("sunil","maa","shetty","money","busy","maching","kannada","marathi","hindi","moon","sunny","anil","soumya");
  str.stream()
  .filter(string->string.startsWith("m"))
  .forEach(System.out::println);
  
  
  
	}

}
