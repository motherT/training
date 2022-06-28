package com.java.code;

public class MethodOverloading {
	
	void add()
	{
		int a =10;
		int b=20;
		int sum =a+b;
		System.out.println(sum);
	}
	
	int add(int a)
	{
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj =new MethodOverloading();
		obj.add();
		System.out.println(obj.add(5));
	}

}
