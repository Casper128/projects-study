package Taller4;

import java.io.*;

public class punto5taller4 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int i;
		int j;
		int matriz[][];
		int result;
		matriz = new int[10][10];
		result = 0;
		System.out.println("Original");
		for (i=0;i<=9;i++) {
			System.out.println(" ");
			for (j=0;j<=9;j++) {
				result = (i+1)*(j+1);
				matriz[j][i] = result;
				System.out.print((j+1)+" X "+(i+1)+" = "+result+" |     ");
			}
		}
		System.out.println("Desea conocer el valor de algun campo");
		System.out.println("Digite la columna  ");
		i = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Digite la fila");
		j = Integer.parseInt(bufEntrada.readLine());
		System.out.print("El resultado es: "+matriz[i-1][j-1]);
	}


}

