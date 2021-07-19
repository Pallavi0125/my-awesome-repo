package org.javalearning.interfaces;

public class ICICIBank implements Bank {

	@Override
	public void educationLoan() {
		System.out.println("In ICICI Bank Rate of interest on education loan will be 4%");
		
	}

	@Override
	public void homeLoan() {
		System.out.println("In ICICI Bank Rate of interest on home loan will be 6%");
		
	}

	@Override
	public void goldLoan() {
		System.out.println("In ICICI Bank Rate of interest on gold loan will be 9%");
		
	}

	@Override
	public void landLoan() {
		System.out.println("In ICICI Bank Rate of interest on land loan will be 11.5%");
		
	}

}
