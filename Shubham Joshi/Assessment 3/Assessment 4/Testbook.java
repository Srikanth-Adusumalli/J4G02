/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import static java.util.Collections.list;
public class TestBook {
  public static void main(String args[]){
      
      ArrayList<Book>List=new ArrayList<>();
      list.add(new Book(1,"abc"));
      list.add(new Book(2,"xyz"));
      list.add(new Book(3,"pr"));
      list.add(new Book(4,"jdd"));
      list.add(new Book(5,"kkk"));
      
      Iterator<Book> iter=list.iterator();
      
      while(iter.hasNext()){
          Book b=iter.next();
          System.out.println(b.id +" "+b.bookName);
      }
  }   
}
class Book{
    int id;
    String bookname;
    
   public Book(int i,String bookName){
       this.id=id;
       this.bookName=bookName;
   }
   public String toString(){
       return "Book [id=" + id +",bookName="+ bookName + "]";
   }
}s