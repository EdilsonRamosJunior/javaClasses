package application;

import java.util.Scanner;

public class ProgramMatriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite o numero de linhas: ");
		int linha = sc.nextInt();
		System.out.print("Digite o numero de colunas: ");
		int coluna = sc.nextInt();
		
		int[][] mtz = new int [linha][coluna];
		
		for(int i = 0; i < mtz.length;i++) {
			for(int j = 0; j < mtz[i].length; j++) {
				mtz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Digite o elemento: ");
		int x = sc.nextInt();
		
		for (int i = 0; i < mtz.length; i++) {
			for (int j= 0; i< mtz[i].length; j++) {
				if (mtz[i][j] == x) {
					System.out.println("Position " + i + ", " + j + ": ");
					if (j > 0) {
						System.out.println("Left: " + mtz[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mtz[i-1][j]);
					}
					if (j < mtz[i].length-1) {
						System.out.println("Right: " + mtz[i][j+1]);
					}
					if (i < mtz.length-1) {
						System.out.println("Down: " + mtz[i+1][j]);
					}
				}
			}
		}
		
		
		
		
		sc.close();
	}

}
