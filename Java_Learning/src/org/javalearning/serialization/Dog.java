package org.javalearning.serialization;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Dog implements Serializable{
	

	private static final long serialVersionUID = 1L;
	
	private String name;
	private Breed breed;
	private int size;
	
	transient private String code;
	transient private double cost;
	
	public Dog() {
		super();
	}

	public Dog(String name, Breed breed, int size,String code,double cost) {
		super();
		this.name = name;
		this.breed = breed;
		this.size = size;
		this.cost = cost;
		this.code = code;
	}

	//implemented for customized serialization
	//***************** Begin ****************
	private void writeObject(ObjectOutputStream oos) throws Exception {
		System.out.println("Customized Serialization started...");
		oos.defaultWriteObject();
		String encryptedCode = "123"+code;
		double encryptedCost = 500 + cost;
		oos.writeObject(encryptedCode);
		oos.writeDouble(encryptedCost);
	}

	private void readObject(ObjectInputStream ois) throws Exception {
		System.out.println("Customized De-serialization started...");
		ois.defaultReadObject();
		String code = (String) ois.readObject();
		double cost = ois.readDouble();
		
		code = code.substring(3);
		cost = cost-500;
	}
	//****************** End ******************
	@Override
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + ", size=" + size + " inches, cost=$" + cost + " inches, code :: " + code +"]";
	}
	
	
}
