package org.javalearning.instanceblocks;

public class InstanceBlockExample3 {
	//Instance block execution depends only on object creation not on construction execution.
	InstanceBlockExample3(){
		this(10);
		System.out.println("0-args constructor");
	}
	InstanceBlockExample3(int a){
		System.out.println("1-args constructor");
	}
		
	{
		System.out.println("1st instance block executed");
	}
	
	{
		System.out.println("2nd instance block executed");
	}

	public static void main(String[] args) {
		new InstanceBlockExample3();

	}

}
