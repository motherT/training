package com.java.code;

public class TestingPolymorphim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestingPolymorphim p = new TestingPolymorphim();
		// method overloading 
        p.show(5);
        p.show();
        
        // method overriding 
     Dog d = new Dog();
        d.eat();
	}
	
	void show() {
        System.out.println("nothing to print");
    }
    void show(int i) {
        System.out.println("your value is : " +i);
        
    }
    
  

}

class Animal{
    void eat()
    {
        System.out.println("eating.......");
        
    }
    
}
//class Dog inherits Animal
class Dog extends Animal{
    void eat()
    {
        System.out.println("eating.......inside dog...");
        
    }
    
}