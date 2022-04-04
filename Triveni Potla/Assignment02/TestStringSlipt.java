package p2;

public class TestStringSlipt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Java is Opps Oriented programm";
		String[] s1=str.split(" ");
		if(s1.length>0) {
			for(int i=0;i<s1.length;i++) {
				System.out.println(s1[i]);
			}
		}
	}
}
