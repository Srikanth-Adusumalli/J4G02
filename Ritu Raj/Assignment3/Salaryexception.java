package Assgnment3;

public class Salaryexception {

	public static void main(String[] args) {
		calculateSalary(50000);
	}

	private static void calculateSalary(int i) {
		if (i > 80000)
			try {
				throw new Exception();
			} catch (Exception se) {
				System.out.println(se.getMessage());
			}
		else {
			double grossSalary = i + 2000 + 3000;
			System.out.println("gross salary" + grossSalary);
		}

	}

}
