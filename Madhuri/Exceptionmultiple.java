package Exceptionmultiple;
import java.lang.annotation.*;
public class Exceptionmultiple {
	public static void main(String[] args) {
		try {
	int i=5;
	int j=0;
	 int k=i/j;
	 int m[]= new int[6];
	  m[8]=2;
	 System.out.println("This is madhuri"+k);
		}
	catch(ArithmeticException e)
	{
		System.out.println("Arthmetic Excetion occure");
	}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("This Is Madhu");
         }
	catch(Exception e) {
		System.out.println("This Is Madhuri");
		
	}
}
}