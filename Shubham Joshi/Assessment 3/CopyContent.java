import java.io.BufferedReader;
import java.io.FileReader;
public class CopyContent {

	public static void main(String[] args) {
		String line=null;
		try {
			FileReader fileReader=new FileReader("C:\\Users\\shubham\\Desktop\\learnjob assignmengt\\abc.txt");
			
			BufferReader bufferreader=new BufferReader(fileReader);
			
			while(line=bufferReader.readLine()!=null) {
				System.out.println(line);
			}
			bufferReader.close();
		}
		catch(IOException ex) {
             System.out.println("\nError occured");	
             System.out.println("Exception name:"+ex);	
		}
	}
}

