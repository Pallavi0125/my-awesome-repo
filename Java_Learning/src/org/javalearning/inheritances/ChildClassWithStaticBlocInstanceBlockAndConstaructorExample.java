package org.javalearning.inheritances;

//Parent Static block-->> Child static block-->> Parent instance block-->>Parent constructor-->> Child instance block-->> Child constructor

public class ChildClassWithStaticBlocInstanceBlockAndConstaructorExample extends ParentClassWithStaticBlocInstanceBlockAndConstaructorExample{

	{
		System.out.println("Child class instance block");
	}
	
	static {
		System.out.println("Child class Static block");
	}

	ChildClassWithStaticBlocInstanceBlockAndConstaructorExample(){
		System.out.println("Child Class 0-arg Constructor");
	}
	ChildClassWithStaticBlocInstanceBlockAndConstaructorExample(int a){
		super(10);
		System.out.println("Child Class 1-arg Constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ChildClassWithStaticBlocInstanceBlockAndConstaructorExample();
		new ChildClassWithStaticBlocInstanceBlockAndConstaructorExample(10);

	}

}
