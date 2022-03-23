
public class Split {
	public static void main(String[] args) {
		String str="h1 how are you";
		String split[]=str.split(" ",0);
		for(String s:split) {
			System.out.println(s);
		}
	}

}
