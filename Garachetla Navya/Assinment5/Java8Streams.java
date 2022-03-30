
public class Java8Streams {
	 public static long[] NumbersWithDigitInside(long x, long d)
	  {
	    if(d > x) return new long[3];
	    List<Integer> list = new ArrayList<Integer>();

	    for(int i = 1; i <= x; i++){
	      String current = String.valueOf(i);
	      if(current.contains(String.valueOf(d))){
	        list.add(i);  
	      }
	    }
	    return new long[]{list.size(),
	                list.stream().mapToInt(Integer::intValue).sum(),
	                list.stream().reduce(1, (a,b) -> a*b)};
	  }
	
	}

