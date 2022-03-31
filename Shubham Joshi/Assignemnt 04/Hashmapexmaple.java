import java.util.*;  
public class Hashmapexmaple {
    public static void main(String args[]){
        HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.put(1,"java");
         map.put(2,"c");
          map.put(3,"dbms");
           map.put(4,"os");
            map.put(5,"english");
             map.put(6,"hindi");
              map.put(7,"sanskrit");
               map.put(8,"phython");
                map.put(9,"c++");
                 map.put(10,"communicagion");
                
                 
               
        System.out.println("the values are");
        for(Map.Entry m:map.entrySet()){
         System.out.println(m.getKey()+" "+m.getValue());    
        }
        
    }
}
 