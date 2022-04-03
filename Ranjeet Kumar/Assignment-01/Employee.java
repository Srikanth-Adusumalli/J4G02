package welcome.java;

public class Employee {
	String name;
	int id_no;
	float salary;
	public Employee(String name ,int id_no , float salary ) {
		this.name=name;
		this.id_no=id_no;
		this.salary=salary; 
	}
	void displayEmployeeInformation() {
		System.out.println("Employee Name....>"+name+ " "+"Employee id_no....>"+id_no+" "+"Employee Salary.....>"+salary);
	}
	public static void manin(String ... args) {
		Employee [] workers= {new Employee("Ranjan singh",5,667230),
				new Employee("Sanjay singh",3,667230),
				new Employee("jac",3,3667230),
				new Employee(" poonam Verma",2,667230),
				new Employee("Rocky", 6,967230)};
				for(Employee worker: workers) {
					worker.displayEmployeeInformation();
					System.out.println();
					
				}
	
	}



}
