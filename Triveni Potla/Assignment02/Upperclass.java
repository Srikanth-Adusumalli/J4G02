package p2;


	public class Upperclass {
		  public static void main(String args[]) {
	     
	        String strInLowerCase = "this string is in lowercase";
	     
	        System.out.println("String before converting to Uppercase");
	        System.out.println("input : " + strInLowerCase);
	     
	        String strInUpperCase = strInLowerCase.toUpperCase(); 
	     
	        System.out.println("String after converting to Uppercase");
	        System.out.println("output : " + strInLowerCase);
	     
	     
	        String upper = "Triveni";
	     
	        String lower = upper.toLowerCase(); 
	        String upperCase=upper.toUpperCase();
	     
	        System.out.println("input String before converting to LowerCase : " + upper);
	        System.out.println("output String after converting to LowerCase : " + lower);
	        System.out.println("output String after converting to LowerCase : " + upperCase);
		        
	    }    
	   
	

}
