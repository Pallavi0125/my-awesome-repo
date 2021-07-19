package org.javalearning.inheritances;

/*Inheritance: 
 1. Parent-child relationship
 2. Reduce redundancy of the application
 3. Reusable of methods allowed
 Note: 1. If we are not extending any class then by default class extends Object class.
       2. Root class of all java class is Object class and object class belongs to java.lang package.
 	   3. In project level always recommended to create object of child class, 
 	   because child class object can access both child and parent class properties.
 	   4. Java is not supporting Multiple inheritance and Hybrid inheritance, 
 	   because it creates ambiguity issue.
 	   5. Child class can't inherit parent class if parent class is declared final.
 	   		eg: final class A{
        	m1(){}
      		}
          class B extends A{---->> not possible
          }
       6. Super keyword used to represent super class variables/methods.
       		class A{
       		int a;
        	m1(){}
      		}
          class B extends A{
          	m1(){}
          	m2(int a){
          		syso(super.a); // Super class variable
          		syso(this.a); // current class variable
          		syso(a); // local variable
          		this.m1(); // Here this is optional and represents current class method.
          		super.m1(); // Super keyword represents parent class method.
          	}
          }
*/

/*Types of inheritance in Java:
   1. Single inheritance: A<--B
      eg: class A{
        	m1(){}
      		}
          class B extends A{}
   2. Multilevel inheritance: A<--B<--C
      eg: class A{
      		m1(){}
      		}
      	  class B extends A{}
      	  class C extends B{}
   3. Hierarchical inheritance: A<--B, A<--C
      eg: class A{
      		m1(){}
      		}
      	  class B extends A{}
      	  class C extends A{}

 */

public class InheritanceExample1 {
	
	void m1() {
		System.out.println("m1 method");
	}
	void m2() {
		System.out.println("m2 method");
	}

}

 class InheritanceExample2 extends InheritanceExample1{
	 
	void m2() {
		
	}
	
	void m3() {
		System.out.println("m3 method");
	}
	void m4() {
		System.out.println("m4 method");
	}


}
 
class InheritanceExample3 extends InheritanceExample2{

	void m5() {
		System.out.println("m5 method");
	}

	void m6() {
		System.out.println("m6 method");
	}
	
	public static void main(String[] args) {
		InheritanceExample3 i3 = new InheritanceExample3();
		i3.m1();
		i3.m2();
		i3.m3();
		i3.m4();
		i3.m5();
		i3.m6();
	}

} 



/*
 * public class InheritanceExample1 {
 * 
 * void m1() { System.out.println("m1 method"); } void m2() {
 * System.out.println("m2 method"); }
 * 
 * }
 * 
 * class InheritanceExample2 {
 * 
 * void m1() { System.out.println("m1 method"); } void m2() {
 * System.out.println("m2 method"); } void m3() {
 * System.out.println("m3 method"); } void m4() {
 * System.out.println("m4 method"); }
 * 
 * 
 * }
 * 
 * class InheritanceExample3 {
 * 
 * void m1() { System.out.println("m1 method"); }
 * 
 * void m2() { System.out.println("m2 method"); }
 * 
 * void m3() { System.out.println("m3 method"); }
 * 
 * void m4() { System.out.println("m4 method"); }
 * 
 * void m5() { System.out.println("m5 method"); }
 * 
 * void m6() { System.out.println("m6 method"); }
 * 
 * }
 */
 
 
 
 
 
 
 

