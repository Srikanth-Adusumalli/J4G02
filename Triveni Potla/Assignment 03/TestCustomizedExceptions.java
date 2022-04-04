package p1;

 class TestCustomizedExceptions {
	
	 private double salary; 
	 
	 public void checkSalary(double salary) throws SalaryException {
		 if(salary>80000) {
			 throw new SalaryException("Salary Should not more then 80000");
		 }else {
			 System.out.println("Employee salary less then or equal 80000");
		 }
	 }
	 
	public static void main(String[] args) throws SalaryException {
		TestCustomizedExceptions customizedExceptions = new TestCustomizedExceptions();
		customizedExceptions.checkSalary(70000);
	}

}

class SalaryException extends Exception{
	
	public SalaryException() {
		super();
	}
	public SalaryException(String msg) {
		super(msg);
	}
}