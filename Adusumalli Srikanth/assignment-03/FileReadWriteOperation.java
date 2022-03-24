package assignment3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;

public class FileReadWriteOperation {
	public static void main(String[] args) throws IOException {
		File f1=new File("E:/read.txt");
		FileReader fr = new FileReader(f1);
		BufferedReader br = new BufferedReader(fr);
		String s = br.readLine();
		
		File f2=new File("E:/write.txt");
		FileWriter fw = new FileWriter(f2);
		BufferedWriter bw = new BufferedWriter(fw);
		while(s!=null)
		{
			bw.write(s);
			bw.newLine();
			System.out.println(s);
			s=br.readLine();
		}
		bw.flush();
		bw.close();
	}

}
