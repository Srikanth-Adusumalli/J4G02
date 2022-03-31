package com.Assignment5;

import java.util.function.Predicate;
import java.util.ArrayList;

public class PredicateDemo {

	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<Integer>();
		number.add(1);
		number.add(15);
		number.add(55);
		number.add(64);
		number.add(12);
		number.add(77);
		number.add(11);
		number.add(14);
		number.add(89);
		number.add(23);

		for (Integer integer : number) {

			Predicate<Integer> Odd = odd -> odd % 2 == 1;

			if (Odd.test(integer)) {
				System.out.println(integer);
			}
		}

	}

}
