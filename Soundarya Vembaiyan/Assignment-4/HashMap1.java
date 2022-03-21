//ass-4--2

package Module4;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();

		map.put(1, "Sanem");
		map.put(2, "Brindha");
		map.put(3, "Joyt");
		map.put(4, "Dev");
		map.put(5, "Vishwa");
		map.put(6, "canyaman");
		map.put(7, "Karnan");
		map.put(8, "Harman");
		map.put(9, "Ayush");
		map.put(10, "Thiya");

		System.out.println("Iterating HashMap:");

		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
