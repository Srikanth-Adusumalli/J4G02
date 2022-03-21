//Q-1: Compare the strings with equals() and equalsIgnorecase, compareTo(), endsWith(), startsWith() in JAVA
package Assignment3;

public class Compstr {

	public static void main(String[] args) {
		String str = "This is a test string";
		String str1 = new String("This");
		System.out.println("String for comparison -- " + str.substring(0, 4));

		System.out.println(str.substring(0, 4).equals("This"));
		System.out.println(str.substring(0, 4).equals("this"));

		System.out.println(str.substring(0, 4).equalsIgnoreCase("this"));
		System.out.println(str1.equalsIgnoreCase("this"));
	}
}
