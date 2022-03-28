package serializableDesializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
public class ExceptionHandling {
public String name;
public String SSN;
public int number;
public String address;
	public static void main(String[] args) {
		ExceptionHandling e=new ExceptionHandling();
		e.name="madhuri";
		e.address="cherukur";
		e.SSN="112233";
		e.number=106;
		try {
			FileOutputStream fileOut=new FileOutputStream("C:\\Users\\madhuri\\OneDrive\\Documents");
			ObjectOutputStream in=new ObjectOutputStream(fileOut);
			((ObjectOutput) fileOut).writeObject(e);
			fileOut.close();
			System.out.printf("serialized data is saved in C:\\\\Users\\\\madhuri\\\\OneDrive\\\\Documents" );}
		catch(IOException i) {
			i.printStackTrace();
		}
	}
}
				
