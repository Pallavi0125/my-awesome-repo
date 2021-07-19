package org.javalearning.stringmanipulation;

public class EqualsVsCompareToMethodExample {

	public static void main(String[] args) {
		//String equals() will execute		
		String s1 = "Java";
		String s2 = "Python";
		String s3 = "java";
		//String returns boolean value
		System.out.println(s1.equals(s2)); // false
		System.out.println(s1.equals(s3));// false
		System.out.println(s1.equals(s3));// false
		System.out.println(s1.equalsIgnoreCase(s3));// true
		
		//CompareTo() returns int value
		System.out.println(s1.compareTo(s3)); 
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareToIgnoreCase(s3));
	}

}
