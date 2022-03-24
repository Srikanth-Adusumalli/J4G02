package com.Assignment3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWrite {

	public static void main(String[] args) {

		File infile = new File("C:\\abc\\fufuf.txt");
		File ofile = new File("C:\\abc\\Java.txt");
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader(infile);
			fw = new FileWriter(ofile);
			int i;
			while ((i = fr.read()) != -1) {
				fw.write(i);
			}
		} catch (IOException e) {
			System.out.println(e);
			System.exit(-1);
		} finally {
			try {
				fr.close();
				fw.close();
			} catch (IOException e) {
			}
		}

	}
}