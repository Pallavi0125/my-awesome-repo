package org.javalearning.interfaces;

public class HDFCBank implements Bank {

	@Override
	public void educationLoan() {
		System.out.println("In HDFC Bank Rate of interest education loan will be 5%");
		
	}

	@Override
	public void homeLoan() {
		System.out.println("In HDFC Bank Rate of interest home loan will be 7% ");
		
	}

	@Override
	public void goldLoan() {
		System.out.println("In HDFC Bank Rate of interest on gold loan will be 9% ");
		
	}

	@Override
	public void landLoan() {
		System.out.println("In HDFC Bank Rate of interest land loan will be 11% ");
		
	}

}
