package com.learnjobs.assignment;

import java.util.Arrays;
import java.util.List;

public class StreamArrayListCountS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> str= Arrays.asList("sunil","maa","shetty","money","busy","maching","kannada","marathi","hindi","moon","sunny","anil","soumya");
		long strings =str.stream()
		  .filter(string->string.startsWith("s"))
		 .count();
		  System.out.println("total no of strings with s:"+strings);

	}

}