package org.javalearning.polymorphism;

/*Runtime/Dynamic polymorphism[Method Overriding]:
 * To achieve method overriding we required 02 java classes with parent and child relationship.
 * The method implementation already present in parent class: 
 * 	1. If the child class required that implementation then access method from parent class.
 * 	2. If child class doen't require parent method implementation then can override that method in child class and provide the child specific implementation.
 * The child class override super class method to provide parent class method implementation.
 * In Overriding parent class method is called ==>> Overridden method
 *               Child class method is called ==>> Overriding method
 * 
 * Rules: 
 * Note 1:  final class can't inheritance, final method can't be override and final variable can't be reassign the value, otherwise it will give error.
 * final class variables are not final , however final class method is by default final.
 * Because if class is final then we can't inherit the class and without inheritation we can't override the method hence final class, method will be final.
 * 1. Overridden method and overriding method signatures must be same.
 * 2. The return type of overridden method & overriding method must be same(at primitive level).
 * 3. While overriding it is possible to change return type by using co-variant return types concept.
 * 4. Final method can't be override.
 * 5. Static method can't be override but method hiding is possible.
 * 6. Private method can't be override.
 * While overriding it is not possible to maintain same level permission or increasing order but not decreasing.
 * 8. Overriding with exception handling rules.
*/
public class PolymorphismOverridingParentClassExample {
	
	void hdfcBankLoan() {
		System.out.println("Parent class: HDFC bank will give 10% rate of interest");
	}
	
	final void iciciBankLoan() {
		System.out.println("Parent class: ICICI bank will give 10% rate of interest");
	}
	
	static void federalBankLoan() {
		System.out.println("Parent class: Federal bank will give 10% rate of interest");
	}
	
	private void ucoBankLoan() //specific to parent class
	{
		System.out.println("Parent class: Uco bank will give 10% rate of interest");
	}// this method is private , hence can't access outside of this class even using parent-child relationship also.

}
