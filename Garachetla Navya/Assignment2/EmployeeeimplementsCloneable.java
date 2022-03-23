
public class Employeee implements Cloneable {
	int empId;
	String empName;
	public Employeee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	public void displayEmployeee() {
		System.out.println(empId+" "+empName);
	}
	
	public static void main(String args[]) {
		Employeee e1 = new Employeee(10,"Navya");
		Employeee e2 = null;
		try {
			 e2 =(Employeee)e1.clone();
		} catch (CloneNotSupportedException e) {
		
		
			e.printStackTrace();
		}
		e1.displayEmployeee();
		e1.empName="Navya";
		e2.displayEmployeee();
		
		e1.displayEmployeee();
		e2.displayEmployeee();
		
	} 

}

