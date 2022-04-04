package p1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class TestTryCatch {
public static void main(String args[]) {
	try{
		System.out.println("TestTryCatch");
		File f = new File("D:\\workspace\\p1\\src\\p1\\abc.txt");
		FileInputStream fi = new FileInputStream(f);
		System.out.println("TestTryCatch");
	  try {
		  int firstNum = 25;
			int secondNum = 20%2;
			
			int div = firstNum/secondNum;
			System.out.println("Result : "+ div);
	  }catch (Exception e) {
		// TODO: handle exception
		  e.printStackTrace();
	}
	}catch (FileNotFoundException  e) {
		// TODO: handle exception
		System.out.println("FileNotFoundException");
		e.printStackTrace();
	}
	
	catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
}
