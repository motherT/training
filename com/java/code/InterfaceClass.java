package com.java.code;

public class InterfaceClass implements Calculator{
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceClass obj=new InterfaceClass();
		obj.add();
		obj.subt();
	}

	@Override
	public void add() {
		int a =10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		
	}

	@Override
	public void subt() {
		// TODO Auto-generated method stub
		int a=20;
		int b=10;
		int c=a-b;
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mult() {
		// TODO Auto-generated method stub
		
	}

}


interface Calculator
{
	void add();
	void subt();
	void div();
	void mult();
	
}