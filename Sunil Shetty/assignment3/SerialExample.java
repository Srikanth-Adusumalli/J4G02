package com.learnjobs.assignment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialExample {

	public static void printdata(BookObject object1) {

		System.out.println("name = " + object1.bookName);
		System.out.println("age = " + object1.author);

	}

	public static void main(String[] args) {
		BookObject object = new BookObject("java", "sam");
		String filename = "sunil.txt";

		try {

			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			
			out.writeObject(object);

			out.close();
			file.close();

			System.out.println("Object has been serialized\n" + "Data before Deserialization.");

		}

		catch (IOException ex) {
			System.out.println("IOException is caught");
		}

		object = null;

		try {

			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			object = (BookObject) in.readObject();

			in.close();
			file.close();
			System.out.println("Object has been deserialized\n" + "Data after Deserialization.");
			printdata(object);

		}

		catch (IOException ex) {
			System.out.println("IOException is caught");
		}

		catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException" + " is caught");
		}
	}
}
