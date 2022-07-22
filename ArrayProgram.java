package javaPackage;

public class ArrayProgram {

	public static void main(String[] args) {
		// //intialize the value in variable in collection of similar data types
		int [] salary= {1000,2000,3000,4000,5000,6000,7000,8000,9000,10000};
		
		//to extract value one by one use for loop and fetch the value at each indexes
		for(int i =0;i< salary.length;i++)
		{
			System.out.println("Salary amount "+salary[i]);
		}
	}

}
