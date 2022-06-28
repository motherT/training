package com.java.code;

public class EncapsulationClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Test a = new Test();
			a.setNumber(10);
			System.out.println(a.getNumber());
	}

}

class Test
{
	private int num ;
	
	
	void setNumber(int num)
	{
		this.num=num;
	
	}
	
	int getNumber()
	{
		return num;
	}
}
