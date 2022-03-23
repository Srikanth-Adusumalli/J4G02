
public class Equality {
	public static void main (String[] args) {
		String S1= "JAVA";
		String s2= "JAVA";
		String s3 ="JAVA";
		System.out.println(S1.equals(s2));
		if(S1.equals(s3)) {
			System.out.println(S1.equals(S2));
			if(S1.equals(S3)) {
				System.out.println("both strings are equals");
				
			}else {
				System.out.println("both strings are unequals");
			}
			}
		}
}


