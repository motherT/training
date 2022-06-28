package com.java.code;

public class ExceptionHandlingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int i =2/2;
			System.out.println("Print the try block");
		}
		catch(Exception a)
		{
			System.out.println("Cannot divide by Zero");
		}
		System.out.println("Run this part");
	}

}
