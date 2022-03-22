package module2;

public class checkequal {

	int bookid;
	String bookName;
    String author;
    
    
	public checkequal(int bookid, String bookName, String author) {
		super();
		this.bookid = bookid;
		this.bookName = bookName;
		this.author = author;
	}
	
	
	
	public boolean equlas(Object o) {
		checkequal chh=(checkequal)o;
		if(this.bookid==chh.bookid && this.bookName==chh.bookName && this.author.equals(chh.author));
		return true;
	
	}
	public static void main(String[] args) {
		checkequal ch1=new checkequal(101,"Java","david");
		   checkequal ch2=new checkequal(102,"c++","ram singh");
		
	
		if(ch1.equals(ch2))
			System.out.println("Objects are equals");
		else
			System.out.println("Objects are not equal");
	}
	
    
    
}
