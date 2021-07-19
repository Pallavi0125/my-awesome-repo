package org.javalearning.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationExample {

	public static void main(String[] args) throws Exception{
		Dog dog1 = new Dog("Tommy",new Breed("Pamerian","USA"),30,"DOG_US",100);
		Dog dog2 = new Dog("Ronny",new Breed("Golden Retriever","South Africa"),25,"DOG_SA",200);
		Dog dog3 = new Dog("Hutch",new Breed("Pug","Finland"),10,"DOG_FN",300);
		
		//creating a connection and chain streams
		FileOutputStream fos = new FileOutputStream("dogs.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		//serialize all the dog objects
		System.out.println("Serialization started...");
		oos.writeObject(dog1);
		oos.writeObject(dog2);
		oos.writeObject(dog3);
		
		//closing the resources
		oos.close();
		
	}

	
}