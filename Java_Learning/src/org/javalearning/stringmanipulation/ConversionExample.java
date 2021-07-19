package org.javalearning.stringmanipulation;

public class ConversionExample {

	public static void main(String[] args) {
		// Conversion of String to StringBuffer
		String s = "Pallavi";
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
		// Conversion of StringBuffer to String
		StringBuffer sb1 = new StringBuffer("Anand");
		String s1 = sb1.toString();// Here we need to use toString() otherwise it will return hashcode of String.
		System.out.println(s1);
	}

}
