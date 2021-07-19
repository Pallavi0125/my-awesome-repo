package org.javalearning.methods;

public class MethodsExample {
	
	//method signature: Modifier returnType methodName(List of parameters)throws Exception{}
	void m1(int a, int b) {
		System.out.println("Int values are: " + a + "," + b);
		
	}
	
	void m1(long a, long b) {
		System.out.println("Long values are: " + a + "," + b);
		
	}
	
	void m1(float a, float b) {
		System.out.println("float values are: " + a + "," + b);
		
	}
	
	void m1(double a, double b) {
		System.out.println("double values are: " + a + "," + b);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsExample me = new MethodsExample();
		me.m1(10, 20);
		me.m1(20L,30l);
		me.m1(10.5f, 20.5f);
		me.m1(20d,30d);

	}

}
