/*
1. Coodificar un programa que dada una matriz[m][n], con n y m generados aleatoriamente entre 10 y 20. la 
almacene de la siguiente manera (USAR POO):
a) En un vector V1 de la forma [fila1, fila2, fila3… filam].
b) En un vector V2 de la forma [columna1, columna2, columna3, … columnan].
ejemplo:
7 8 9
4 5 2
1 0 8
V1= [7 8 9 4 5 2 1 0 8].
V2= [7 4 1 8 5 0 9 2 8].

 */
package punto1;

import java.util.Scanner;


public class punto1 {

    public static void main(String[] args) {
        int n=0;
        int m=0;
        Scanner leer= new Scanner(System.in);
        System.out.print("Digite el tamano m de la matriz: ");
        m=leer.nextInt();
        System.out.print("Digite el tamano n de la matriz: ");
        n=leer.nextInt();
        int[][]Datos=new int[m][n];
        int[][]Datos2=new int[m][n];
        int num=0;
        int numAleat=0;
     for(int i=0;i<Datos.length;i++){ 
         for (int j = 0; j <Datos[i].length; j++) {
            while(true){
                num = (int) (Math.random() * 1000);
                    if(num>=10 && num<=20){
                    numAleat=num;
                    break;
                        
                    }
         }              System.out.println(numAleat);
                        Datos[i][j] = numAleat;
                        Datos2[j][i] = numAleat;
            }     
  

}   System.out.println("Matriz 1: ");
         imprimirMatriz(Datos);
        System.out.println("Matriz 2:");
        imprimirMatriz(Datos2);
    }
        static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j= 0; j < matriz[i].length; j++) {
                int numeroActual = matriz[i][j];
                System.out.printf("%5d", numeroActual);
            }
            System.out.println();
        }
    }
}
