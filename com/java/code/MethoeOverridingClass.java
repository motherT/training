package com.java.code;

public class MethoeOverridingClass  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Execute obj= new Execute();
		obj.writeCode();
		obj.updateCode();
	}

}

class Code 
{
	
 void writeCode()
 {
	 System.out.println("Write Code ");

 }
 void updateCode()
 {
	 System.out.println("Update the code ");
 }
}

class Execute extends Code 
{
	void updateCode()
	{
		System.out.println(" update code in child class");
	}
}