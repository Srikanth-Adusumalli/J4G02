
import java.util.Map;  
public class HashMapExample1{  
 public static void main(String args[]){  
   HashMap<Integer,String> map=new HashMap<Integer,String>();    
   map.put(1,"A");    
   map.put(2,"B");    
   map.put(3,"C");   
   map.put(4,"D");
   map.put(1,"D");    
   map.put(2,"E");    
   map.put(3,"F");   
   map.put(4,"G");
   map.put(3,"H");   
   map.put(4,"I"); 
       
   System.out.println("Iterating Hashmap...");  
   for(Map.Entry m : map.entrySet()){    
    System.out.println(m.getKey()+" "+m.getValue());    
   }  
}  
}  