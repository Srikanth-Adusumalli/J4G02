package welcome.java;

public class Book1 {
int book_id;
String book_Name;
String book_author_name;
public Book1(int book_id , String book_Name ,String book_author_name) {
	this.book_id=book_id;
	this.book_Name=book_Name;
	this.book_author_name=book_author_name;
}
public void printBook() {
	System.out.println("Bookid-->"+book_id+"  " +"BookName....>"+book_Name+"  "+"Book Author Name.....>"+book_author_name);
}
public static void main(String ...strings) {
	Book1 obj =new Book1(11,"Learn java","Ashok");
	Book1 obj1=new Book1(12,"Learn java","Ranjan");
	Book1 obj2 =new Book1(13,"Learn java","Jac");
obj.printBook();
obj1.printBook();
obj2.printBook();

}
}
