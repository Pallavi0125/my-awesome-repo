package org.javalearning.abstractclass;

public abstract class AbstractClassWithStaticBlockExample {
 
	static
		{
			System.out.println("Abstract static block");
		}
	abstract void m1();

}
