
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
public class Comparatble1 {
    public static void main(String args[]){  
  
        ArrayList <book> list=new ArrayList<>();
            list.add(new book(101,"java","ram",100)); 
             list.add(new book(102,"c++","shyam",110)); 
              list.add(new book(103,"mongo db","david",150));
               list.add(new book(104,"phython","parkar",200)); 
                list.add(new book(105,"angular js","shriram",500)); 
              
             
             Collection.sort(list,new Comparator<book>(){
            
                 public int Compare(book o1,Book o2){
  
                     if(o1.price>o2.price){
                      return 1;
                     }
                     else
                     {
                         return 0; 
                     }
                 }
             });
             System.out.printlist(list);
   }
}
class Book2{
    int id;
    String name;
    String auther;
    double price;

    public Book2(int id,String name,String author,double price) {
        Super();
        
        this.id=id;
        this.name=name;
        this.author=author;
        this.price=price;
        

        
        
    }
    
    public String toString(){
       return "Book2[id=" + id +",name=" + name +",price=" + price +"]"; 
    }
}