// Write a program to compare the strings with equals(),equalsIgnoreCase(),startswith(),endswith().

package assignment2;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="abc";
		String s2="def";
		if(s1.equals(s2))
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("Not equal");
		}
		
		//equalsIgnoreCase()
		
		String s3="DEF";
		if(s2.equalsIgnoreCase(s3))
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("Not equal");
		}
		
		//Startswith()
		
		String s4= "ghi";
		if(s4.startsWith("g"))
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
		
		//endswith()
		
		if(s4.endsWith("i"))
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
		
		//compareTo
		String s5="Ramesh";
		String s6="Ram";
		
		System.out.println(s5.compareTo(s6));

	}

}
