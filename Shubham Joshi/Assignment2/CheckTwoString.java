package module2;
public class CheckTwoString {
	
	public  static void main(String args[]) {
		
		String s1="shubham";
		String s2="joshi";
		
		System.out.println(s1.equals(s2));

		System.out.println(s1.equalsIgnoreCase(s2)); 
		
		System.out.println(s1.compareTo(s2)); 
	
		System.out.println(s1.endsWith("m")); 
		
		System.out.println(s1.startsWith("sh"));
	}

}
