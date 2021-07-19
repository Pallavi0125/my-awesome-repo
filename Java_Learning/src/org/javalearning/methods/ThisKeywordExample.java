package org.javalearning.methods;

public class ThisKeywordExample {
	
	int a = 10;
	int b = 20;
	
	void m1(int a, int b) {
		System.out.println(a + "," + b);
		System.out.println(this.a + "," + this.b);
	}
	
	/* "this" keyword is not allowed in Static method
	 * static void m2(int a, int b) { System.out.println(a + "," + b);
	 * System.out.println(this.a + "," + this.b); }
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeywordExample p = new ThisKeywordExample();
		p.m1(100, 200);

	}

}
