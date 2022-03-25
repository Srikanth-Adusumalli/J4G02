 //3.write a program to create salary of employee

package assignment3;

public class SalaryCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double  salary[] = {50000,55000,65000,70000,80000};
		try {
			for(double sal : salary) {
				if(sal>80000) {
					throw new SalaryException("Salary > 80000");
				}else
				{
					System.out.println(sal +"is valid salary");
				}
			}
		}
		catch(SalaryException e)
		{
			System.out.println("Salary is more "+e.getMessage());
		}

	}

}
