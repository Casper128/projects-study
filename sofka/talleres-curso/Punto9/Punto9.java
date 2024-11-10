/*
9. Una matriz mágica es una matriz cuadrada (tiene igual número de filas que de columnas) que tiene como 
propiedad especial que la suma de las filas, las columnas y las diagonales es igual. Por ejemplo:
2 7 6
9 5 1
4 3 8
En esta matriz las sumas son 15.
Considere el problema de construir un algoritmo que compruebe si una matriz de datos enteros es mágica o no,
y en caso de que sea mágica escribir la suma. El usuario ingresa el tamaño de la matriz máximo hasta 10.
 */
package Punto9;

import java.util.Scanner;

public class Punto9 {

    public static void main(String[] args) {
        int n=0;
        int m=0;
        Scanner leer= new Scanner(System.in);
        System.out.print("Digite el tamano m de la matriz: ");
        m=leer.nextInt();
        System.out.print("Digite el tamano n de la matriz: ");
        n=leer.nextInt();
        
        
        //Verificacion de si la matriz es menor o igual que 10 y si m y n son iguales para que sea cuadrada
        if(m==n && m<=10){
        int[][] vec1 = new int[m][n];
        
       //pedir datos para la matriz    
       for(int k=0;k<vec1.length;k++){ 
         for (int l = 0; l<vec1[k].length; l++) {
         System.out.print("Digite los valores de la matriz: ");
             vec1[k][l] = leer.nextInt();
         }             
            }
            magica(vec1);
            imprimirMatriz(vec1);

        }
        else{
            System.out.println("Ingrese un valor igual para m y n o menor que 10");
        }
    }
    public static void magica(int[][]vec1){
        int y = 0, x = 0, SumaDiag = 0;
        int[] SumaColumnas = new int[vec1.length];
        int[] suma = new int[vec1.length];
        //Suma de las filas y las columnas en un vector
        for (int i = 0; i < vec1.length; i++) {
            for (int j = 0; j < vec1.length; j++) {
                suma[i] += vec1[i][j];
                SumaColumnas[i] += vec1[j][i];
            }
            System.out.println("Suma fila " + i + ": " + suma[i]);
            System.out.println("Suma columna " + i + ": " + SumaColumnas[i]);
        }
        //Suma de la diagonal
        while (x < vec1.length && y < vec1.length) {
            SumaDiag += vec1[y][x];
            x++;
            y++;
        }
            //Verificador de suma de columnas, filas y diagonal principal
        boolean bandera = false;
        for (int i = 0; i < suma.length; i++) {
            for (int j = 0; j < suma.length; j++) {
                if (i != j && suma[i] == suma[j]) {
                    if (suma[i] == SumaDiag) {
                        bandera = true;
                    }
                }
            }
        }
        if (bandera == true) {
            System.out.println("Suma de la diagonal: " + SumaDiag);
            System.out.println("Su matriz es magica");
        }
    
    }
       static void imprimirMatriz(int[][] matriz) {
        for(int i = 0; i < matriz.length; i++) {
            for (int j= 0; j < matriz[i].length; j++) {
                int numeroActual = matriz[i][j];
                System.out.printf("%5d", numeroActual);
            }
            System.out.println();
        }
}
}