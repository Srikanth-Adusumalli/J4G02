
public class SplitString {

	public static void main(String args[])
	{
		Split_method spl = new Split_method ();
		spl.split();
		
	}
	}
class Split_method {
			String s1= "I Love My Self";
			public void split()
			{
				String [] arr = s1.split(" ");
				for(int i=0;i<arr.length;i++)
				{
					System.out.println(arr[i]);
				}
			}
	}