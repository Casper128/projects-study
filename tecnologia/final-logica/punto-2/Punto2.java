/*
2. Vamos a Jugar! Se requiere programar el juego TRIQUI usando una matriz 3x3. El programa debe permitir a dos 
jugadores jugar triqui. Cada jugador en su turno deberá seleccionar una casilla del tablero de 9 posiciones. El 
ganador será el jugador que primero logre colocar tres de sus jugadas en línea recta, sea vertical, horizontal o 
diagonal (ver ilustración abajo). Cuando el juego termine en empate, se debe iniciar otra ronda y avisar que hay 
empate. Para finalizar de jugar se debe preguntar si se desea continuar jugando o no. A continuación, se muestran 
algunas jugadas donde un jugador gana y donde el juego termina en empate. (3.0)
 */
package Punto2;

import java.util.Scanner;

public class Punto2 {

    public static void main(String[] args) {
        int m;
        int n;
        int[][] triqui = new int[3][3];
        Scanner leer= new Scanner(System.in);
       //pedir datos para la matriz    
       for(int k=0;k<triqui.length;k++){ 
         for (int l = 0; l<triqui[k].length; l++) {
         System.out.print("Jugador 1 Digite la posicion m donde guardara el valor: ");
             m=leer.nextInt();
        System.out.print("Jugador 1 Digite la posicion n donde guardara el valor: ");
             n=leer.nextInt(); 
             System.out.println("Digite 1 para X");   
              triqui[m][n] = leer.nextInt();
              magica(triqui);
        System.out.print("Jugador 2 Digite la posicion m donde guardara el valor: ");
             m=leer.nextInt();
        System.out.print("Jugador 2 Digite la posicion n donde guardara el valor: ");
             n=leer.nextInt(); 
             System.out.println("Digite 2 para O ");           
             triqui[k][l] = leer.nextInt();
             
         }             
            }
            imprimirMatriz(triqui);

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
            if(suma[i]==3){
                System.out.println("Gana el jugador 1");
            }
            else if(suma[i]==6){
                System.out.println("Gana el jugador 2");
            }
            else if(suma[i]!=3 && suma[i]!=6){
                System.out.println("Hubo un empate");
            }
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