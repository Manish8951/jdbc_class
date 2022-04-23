package com.xworkz;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
	
	public static void main (String[]ar) {
		
		try {
			FileWriter filewriter = new FileWriter("f:\\file.txt");
			filewriter.write("file writer");
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}

}
