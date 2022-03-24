
public class Arithmetic {
	
	public static void main(String args[]) {
		
		try {
              int num1=25;
              int num2=0;
              
              int sum=num1/num2;
              System.out.println("result"+sum);
              }
		catch(ArithmeticException e) {
		System.out.println("arithmetic exception occured in the code");
		e.printStackTrace();
		}
	System.out.println("after division");
	
}
}