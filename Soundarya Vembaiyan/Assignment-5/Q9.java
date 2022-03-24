//Ass-5:Q(9) Create the List of 10-integers and print the value greater than 20. 
package modules5;

import java.util.Arrays;
import java.util.List;

public class Q9 {

	public static void main(String[] args) {
		List<Integer> arrayList= Arrays.asList(79,20,30,40,25,16,7,18,39,10);
		int no =arrayList.stream().filter(n->(n>20)).findFirst().orElse(null);
		System.out.println(no);
	}
}