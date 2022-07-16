package javaPackage;

public class CustomerMethod {
	
	void fee_paid_amount(int fee)
	{
		System.out.println("Paythe fee amount $"+fee);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerMethod obj =new CustomerMethod();
		obj.fee_paid_amount(400);
		
		CustomerMethod obj1 =new CustomerMethod();
		obj1.fee_paid_amount(600);
		
		CustomerMethod obj2 =new CustomerMethod();
		obj2.fee_paid_amount(800);
		
		CustomerMethod obj3 =new CustomerMethod();
		obj3.fee_paid_amount(900);
	}

}
