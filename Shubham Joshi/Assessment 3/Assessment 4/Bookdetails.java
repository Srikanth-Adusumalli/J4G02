
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shubham
 */
public class Bookdetails {
 
    public static void main(String args[]){
        ArrayList<Book> list=new ArrayList();
        
        list.add(new Book(1,"abc"));
         list.add(new Book(2,"xyz"));
         list.add(new Book(3,"xcv"));
         list.add(new Book(4,"zsa"));
             list.add(new Book(5,"abc"));
    
             
             Iterator<Book> iter=list.iterator();
             
             while(iter.hasNext()){
                 Book b=iter.next();
System.out.println(b.id+" "+b.booknName);

             }

    }
}
class Book1
{
    int id;
    String bookname;

    public Book1(int id, String bookname) {
        this.id = id;
        this.bookname = bookname;
    }
    
    public String toString(){
        return "Book[id="+ id +",bookname="+ bookName +"]";
    }
}
