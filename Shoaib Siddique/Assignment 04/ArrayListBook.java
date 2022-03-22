package com.java.Module4;
import java.util.Iterator;
import java.util.ArrayList;



public class ArrayListBook {

			public static void main(String[] args) {
				
				ArrayList<String>Books = new ArrayList<>();
				// TODO Auto-generated method stub
				
				Books.add("Core java by Mandar Sir");
				Books.add("Python-Django by Apna College");
				Books.add("javascript by Milan Sir");
				Books.add("Mysql databases by Mandar sir");
				Books.add("Java MicroServices by Mander Sir");
				
				
				Iterator<String> Iterate = Books.iterator();
				System.out.println("Books: ");
				
				while(Iterate.hasNext()) {
					System.out.println(Iterate.next());
					System.out.println("  ");
				}
			}
}
				

			
