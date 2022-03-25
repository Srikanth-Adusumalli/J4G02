  //1.write a program to show how to handle the exception.
 package assignment3;

public class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i= 111;
		int j=0;
		//int j=2;
		try
		{
		double r =i/j;
		System.out.println(r);
		
		int n=Integer.parseInt("20x");
		System.out.println(n);
		}
		catch(NumberFormatException  e)
		{
			System.out.println("NumberFormatException :"+e.getMessage());
		}
		catch(ClassCastException e)
		{
			System.out.println("ClassCastException");
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException :"+e.getMessage());
		}

	}

}
