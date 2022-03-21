//Q-4: Equality of book objects using equals()
package Assignment3;

public class equality {
	public static void main(String[] args) {
		String s1 = "JAVA";
		String s2 = "JAVA";
		String s3 = "JAVA";
		System.out.println(s1.equals(s2));

		if (s1.equals(s3)) {
			System.out.println("both strings are equal");
		} else {
			System.out.println("both strings are unequal");
		}
	}
}
