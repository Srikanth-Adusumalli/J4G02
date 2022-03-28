package bookobjectsequal;
public class Bookobjects {
	int bookid;
	String bookname;
	String bookauthor;
	
public Bookobjects(int bookid, String bookname, String bookauthor) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.bookauthor = bookauthor;
	}

public static void book(Bookobjects b) {
	System.out.println(b.bookid+" "+b.bookname+" "+b.bookauthor);
}

public static void main(String args[]) {
	Bookobjects b1=new Bookobjects(101,"sa","sd");
	 Bookobjects b2=new Bookobjects(102,"sam","sda");
	 boolean status=(b1.equals(b2));
			 System.out.println("Bookobjects equality status is :"+status);
	 if(status) {
		 System.out.println("objects are equal");
		 }
	 else {
		 System.out.println( "objects are not equal");
}
}
}
	 


