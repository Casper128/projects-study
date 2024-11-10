
package Taller4;
import java.io.*;
import java.math.*;
public class ClaseArreglos {
    		public int i;
		public int j;
                public int k;
		public int matriz[];
		public int numero_aleatorio;
    
  public int[] rellenarArrayDesde(int matriz[]){
      		i = 0;
		for (i=0;i<=19;i++) {
			numero_aleatorio = (int) Math.floor(Math.random()*100);
			matriz[i] = numero_aleatorio;
		}
                i = 0;
		j = 0;
                
                numeroPares(matriz);
                numerosImpares(matriz);
        return matriz;
      
}
    public void numeroPares(int matriz[]){
    		System.out.print("Numeros pares: ");
		while (j<=19) {
			if (matriz[j]%2==0) {
				System.out.print(","+matriz[j]);
			}
			j = j+1;
		}
                j = 0;
    
    }
    public void numerosImpares(int matriz[]){
    		System.out.println(" ");
		System.out.print("Numeros Impares: ");
		while (j<=19) {
			if (matriz[j]%2!=0) {
				System.out.print(","+matriz[j]);
			}
			j = j+1;
		}
	}
    
      public String [][] rellenarArray(String matriz[][]){
      		matriz[0][0] = "01";
		matriz[0][1] = "02";
		matriz[0][2] = "03";
		matriz[0][3] = "04";
		matriz[0][4] = "05";
		matriz[1][0] = "06";
		matriz[1][1] = "07";
		matriz[1][2] = "08";
		matriz[1][3] = "09";
		matriz[1][4] = "10";
		matriz[2][0] = "11";
		matriz[2][1] = "12";
		matriz[2][2] = "13";
		matriz[2][3] = "14";
		matriz[2][4] = "15";
		matriz[3][0] = "16";
		matriz[3][1] = "17";
		matriz[3][2] = "18";
		matriz[3][3] = "19";
		matriz[3][4] = "20";

        return matriz;
      
}
      public void imprimirArregloOriginal(String matriz[][]){
      
      		System.out.println("Original");
		for (i=0;i<=3;i++) {
			System.out.println("");
			for (j=0;j<=4;j++) {
				System.out.print(matriz[i][j]+" ");
			}
		}
      }
     public void imprimirArrelosFinal(String matriz[][]){ 
      		System.out.println("");
		System.out.println("Final ");
		for (i=0;i<=3;i++) {
			if (i==3 || i==1) {
				System.out.println("");
				for (j=4;j>=0;j--) {
					System.out.print(matriz[i][j]+" ");
				}
			} else {
				System.out.println("");
				for (j=0;j<=4;j++) {
					System.out.print(matriz[i][j]+" ");
				}
			}
		}
    
     }
    }
    

