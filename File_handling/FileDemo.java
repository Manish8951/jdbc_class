package com.xworkz;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void  main (String[]ar) {
		
		File file = new File("f:\\file.txt");
		
		try {
			if(file.createNewFile()) {
				System.out.println("file got created");
			} else {
				System.err.println("file did not created...!");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
