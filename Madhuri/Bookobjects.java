
package bookobjects;
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
	 Bookobjects b3=new Bookobjects(103,"samp","sdab");
	 Bookobjects b4=new Bookobjects(104,"sampl","sdabc");
	 Bookobjects b5=new Bookobjects(105,"sample","sdabcd");

	Bookobjects[] array=new Bookobjects[5];
	
	array[0]=b1;
	array[1]=b2;
	array[2]=b3;
	array[3]=b4;
	array[4]=b5;
	for(int i=0;i<5;i++) {
		book(array[i]);
	}	
}
}
