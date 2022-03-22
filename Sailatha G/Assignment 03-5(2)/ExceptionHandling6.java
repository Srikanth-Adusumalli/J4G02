package com.exception;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ExceptionHandling6 {
	
	private static final String SSN = null;
	private String address;
	private String name;
	private String number;
	
	public static void main(String[] args) {
		
		//TODO Auto-generated method stub
		ExceptionHandling6 e = null;
		try {
			FileInputStream fileIn = new FileInputStream("D:\\a.txt");
			 ObjectInputStream in = new ObjectInputStream(fileIn);
			e = (ExceptionHandling6) in. readObject();
			in.close();
			fileIn.close();
		}  catch (IOException i) {
			i.printStackTrace();
			return;
		} catch (ClassNotFoundException c) {
			System.out.println("Employee class not found");
			c.printStackTrace();
			return;
		}
		
		System.out.println("Deserialized Employee...");
		System.out.println("Name:"+ e.name);
		System.out.println("Address: " + e.address);
		System.out.println("SSN: " + e.number);
		System.out.println("Number: " + e.number);
		
		}
		
	}
	
	

