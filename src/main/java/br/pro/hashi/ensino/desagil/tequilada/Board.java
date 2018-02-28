package br.pro.hashi.ensino.desagil.tequilada;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Board {
	boolean[][] isWall;
	
	void loadFromFile(String path) {
		String thisLine;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("test"));
			
			String string = br.readLine();
			String[] parts = string.split(" ");
			int x = Integer.parseInt(parts[1]);
			int y = Integer.parseInt(parts[0]);
			System.out.println("Valor de x: " + Integer.parseInt(parts[1]));
			boolean[][] boo = new boolean[x][y];
			//System.out.println(boo[2][3]);
			
			int j = 0;
			
			for (int i = 0; i < y; i++) {
				
				j = 0;

				StringBuilder newString = new StringBuilder(br.readLine());
				while (j < newString.length()) {
					if (newString.charAt(j) == '#') {
						boo[j][i] = true;
						System.out.println("Sucesso!");
					} else {
						System.out.println(j);
					}
					j++;
				}
			}
			isWall = boo;
		} catch (IOException e) {
			e.printStackTrace();
		
		}
	}
}
