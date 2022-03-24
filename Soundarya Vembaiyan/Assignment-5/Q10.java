//Ass-5:Q(10) Create the List of 5 strings and check the strings end with "te"
package modules5;

import java.util.Arrays;
import java.util.List;

public class Q10 {

	public static void main(String[] args) {
		List<String> nameList = Arrays.asList("Date", "Miracle", "Duplicate", "Thankyou", "Remote");

		nameList.stream().filter(name -> name.endsWith("te"))
				.forEach(name -> System.out.println("Ending words in 'te' = " + name));
	}
}