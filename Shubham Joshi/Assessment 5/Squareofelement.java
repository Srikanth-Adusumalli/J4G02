

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Squareofelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Integer> list = new ArrayList<Integer>();
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        
       // List<Integer> l = list.stream().filter(p->Math.pow(p, p)).map(p->p).collect(Collectors.toList());
        list.stream()
        .distinct()
        .forEach(n -> System.out.println(n + "\t" +(int)Math.pow(n, 2)));
	}

}