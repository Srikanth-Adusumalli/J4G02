
public class StringOperation {

	public static void main(String[] args) {
		String s1 = "LearnJobs";
		String s2 = "learnjobs";
		String s3 = "LEARNJOBS";

		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));

		s1 = "Narendra Modi";
		s2 = "Surendra Modi";
		System.out.println(s1.startsWith("Modi"));
		System.out.println(s1.endsWith("Modi"));

		s1 = "Shoaib Siddiqui";
		s2 = "Rayeesh Siddiqui";
		System.out.println(s1.startsWith("Shoaib"));
		System.out.println(s1.endsWith("Rayeesh"));

		System.out.println(s1.indexOf("u"));
		System.out.println(s1.indexOf("v"));
		System.out.println(s1.indexOf("b"));

	}

}