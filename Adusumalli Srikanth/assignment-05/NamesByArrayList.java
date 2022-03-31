//ass5-Que6;

package assignment5;

import java.util.ArrayList;
public class NamesByArrayList {

	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("Srikanth");	nameList.add("Siva");	nameList.add("Sanker");
		nameList.add("Sai");	nameList.add("Bala");	nameList.add("Konda");
		nameList.add("Koti");	nameList.add("Mahesh");	nameList.add("Veera");
		nameList.add("Naga");	nameList.add("Punna");	nameList.add("Chanti");
		nameList.add("Tarak");	nameList.add("Mani");	nameList.add("Prabha");
		nameList.add("Srinu");	nameList.add("Ganesh");	nameList.add("Prakash");
		nameList.add("Venky");	nameList.add("Pradeep");
		
		nameList.stream()
		.filter(s->s.startsWith("M"))		//filtering names that starts with M
		.map(s->s)							// mapping names 
		.forEach(s->System.out.println(s));	// iterating mapped names
		
		long count= nameList.stream().filter(s->s.startsWith("S")).count();
		System.out.println("No of elements starts with 'S' : "+count);
	}
}

