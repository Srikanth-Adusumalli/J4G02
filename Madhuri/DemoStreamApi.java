package com.API;
import java.util.ArrayList;
import java.util.stream.Stream;
public class DemoStreamApi {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		 al.add("Madhu");
		 al.add("Madhuri");
		 al.add("Sravani");
		 al.add("Archana");
		 al.add("Chandhu");
		 al.add("Abhi"); 
		 al.add("Karthik");
		 al.add("Pooji");
		 al.add("Jay");
		 al.add("Sravanthi");
		 al.add("Anusha");
		 al.add("Chinnu");
		 al.add("Chitti");
		 al.add("Vamsi");
		 al.add("Mahendra");
		 al.add("Suseela");
		 al.add("Malyadri");
		 al.add("Sujatha");
		 al.add("Madhava");
		 al.add("Mounika");
		Stream<String> streamlist= al.stream();
		streamlist.filter(s-> s.startsWith("s")).forEach(s-> System.out.println(s));
		}
	}