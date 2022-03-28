package file;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Read_Write {
	public static void main(String[] args) {
	
		FileInputStream input=null;
		FileOutputStream output=null;
		File inFile=new File("C:\\Users\\madhuri\\OneDrive\\Documents");
		File outFile=new File("C:\\Users\\madhuri\\OneDrive\\Documents");
		try {
		input=new FileInputStream(inFile);
		output=new FileOutputStream(outFile);
	int ch;
	while((ch=input.read())!=-1) {
	output.write(ch);
	}
		}
			catch(IOException e) {
				System.out.println(e);
				System.exit(-1);
			}
		finally {
			try {
		input.close();
		
		output.close();
		System.out.println("Successfully written to another file....");
	}
			catch(IOException e) {
			}
			}
}
}