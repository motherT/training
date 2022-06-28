package com.java.code;

public class NestedIfClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int performance_score=19;
        int current_salary=20000;
        int increased_salary;
        if(performance_score >= 10 && performance_score<=30)
        {
            increased_salary=current_salary+2000;
            System.out.println("Incemented Salary "+increased_salary);
        }
        else if(performance_score >30 && performance_score <=60)
        {
            increased_salary=current_salary+4000;
            System.out.println("Incremented salary "+increased_salary);
        } 
        else if(performance_score >60 && performance_score <=100)
        {
            increased_salary=current_salary+8000;
            System.out.println("Incremented salary "+increased_salary);
        }
        else 
        {
            System.out.println("Bad performance");
        }
	}

}
