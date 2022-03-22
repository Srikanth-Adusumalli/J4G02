package com.assignment;
import java.util.Scanner;
public class SalaryException extends Exception {
	public static void main(String arg[]) {
				double grossSalary, incomeTax, providentFund, netSalary;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter Gross salary :");
		grossSalary = sc.nextDouble();
		
		System.out.print("enter Income Tax % :");
		incomeTax = sc.nextDouble();

		System.out.print("enter Provident Fund % :");
		providentFund = sc.nextDouble();
		
		providentFund = providentFund * (grossSalary / 100);
		incomeTax = incomeTax * (grossSalary / 100);

		netSalary = grossSalary - incomeTax - providentFund;
		if (grossSalary > 80000)
			
			try {
				throw new SalaryException();
			} 
		    catch (SalaryException se) {
				System.err.println(se.getMessage() + "Salary is beyond Range!!!");
			}
		else {

			netSalary = grossSalary - incomeTax - providentFund;
			System.out.println("Net Salary is=" + netSalary);
		}
	}
}
