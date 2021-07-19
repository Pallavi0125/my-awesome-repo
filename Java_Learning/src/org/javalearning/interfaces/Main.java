package org.javalearning.interfaces;

class Main {
//In real time project we are calling the methods like below.
	public static void main(String[] args) {
		Animal a = new Lion();
			a.sound();
			a.eat();
			a.sleep();
		Bank b = new HDFCBank();
			b.educationLoan();
			b.homeLoan();
			b.goldLoan();
			b.landLoan();
	}

}
