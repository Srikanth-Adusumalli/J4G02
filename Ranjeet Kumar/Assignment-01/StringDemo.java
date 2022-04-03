package welcome.java;

public class StringDemo {
	public static void main(String ... args) {
		String name="java";
		name="Advanced java";
		System.out.println(name);
		System.out.println(name.toUpperCase());
		System.out.println(name.charAt(5));
		System.out.println(name.codePointCount(1, 8));
		StringBuffer sb= new StringBuffer("Jac");
		System.out.println(sb);
		StringBuilder sd=new StringBuilder("Mohan");
		sd.append("Raj");
		System.out.println(sd.capacity());
		System.out.println(sd.charAt(3));
		System.out.println(sb.append("Raj"));
	}

}
