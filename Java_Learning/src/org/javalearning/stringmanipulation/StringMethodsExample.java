package org.javalearning.stringmanipulation;

public class StringMethodsExample {

	public static void main(String[] args) {
		String str = "Pallavi";
					//0123456
		System.out.println(str.charAt(5));  // output: v
		System.out.println(str.length()); 
		System.out.println(str.concat(" Anand"));
		System.out.println(str.contains("l"));
		System.out.println(str.indexOf("l"));
		System.out.println(str.startsWith("p"));
		System.out.println(str.startsWith("P"));
		System.out.println(str.endsWith("i"));
		String str1 = "         Java             Learning        ";
		System.out.println(str1.length());
		System.out.println(str1);
		System.out.println(str1.trim().length());
		String str2 = "JAVA LEARNING";
		System.out.println(str2.length());
		System.out.println(str2.trim().length());
		System.out.println(str.toUpperCase());
		System.out.println(str2.toLowerCase());

	}

}
