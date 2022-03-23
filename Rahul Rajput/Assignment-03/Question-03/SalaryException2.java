package com.Assignment3;

public class SalaryException2 {
	static double Salary = 400000;
	static final double f = 80000;

	static void Salary(final double Salary) throws SalaryException1 {
		if (Salary > f) {
			throw new SalaryException1(" Salary is more than 80000");
		} else {
			System.out.println("Your Salary is - " + Salary);
		}
	}
}
