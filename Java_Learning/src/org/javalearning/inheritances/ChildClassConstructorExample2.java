package org.javalearning.inheritances;

//If we don't call any parent class constructor 
//then compiler generates "super" keyword in first line of each child class constructor which always calling 0-arg constructor i.e: super().
// And if 0-arg constructor will not be present in parent class
// then It will give compilation error in child class constructor.
public class ChildClassConstructorExample2 extends ParentClassConstructorExample2{
	ChildClassConstructorExample2(){
		// super(); -->> Code is generated by compiler.
		System.out.println("Child class 0-arg constructor");
	}
	ChildClassConstructorExample2(int a){
		// super(); -->> Code is generated by compiler.
		System.out.println("Child class 1-arg constructor");
	}
	ChildClassConstructorExample2(int a, int b){
		// super(); -->> Code is generated by compiler.
		System.out.println("Child class 2-arg constructor");
	}

	public static void main(String[] args) {
		new ChildClassConstructorExample2();
		new ChildClassConstructorExample2(10);
		new ChildClassConstructorExample2(10,20);
	}

}
