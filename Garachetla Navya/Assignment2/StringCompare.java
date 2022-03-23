public class StringCompare {
	public static void main(String args[]) {

		String str1 = new String("biki");
		String str2 = new String("bikesh");
		String str = "i am a big fan of Cristiano Ronaldo";

		System.out.println(str1.toLowerCase());
		System.out.println(str2.toUpperCase());

		System.out.println("str1 equals to str2:" + str1.equalsIgnoreCase(str2));
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.endsWith("t"));
		System.out.println(str1.startsWith("b"));

		if (str1.equals(str2))
			System.out.println("equal");
		else
			System.out.println("not equal");

		// split string
		String[] result = str.split(str);

		System.out.println("result = ");
		for (String st : result) {
			System.out.println(str + ",");
		}

	}

}

