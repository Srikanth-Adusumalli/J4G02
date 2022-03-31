import java.util.ArrayList;
import java.util.List;

public class StartWitM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>();
		
		list.add("shuham");
		list.add("ayushi");
		list.add("rahul");
		list.add("mohan");
		list.add("Momu");
		list.add("sony");
		list.add("Maya");
		list.add("Mahadvei");
		list.add("ram");
		list.add("sham");
		list.add("Praveen");
		list.add("Mahi");
		list.add("Meenakshi");
		list.add("Tejaaswani");
		list.add("thanuja");
		list.add("ritaaa");
		list.add("ramsingh");
		list.add("mohankumar"); 
		list.add("Shri singh");
		list.add("Sukhi");
		
		
		list.stream().filter(p->p.startsWith("M")).forEach(p->{
			System.out.println(p);
		});
		

	}

}