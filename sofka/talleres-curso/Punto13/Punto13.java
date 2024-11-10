/*
13. Diseñe un algoritmo que permita guardar en un vector las sumas de las filas de una matriz. Esto es, la suma de 
los elementos de la primera fila deberá quedar guardada en la primera posición del vector, la suma de los
elementos de la segunda fila en la segunda posición, y así sucesivamente para todas las filas de la matriz. La 
máxima dimensión de la matriz es 10x5 y la del vector es 10.
 */
package Punto13;

import java.util.Scanner;

public class Punto13 {

    public static void main(String[] args) {
        int n=0;
        int m=0;
        Scanner leer= new Scanner(System.in);
        System.out.print("Digite el tamano m de la matriz: ");
        m=leer.nextInt();
        System.out.print("Digite el tamano n de la matriz: ");
        n=leer.nextInt();
        
        
        //Verificacion de si la matriz es menor o igual que 10*5
        if(n<=5 && m<=10){
        int[][] vec1 = new int[m][n];
        
       //pedir datos para la matriz    
       for(int k=0;k<vec1.length;k++){ 
         for (int l = 0; l<vec1[k].length; l++) {
         System.out.print("Digite los valores de la matriz: ");
             vec1[k][l] = leer.nextInt();
         }             
            }
            suma(vec1);
            imprimirMatriz(vec1);

        }
        else{
            System.out.println("Ingrese un valor igual para m menor que 10 o n menor que 5");
        }
    }
    public static void suma(int[][]vec1){
       // int[] SumaColumnas = new int[vec1.length];
        int[] suma = new int[vec1.length];
        //Suma de las filas y las columnas en un vector
        for (int i = 0; i < vec1.length; i++) {
            for (int j = 0; j < vec1[i].length-1; j++) {
                suma[i] += vec1[i][j];
            }
            System.out.println("Suma fila posicion " + i + ": " + suma[i]);
            
           // System.out.println("Suma columna " + i + ": " + SumaColumnas[i]);
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