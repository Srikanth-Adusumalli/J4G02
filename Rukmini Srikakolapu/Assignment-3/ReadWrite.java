 //4.write a program to read from file and write its content

package assignment3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc= new Scanner(System.in);
		System.out.println("Enter file name : ");
		String filename = sc.next();
		
		try {
			FileInputStream fis=new FileInputStream(filename);
			FileOutputStream fos=new FileOutputStream(filename+"Out");
			int i=0;
			while((i=fis.read()) !=-1){
				fos.write(i);
			}
			
			fos.close();
			fis.close();
		}catch(FileNotFoundException e)
		{
			System.out.println("File doesnt exist!");
		}
		catch(IOException e)
		{
			
		}

	}

}
