package org.javalearning.inheritances;

public class BankChildClassExample extends BankParentClassExample{
	//instance variable
	int a = 30;
	int b = 40;
	
	void rateOfInerest() {
		System.out.println("Rate of interest is 15% in BankChildClassExample");
	}
	
	void display(int a, int b) //local variable
	{
		System.out.println("Parent class value: "+ (super.a+super.b));
		System.out.println("Current class instance variable value: "+ (this.a+this.b));
		System.out.println("Current class local variable value: "+ (a+b));
		this.rateOfInerest();// Here this is optional and represents current class method.
		super.rateOfInerest();// Super keyword represents parent class method.
		
	}

	public static void main(String[] args) {
		BankChildClassExample bc = new BankChildClassExample();
		//By using child class object we can access properties of both Child and Parent class.
		BankParentClassExample bp =  new BankParentClassExample();
		//By using parent class object we can access properties of only Parent class.
		BankParentClassExample b =  new BankChildClassExample();
		//By using parent-child class object we can access properties of only Parent class.
		bc.HDFC_bank();
		bc.ICICI_bank();
		bc.display(100, 200);

	}

}
