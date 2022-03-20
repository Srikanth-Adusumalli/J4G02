package com.assignment2;
import java.lang.*;
public class Equal {

	   public static void main(String[] args) {

	      String str1 = "virat";
	      String str2 = "SRIKNTH";
	      String str3 = "SRIKANTH";
	        
	    System.out.println("str1 equals to str2:"+str1.equals(str2));
	   	System.out.println("str1 equals to str3:"+str1.equals(str3));
	   	
	   	System.out.println("str1 equals to str2:"+str1.equalsIgnoreCase(str2));
		System.out.println("str2 equals to str3:"+str2.equalsIgnoreCase(str3));
		
		System.out.println(str1.compareTo(str3));
		System.out.println(str2.compareTo(str3));
		
		System.out.println(str1.endsWith("ra"));  
		System.out.println(str2.endsWith("TH"));
		
		System.out.println(str1.startsWith("vi"));
		System.out.println(str2.startsWith("SRI"));
	        
	   }
	
}
