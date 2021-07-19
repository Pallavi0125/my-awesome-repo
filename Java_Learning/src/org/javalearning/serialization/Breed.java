package org.javalearning.serialization;

import java.io.Serializable;

public class Breed implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String origin;
	
	public Breed(String name, String origin) {
		super();
		this.name = name;
		this.origin = origin;
	}

	public Breed() {
		super();
	}


	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getOrigin() {
		return origin;
	}



	public void setOrigin(String origin) {
		this.origin = origin;
	}



	@Override
	public String toString() {
		return "Breed [name=" + name + ", origin=" + origin + "]";
	}
	
	
}
