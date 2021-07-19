package org.javalearning.methods;

class X{}
class Emp{}
class Y{}
class Student{}

 class TestWithMultipleClassExample {
	
	void m1(X x, Emp e) {
		System.out.println("m1 method executed");
	}
	
	void m1(Y y, Student s) {
		System.out.println("m2 method executed");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestWithMultipleClassExample t = new TestWithMultipleClassExample();
		X x = new X();  // Here object name can be anything
		Emp e = new Emp(); // Here object name can be anything
		t.m1(x, e);
		t.m1(new X(), new Emp()); //In this case no need to create object direct we can by the constructor in parameter 
		Y y = new Y();  // Here object name can be anything
		Student s = new Student(); // Here object name can be anything
		t.m1(y, s);

	}

}
