package Taller4;

import java.io.*;

public class punto3taller4 {

	public static void main(String args[]) {
		int i;
		int j;
		int k;
		int matriz[];
		// 3. Imprimir los n�meros primos del 1 al 1000, el resultado debe ser buscado de forma matem�tica.
		matriz = new int[170];
		i = 0;
		j = 0;
		k = 0;
		for (i=1;i<=1000;i++) {
			for (j=1;j<=1000;j++) {
				if (i%j==0) {
					k = k+1;
				}
			}
			System.out.println(","+j);
		}
	}


}

