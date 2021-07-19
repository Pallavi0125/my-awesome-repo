package org.javalearning.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationExample {

	public static void main(String[] args) throws Exception{
		//creating connection and chain streams for reading from a file
		FileInputStream fis = new FileInputStream("dogs.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		
		//deserialization process
		System.out.println("Deserialization started...");
		Dog dog1 = (Dog)ois.readObject();
		Dog dog2 = (Dog)ois.readObject();
		Dog dog3 = (Dog)ois.readObject();
		
		System.out.println(dog1);
		System.out.println(dog2);
		System.out.println(dog3);
		
		//closing the resources
		ois.close();
	}

}
