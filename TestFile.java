package p1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestFile {
public static void main(String args[]) {
	 String line = null;
     try
     {
         FileReader fileReader = new FileReader("D:\\workspace\\p1\\src\\p1\\abc.txt");
         
         // always wrap the FileReader in BufferedReader
         BufferedReader bufferedReader = new BufferedReader(fileReader);
         
         while((line = bufferedReader.readLine()) != null)
         {
             System.out.println(line);
         }
         
         // always close the file after its use
         bufferedReader.close();
     }
     catch(IOException ex)
     {
         System.out.println("\nError occurred");
         System.out.println("Exception Name: " +ex);
     }
}
}
