package com.xworkz.File_handling;


import java.io.FileReader;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;


public class FileOpration {
	
	

		  public static void main(String args[]) throws Exception {
			  
			String query = "INSERT INTO filehandle(file_name) VALUES (?)";

			Connection con = null;
			PreparedStatement pstmt = null;

			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost/filehandling", "root", "8055");

				System.out.println("Connection Established Suessfully");

				pstmt = con.prepareStatement(query);

				pstmt.setString(1, "file_name");

				FileReader reader = new FileReader("f:\\\\file.txt");
				
				pstmt.setCharacterStream(1, reader);

				pstmt.execute();

				
				System.out.println("Data Inserted Susessfully");
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
				       	if (pstmt != null)
					    	pstmt.close();
				       	if (con != null)
						con.close();
				} catch (Exception e) {
					      e.printStackTrace();
				}
			}
		}
	}


