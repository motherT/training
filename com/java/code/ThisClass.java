package com.java.code;

public class ThisClass {
int age;
ThisClass(int age)
{
	this.age=age;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisClass obj=new ThisClass(8);
		System.out.println(obj.age);
	}

}
