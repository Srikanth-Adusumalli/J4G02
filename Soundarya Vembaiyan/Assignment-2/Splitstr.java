//Q-2: Split the given sentence to generate different Strings and Print the String Separately. (using split() method)
package Assignment3;

public class Splitstr {
	public static void main(String args[]) {
		String Str = new String("Split-the-Strings");

		for (String val : Str.split("-", 1))
			System.out.println(val);

		System.out.println("");
		for (String val : Str.split("-"))
			System.out.println(val);
	}
}
