package com.assignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriteOperation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 // Reading data from file E:/read.txt
	    File f1=new File("E:/read.txt");
	    FileReader fr=new FileReader(f1);
	    BufferedReader br=new BufferedReader(fr);

	    String s = br.readLine();

	    // Writing data to file E:/write.txt
	    File f2=new File("E:/write.txt");
	    FileWriter fw=new FileWriter(f2);
	    BufferedWriter bw=new BufferedWriter(fw);
	    while(s!=null)
	    {
	        bw.write(s);
	        bw.newLine();
	        System.out.println(s);
	        s=br.readLine();

	    }
	    bw.flush();
	    bw.close();

	}

	}


