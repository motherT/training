package com.java.code;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankOfAmerica obj =new BankOfAmerica();
		obj.deposit();
		obj.withdraw();
		obj.loan();
		
		
	}

}

class Bank 
{
	protected void loan()
	{
		System.out.println("Loan provided by bank");
	}
}

class BankOfAmerica extends Bank 
{
	void deposit()
	{
		System.out.println("Deposit your money to account");
	}
	void withdraw()
	{
		System.out.println("Withdraw the amount from your account");
	}
}
