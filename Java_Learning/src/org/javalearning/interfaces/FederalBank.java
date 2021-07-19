package org.javalearning.interfaces;

public class FederalBank implements Bank {

	@Override
	public void educationLoan() {
		System.out.println("In Federal Bank Rate of interest on education loan will be 7% ");
		
	}

	@Override
	public void homeLoan() {
		System.out.println("In Federal bank Rate of interest home loan will be 10% ");
		
	}

	@Override
	public void goldLoan() {
		System.out.println("In Federal Bank Rate of interest gold loan will be 9%");
		
	}

	@Override
	public void landLoan() {
		System.out.println("In Federal Bank Rate of interest land loan will be 12%");
		
	}

}
