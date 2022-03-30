
public class String {
	 private static boolean hasMatchingSubstring(String str, List<String> substrings) {
	        for (String substring : substrings){
	            if (str.contains(substring)) {
	                return true;
	            }
	        }
	        return false;
	    }
	 
	    public static void main(String[] args) {
	        String day = "Tuesday";
	        List<String> weekend = Arrays.asList("Sat", "Sun");
	 
	        System.out.println(hasMatchingSubstring(day, weekend)? "Yes": "No");        
	    }

}
