package hashmap;
import java.util.HashMap;
import java.util.Map.Entry;
public class Hashmap {
	public static void main(String[] args) {
	HashMap <Integer, String> hasgMap = new HashMap<>();
	
	hasgMap.put(1, "Madhuri");
	hasgMap.put(2, "Sravani");
	hasgMap.put(3, "Sravanthi");
	hasgMap.put(4, "Anusha");
	hasgMap.put(5, "Vara Lakshmi");
	hasgMap.put(6, "Madhu Chandhana");
	hasgMap.put(7, "Abhi Maharshi");
	hasgMap.put(8, "Poojitha");
	hasgMap.put(9, "Jai Krishna");
	hasgMap.put(10, "Archana");
	hasgMap.put(11, "Karthik");
	hasgMap.put(12, "Dhanush");
	
	
	System.out.println("Itereating hashmap:");
	
	for(Entry<Integer, String> m: hasgMap.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
	}	
}


}

