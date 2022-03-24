package Assesment;

public class BookAcquire {

	public static void main(String args[]){
		Book[] books;
				
				books=new Book[5];
				
				books[0]=new Book(0, "java","horseman");
		

				books[1]=new Book(1, "c++","rone");
				
				books[2]=new Book(2, "c","deny");
			
				books[3]=new Book(3, "dbms","rone");
				
				books[4]=new Book(4, "os","sany");
				
				 for (int i = 0; i <books.length; i++) {
			            System.out.println("Element at " + i + " : " +
			                        books[i].bookName +" "+books.length);
				 }
		
		
	}
}
