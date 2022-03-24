package com.Assignment3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialDeserialBook {

	public static void main(String[] args) {
		try {
			Book b = new Book(1000, "Rahul");

			FileOutputStream fos = new FileOutputStream("C:\\abc\\Java.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(b);
			System.out.println("Serialize Book Object");
			FileInputStream fis = new FileInputStream("C:\\abc\\Java.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Book b1 = (Book) ois.readObject();
			System.out.println(b1);
			System.out.println("Deserialize Book Object");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
