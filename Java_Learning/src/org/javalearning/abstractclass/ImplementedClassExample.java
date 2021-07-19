package org.javalearning.abstractclass;

public class ImplementedClassExample extends Abstract3rdClassExample{
	void m3() {
		 System.out.println("Normal m3()");
	 }
	void m4() {
		 System.out.println("Normal m4()");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstract3rdClassExample a = new ImplementedClassExample();
		a.m1();
		a.m2();
		a.m3();
		a.m4();

	}

}
