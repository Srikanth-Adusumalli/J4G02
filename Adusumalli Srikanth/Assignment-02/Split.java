package com.assignment2;

public class Split {
	public static void main(String args[])
    {
        String str = "javaprogram@training@Learnjobs";
        String[] arrOfStr = str.split("@");
 
        for (String a : arrOfStr)
            System.out.println(a);
    }

}
