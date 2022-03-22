package com.assignment;

public class HandleMultipleException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{    // because in myMarks Array index [10] not available.
			int[] myMarks = {72, 83, 93};
		      System.out.println(myMarks[10]);
		      
		    } catch (ArrayIndexOutOfBoundsException e) {
              
            	  System.out.println("ArrayIndexOutOfBounds Exception Occurs");  
            	   
              }    
           catch(ArithmeticException e)  
              {  
        	   System.out.println("Arithmetic Exception Occurs"); 
              }    
           catch(Exception e)  // generic way to handling Exceptions.
              {  
               System.out.println("Parent Exception occurs");   
              }             
               
}  
}  

	
