import java.io.File;

public class Multipletrycatch {

	public static void main(String[] args) {
		
		try
		{
			System.out.println("TestTryCatch");
			File f=new File("C:\\Users\\shubham\\Desktop\abc.txt");
			FileInputStream fi=new FileInputStream(f);
			System.out.println("TextTrycatch");
			try
			{
				int first=25;
				int scond=20%2;
				
				int div=first/second;
				System.out.println(Result:"+div");
				
				
			}
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	
		
		catch(FileNotFoundEceptuon e) {
		System.out.println("FileNotFoundException");
		e.printStackTrace();
		
	}
	catch (Exception e) {
		e.printStackTrace();
	}

}
}
