package Assignment3;

public class Compstr2 {

	public static void main(String[] args) {
		String str1 = "run";
		String str2 = new String("run");
		String str3 = "gun";
		String str4 = "sun";

		System.out.println(str1.compareTo(str2));

		if (str1.compareTo(str2) == 0) {
			System.out.println("str1 is equal to str2");
		} else {
			System.out.println("str1 is not equal to str2");
		}

		System.out.println(str1.compareTo(str3));

		if (str1.compareTo(str3) > 0) {
			System.out.println("str1 is greater than str3");
		} else {
			System.out.println("str1 is less than str3");
		}

		System.out.println(str1.compareTo(str4));
	}
}
