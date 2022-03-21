package Assignment4;

//import java.io.*;
import java.util.*;
import java.io.IOException;

public class emp {

	public emp(String string) {

	}

	public static void main(String[] args) {
		double grossSalary = 2000;
		double incomeTax = 1500;
		double providentFund = 1200;
		double professionalTax = 700;
		double netSalary = grossSalary - (incomeTax + providentFund + professionalTax);
		System.out.println("Net Salary is=" + netSalary);

	}
}
