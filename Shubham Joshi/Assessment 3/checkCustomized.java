
public class checkCustomized {

	private double salery;
	
	public void checksalery(double salery) throws SaleryException{
		if(salery>80000) {
			throw new SaleryException("salery not more than 80000");
		}
		else
		{
			System.out.println("salery should not more than");
		}
	
	}
	public static void main(String args[]) throws SaleryException{
		checkCustomized checkcustomized=new checkCustomized();
		
		checkcustomized.checksalery(6000);
	}
}

class SaleryException{
	public saleryException
	super();
}

public SaleryException(String msg) {
	super(msg);
}
