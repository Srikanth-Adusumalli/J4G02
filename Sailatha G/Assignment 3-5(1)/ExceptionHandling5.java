package com.exception;

import java.io.FileOutputStream;

 import java.io.IOException;
import java.io.ObjectOutputStream;

public class ExceptionHandling5 {
	
	
	public String name;
	public int SSN;
	public int number;
	public String address;
	
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		ExceptionHandling5 e = new ExceptionHandling5();
		e.name = "sailatha";
		e.address = "gowkanapalli";
		e.SSN = 987654321;
		e.number = 202;
		
		try {
			FileOutputStream fileOut = new FileOutputStream("D:\\a.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.printf("Serialized data is saved in D:\\a.txt");
		} catch (IOException i) {
			i.printStackTrace();
		}
		
	}
}
