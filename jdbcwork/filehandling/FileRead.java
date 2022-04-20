package com.xworkz;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
	
	public static void main (String[]ar) {
		char []a=new char[100];
		
		try {
			FileReader filereader = new FileReader("f:\\file.txt");
		     try {
				filereader.read(a);
				System.out.println(a);
				filereader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
