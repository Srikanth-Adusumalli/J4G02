package com.assignment;

public class HandleArithmenticException {
	public static void main(String arg[])	
	{
	int number1=20,number2=0,division,addition;

	try
	{
		division = number1 / number2;
		System.out.println("Division :" + division);
	}catch(
	ArithmeticException e)
	{
		System.err.println("Can not divid woth zero!!");
	}

	addition=number1+number2;System.out.println("Addition :"+addition);

}}
