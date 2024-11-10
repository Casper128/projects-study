/*
10. En una hacienda hay un hato que se compone de N vacas. Diseñe un algoritmo que guarde en una matriz de 
dimensión 7xN la producción de leche diaria (en litros) de cada una de las vacas, durante una semana. Además, 
el algoritmo debe calcular la producción total del hato en cada uno de los siete días, y el número de la vaca que 
dio más leche en cada día.
 */
package Punto10;

import java.util.Scanner;

public class Punto10 {

    public static void main(String[] args) {
        int n = 0;
        int m = 0;
        Scanner leer = new Scanner(System.in);
        System.out.print("Digite cuantas vacas tiene: ");
        n = leer.nextInt();

        //Verificacion de si la matriz es menor o igual que 10*5
            int[][] vec1 = new int[2][n];

            //pedir datos para la matriz    
            for (int k = 0; k < vec1.length; k++) {
                for (int l = 0; l < vec1[k].length; l++) {
                    System.out.print("Digite los litros de leche para cada vaca del dia "+(k+1)+"= ");
                    vec1[k][l] = leer.nextInt();
                }
            }
            suma(vec1);
            Mayor(vec1);
            imprimirMatriz(vec1);

    }

    public static void suma(int[][] vec1) {
        // int[] SumaColumnas = new int[vec1.length];
        int[] suma = new int[vec1.length];
        //Suma de las filas y las columnas en un vector
        for (int i = 0; i < vec1.length; i++) {
            for (int j = 0; j < vec1[i].length; j++) {
                suma[i] += vec1[i][j];

            }
              System.out.println("Suma de la produccion del dia " + (i+1) + "= " + suma[i]);


        }
    }

    static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int numeroActual = matriz[i][j];
                System.out.printf("%5d", numeroActual);
            }
            System.out.println();
        }
    }
      static void Mayor(int [][]vec1){
        int i, May;
        May=vec1[0][0];
        int posicion=0;
        for (i=0; i<vec1.length;i++){
            for (int j = 0; j < vec1[j].length-1; j++) {
            if (vec1[i][j] >= May){
                
            System.out.println("La vaca con mas leche en el dia 1 es: "+(posicion));
            posicion=0;
            }
            
        }posicion++;
        }
      }
}
        


