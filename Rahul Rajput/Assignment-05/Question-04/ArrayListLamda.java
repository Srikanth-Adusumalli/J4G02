package com.Assignment5;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ArrayListLamda {

	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++)
			number.add(i);
		Consumer<Integer> squareNumbers = (n) -> System.out.print(n * n + " ");
		System.out.println("square of numbers from 1 to 10 ");
		for (Integer i : number)
			squareNumbers.accept(i);
	}
}
