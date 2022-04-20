package com.xworkz.games;

import java.util.Scanner;


public class Tester {
	
	public static void main (String[]ar) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the game ID");
		int ID=scanner.nextInt();
		
		System.out.println("Enter the game Name");
		String name = scanner.next();
		
		System.out.println("Enter the no of players");
		int player =scanner.nextInt();
		
		System.out.println("Enter the type of game");
		String type = scanner.next();
		
		GamesDTO dto = new GamesDTO(ID,name,player,type);
		
		boolean SaveStatus = GamesDAO.saveGame(dto);
		
		if(SaveStatus) {
			System.out.println("Saved sucessfully...!");
		}else {
			System.out.println("Unsucessful");
		}
	}

}
