package com.Assignment3;

public class SalaryExceptionMain extends SalaryException2 {

	public static void main(String[] args) {
		try {
			Salary(Salary);
		} catch (SalaryException1 e) {

			System.out.println("exception occurd " + e);
		}

	}
}
