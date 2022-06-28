package com.java.code;

public class EcomerecApp {
	EcomerecApp(String username, String password)
	{
		System.out.println(username+ " " +password);
	}

	private void run()
	{
		System.out.println("This is method in ecommerece");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EcomerecApp obj= new EcomerecApp("ravi123","1234");
		obj.run();
	}

}
