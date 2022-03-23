package com.learnsjobs.assignment;

public class AverageCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 10, 20, 30, 40, 50 };
		additionOFNumbers(array);

	}

	private static void additionOFNumbers(int[] array) {
		long sum = 0;
		for (int arrays : array)
			sum = sum + arrays;

		System.out.println("the addition of numbers is:" + sum);
		System.out.println("the average all  numbers is:" + sum / array.length);

	}

}
