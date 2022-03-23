package com.learnjobs.assignment;

public class SalaryException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculateSalary(50000);
	}

	private static void calculateSalary(int i) {
		if (i > 80000)
			try {
				throw new ExceptionSalary();
			} catch (ExceptionSalary se) {
				System.out.println(se.getMessage());
			}
		else {
			double grossSalary = i + 4000 + 3000;
			System.out.println("gross salary" + grossSalary);
		}
	}

}
