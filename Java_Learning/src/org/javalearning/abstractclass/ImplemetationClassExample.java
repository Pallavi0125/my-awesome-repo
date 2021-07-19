package org.javalearning.abstractclass;

public class ImplemetationClassExample extends AbstractClassExample{
	
	void m1() {System.out.println("m1 implemented method");}
	void m2() {System.out.println("m2 implemented method");}
	void m3() {System.out.println("m3 implemented method");}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AbstractClassExample a = new AbstractClassExample();
		//Generate compilation error "Cannot instantiate the type AbstractClassExample".
		// Child-child object creation
		ImplemetationClassExample i = new ImplemetationClassExample(); // Valid
		i.m1();
		i.m2();
		i.m3();
		i.m4();
		//Parent-Child object creation:
		//Parent p = new Child()
;		AbstractClassExample a = new ImplemetationClassExample(); // Valid
		a.m1();//Compile time: AbstractClassExample    Runtime: ImplemetationClassExample
		a.m2();//Compile time: AbstractClassExample    Runtime: ImplemetationClassExample
		a.m3();//Compile time: AbstractClassExample    Runtime: ImplemetationClassExample
		a.m4();//Compile time: AbstractClassExample    Runtime: ImplemetationClassExample

	}

}
