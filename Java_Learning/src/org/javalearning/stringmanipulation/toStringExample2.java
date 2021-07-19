package org.javalearning.stringmanipulation;

public class toStringExample2 {
	
	int  id;
	String name;
	toStringExample2(int id, String name){
		this.id = id;
		this.name = name;
	}
	/*
	 *  To print the value we have to override the the toString() method.
	 */	
	public String toString() {
		return "  "+ id + "  " +name ;
	}

	public static void main(String[] args) {
		toStringExample2 t =  new toStringExample2(111, "Java");
		System.out.println(t);
		System.out.println(t.toString());

	}

}
