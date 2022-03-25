
public class CompareString {
	

		public static void main(String[] args) {
			String s1 = "index";
			String s2 = "index";
			String s3 = "INDEX";

			System.out.println(s1.equals(s2));
			System.out.println(s1.equalsIgnoreCase(s2));
			System.out.println(s1.equalsIgnoreCase(s3));

			s1 = "Apj Abdhulkalam";
			s2 = "Apj Vijendra bhusion";
			System.out.println(s1.startsWith("Apj"));
			System.out.println(s1.endsWith("Apj"));

			s1 = " country india";
			s2 = "nature india";
			System.out.println(s1.startsWith("country"));
			System.out.println(s1.endsWith("nature"));

			System.out.println(s1.indexOf("a"));
			System.out.println(s1.indexOf("t"));
			System.out.println(s1.indexOf("r"));

		}

	}


