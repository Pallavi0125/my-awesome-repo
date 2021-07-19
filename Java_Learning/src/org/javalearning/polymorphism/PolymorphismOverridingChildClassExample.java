package org.javalearning.polymorphism;

public class PolymorphismOverridingChildClassExample extends PolymorphismOverridingParentClassExample {

	void hdfcBankLoan() {
		System.out.println("Child class: Hdfc bank will give 15% rate of interest");
	}
	/* Final method can't be override, it will give compilation error.
	 * final void iciciBankLoan() {
	 * System.out.println("ICICI bank will give 10% rate of interest"); }
	 */
	
	// Static method can't be override but method hiding is possible.
	// In below example this is method hiding not method overriding.
	static void federalBankLoan() {
		System.out.println("Child class: Federal bank will give 10% rate of interest");
	}
	
	private void ucoBankLoan()
	// This method is not overriding bcz of private modifier.
	// This method is specific to Child class.
	{
		System.out.println("Child class: Uco bank will give 10% rate of interest");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolymorphismOverridingParentClassExample p =new PolymorphismOverridingChildClassExample();
		p.hdfcBankLoan();
		p.iciciBankLoan();
		p.federalBankLoan();// always execute parent static method, because this static method and execute during .class file loading.
		//If object will create for child class then child class static method will execute.
	}

}
