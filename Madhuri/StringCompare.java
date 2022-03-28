package com.strings;
public class StringCompare {
	public static void main(String args[]) {
		String str1=new String("madhu");
		String str2=new String("madhuri");
		String str="how are you";
		System.out.println(str1.toLowerCase());
		System.out.println(str2.toUpperCase());
		System.out.println("str1 equals to str2:"+str1.equalsIgnoreCase(str2));
		System.out.print(str1.compareTo(str2));
		System.out.print(str1.endsWith("i"));
		System.out.print(str1.startsWith("m"));
		if(str1.equals(str2))
		System.out.println("equal");
		else
			System.out.println("not equal");
		String[] result=str.split(str);
		System.out.println("result= ");
		for(String st:result) {
			System.out.println(str+",");
		}
	}
}
