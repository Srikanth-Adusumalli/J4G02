package emplooyeesalary;
public class Employeesalary {
	public static void main(String[] args) {
		double  salary[] = {50000,55000,65000,70000,80000};
		try {
			for(double sal : salary) {
				if(sal>80000) {
					throw new Exception("Salary > 80000");
				}
				else
				{
					System.out.println(sal +"is valid salary");
				}
			}
		}
		catch(Employeesalary e)
		{
			System.out.println("Salary is more "+e.getMessage());
		}

	}


}
