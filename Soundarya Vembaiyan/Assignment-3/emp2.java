package Assignment4;

import java.io.IOException;
import java.util.Scanner;

public class emp2 {
	public static void main(String args[]) throws IOException {
		double salary[] = { 60000, 20000, 40000, 80500, 35000 };
		try {
			for (double sal : salary) {
				if (sal > 80000) {
					throw new Exception("salary > 80000");
				}
			}
		} catch (Exception e) {
			System.out.println("Salary is more than the ceiling: " + e.getMessage());
		}
	}
}
