package com.java.code;

public  class DataAbstractionClass extends Calculate{
	void output()
	{
		System.out.println("Output of Calculate");
	}
	
	void run()
	{
		System.out.println("Run the code ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataAbstractionClass obj = new DataAbstractionClass();
		Calculate a = new DataAbstractionClass();
		a.add();
		a.output();
		
		obj.add();
		obj.output();
		obj.run();
	}

}

abstract class Calculate 
{
	abstract void output();
	
	void add()
	{
		System.out.println("Addition is performed ");
	}
}

