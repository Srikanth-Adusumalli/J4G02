

import java.util.ArrayList;
import java.util.List;

interface FunctionalInterface{
	boolean filterOddNumbers(int elementList);
}

public class printOnlyOdd {

	public static void main(String[] args) {
		 
		List<Integer> elementsList = new ArrayList<Integer>();
		elementsList.add(1);
		elementsList.add(2);
		elementsList.add(3);
		elementsList.add(4);
		elementsList.add(5);
		 
		FunctionalInterface filterOddNumbersFunc = (a -> a % 2 != 0);
		 
		for (Integer listElement : elementsList) {
		 
		System.out.println(filterOddNumbersFunc.filterOddNumbers(listElement));
		 
		}
		 
		}
}