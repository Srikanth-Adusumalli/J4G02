package Assignment4;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {
	public static void main(String args[]) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();

		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		map.put(5, "E");
		map.put(6, "F");
		map.put(7, "G");
		map.put(8, "H");
		map.put(9, "I");
		
		System.out.println("Interating Hashmap...");
		for(Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

}
