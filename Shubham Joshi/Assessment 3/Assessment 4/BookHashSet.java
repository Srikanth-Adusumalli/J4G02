
import java.util.HashSet;
import java.util.Iterator;


public class BookHashSet {
        public static void main(String args[]){  
 
            HashSet<String> set=new HashSet();
           set.add("c");    
           set.add("c++");    
           set.add("dbms");   
           set.add("java");
           set.add("os");
           
           Iterator<String> i=set.iterator();
           while(i.hasNext()){
               System.out.println(i.next());
           }
}
}