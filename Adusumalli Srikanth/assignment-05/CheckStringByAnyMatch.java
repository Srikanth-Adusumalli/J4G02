//ass5-Que10;

package assignment5;

import java.util.ArrayList;
import java.util.List;

public class CheckStringByAnyMatch {

	public static void main(String[] args) {
		List<String> words = new ArrayList<String>();
		words.add("Propegate");	words.add("StopIt");	words.add("Neglate");
		words.add("create");	words.add("Right");
		
		boolean match=words.stream().anyMatch(s->s.endsWith("te"));
		System.out.println(match);
	}
}