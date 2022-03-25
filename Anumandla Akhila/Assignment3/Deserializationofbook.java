

	import java.io.FileOutputStream;
	import java.io.FileInputStream;
	import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
	import java.io.ObjectOutputStream;
	import java.io.Serializable;

	public class Deserializationofbook {
		

		public static void main(String[] args) throws IOException, ClassNotFoundException {
				//Book b1=new Book(101,"Core Java"); 
				FileInputStream fis=new FileInputStream("E:read.text");  
				ObjectInputStream oos=new ObjectInputStream(fis);
				Book b=(Book)oos.readObject();
				System.out.println(b);
				
			}

		}


