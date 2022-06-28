package com.java.code;

public class AddNumber {
	
	
	
	 void add()
	{
		// locally 
		int a =10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
	}
	
	int sub(int a , int b)
	{
		
		int su = a-b;
		return su;
	}
	AddNumber(String a ,String b)
	{
		System.out.println(a+ " " +b );
	}

	public static void main(String[] args) {
		// Creation of object
		EcomerecApp obj1=new EcomerecApp("ravi123","1234");
		
		int a=10;
		
		AddNumber obj= new AddNumber( "username", "password");
		obj.add();
		System.out.println(a);
		System.out.println(obj.sub(20,10));
		System.out.println(obj.sub(50,60));
		
	}

}
