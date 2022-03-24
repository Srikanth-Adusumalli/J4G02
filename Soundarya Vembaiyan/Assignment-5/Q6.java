//Ass-5:Q(6) Create ArrayList of 20 names, and print all the names
package modules5;

import java.util.Arrays;
import java.util.List;

public class Q6 {

	public static void main(String[] args) {
		List<String> nameList = Arrays.asList("Ayush", "Sri", "Mona", "Harika", "Moina", "Sandy", "Krish", "Noor",
				"Meenakshi", "Yash", "Shiv", "Mahadev", "Riya", "Kyra", "Mohan", "Mufash", "Seema", "Thiya", "Soundz",
				"Maalu");
		nameList.stream().filter(name -> name.startsWith("M")).forEach(name -> System.out.println(name));
	}

}

