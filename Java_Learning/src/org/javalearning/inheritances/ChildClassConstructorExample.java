package org.javalearning.inheritances;

public class ChildClassConstructorExample extends ParentClassConstructorExample{
	ChildClassConstructorExample(){
		System.out.println("Child Class Constructor");
	}
	
	ChildClassConstructorExample(int a){
		super(10);
		System.out.println("Child Class 1-arg Constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ChildClassConstructorExample();
		new ChildClassConstructorExample(10);

	}

}
