package assignment2;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Welcome_to_Java_Course";
		String[] words=s.split("_");
		for(int i=0;i<words.length;i++)
		{
			System.out.println(words[i]);
		}

	}

}
