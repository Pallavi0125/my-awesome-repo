package org.javalearning.polymorphism;

/*Polymorphism: One functionality with different actions is called polymorphism
  Poly+morphism = Many+Form = Many forms
  There are 2 types of polymorphism: 
  1. Compile time/static binding/early binding polymorphism : Binding is done during compile time
  		eg: Method overloading: If java class contains more than one method with same name 
  			but different number of arguments or same numbers 
  			but different data types those methods are called overloaded method
  			eg: void m1(int a)
  				void m1(int a, int b)
  				or
  				void m1(int a)
  				void m1(char ch)
  		Types: 
  			1. Method overloading
  			2. Constructor overloading
  			3. Operator overloading
  2. Run time/dynamic binding/late binding polymorphism
  		eg: Method overriding: 
*/
public class PolymorphismMethodOverloadingExample {
	
	void m1(int a) {
		System.out.println("int-argument method");
	}
	void m1(int a, int b) {
		System.out.println("int,int-argument method");
	}
	void m1(char ch) {
		System.out.println("char-argument method");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolymorphismMethodOverloadingExample p = new PolymorphismMethodOverloadingExample();
		p.m1(10);
		p.m1(10, 20); // here mapping is done at the time of compilation 
		p.m1('c');   //that's why it's called Compile time polymorphism.
		

	}

}
