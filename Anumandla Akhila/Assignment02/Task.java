/* class name should be Capitalized like "Task" at line 3
   method name should be verb with camelCase like "doSomething" at line 4
   variable should be in lowercase, if combination of words then in camelCase like empId,EmpName
   Constant should be in all CAPITAL
*/
public class Task {
	public void doSomething() {
		System.out.println("I am doing my work");

	}

	public static void main(String[] args) {
// new Task() is a Object which is stored in heap memory
		// task is reference which is stored in stack memory
		Task task = new Task(); // creating object
		task.doSomething(); // invoking method
		
		Task task1 = new Task();

	}

}
