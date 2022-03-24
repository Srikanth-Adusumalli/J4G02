package assignment3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DeSerializeBook {
			
		public static void main(String[] args) throws IOException, ClassNotFoundException {
				
				FileInputStream fis=new FileInputStream("E:/read.txt");  
				ObjectInputStream oos=new ObjectInputStream(fis);
				Book b=(Book)oos.readObject();
				System.out.println(b);
				
			}

}
