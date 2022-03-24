import java.io.FileInputStream;
import java.io.ObjectInputStream;
class serilaizeordeserialize  implements java.io.Serializable {
	public int a;
	public String b;
	
	
	public serilaizeordeserialize(int a,int b) {
		this.a=a;
		this.b=b;
		
		
	}
	
}
class Test{
	public static void main(String args[])
	{
		serilaizeordeserialize object=new serilaizeordeserialize();
		String filename="abc.txt";
		
		//serialization
	   try
	   {
		   FileOutputStream file=new FileOutputStream(filename);
		   objecoutputstream out=new objectOutputSteam(file);
		   
		   out.writeObject(object);
		   
		   System.out.println("object has serialized");
	   }
	   catch(IOException ex) {
		   System.out.println("IoException is caughth");
	   }
	   
	   serilaizeordeserialize obejct =null;
	   
	   //deserializataion
	   
	   try
	   {
		   FileInputStream file=new FileInputStream(filename);
		   ObjectInputStream in =new ObjectInputStream(file);
		   
		   object1=(serilaizeordeserialize)in.readObject();
	   
	   in.close();
	   file.close();
	   System.out.println("object has been desrialized");
	   System.out.println("a=" serilaizeordeserialize1.a);
	   System.out.println("a=" serilaizeordeserialize1.b);
	   }
	   
	   
	   catch(IOException ex) {
		   System.out.println("IOException is caught");
	   }
	   catch(classNotFpoundException ex) {
		   System.out.println("class not submit exception");
	   }
	   
	}
}