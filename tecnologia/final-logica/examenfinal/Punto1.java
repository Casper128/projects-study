/*
1. Se requiere escribir un vector aleatoriamente con 50 números del 5 al 9. Ahora determinar la frecuencia de cada 
número. Eso es, contar cuantos 5 hay en el vector, cuantos 6, cuantos 7, cuantos 8 y cuantos 9 hay en el arreglo. 
Luego, determinar cuál número tiene la mayor frecuencia. (2.0) 40minutos
 */
package examenfinal;

import java.util.Scanner;

/**
 *
 * @author daoo1
 */
public class Punto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner leer= new Scanner(System.in);

        int[]Datos=new int[50];
        int num=0;
        int numAleat=0;
     for(int i=0;i<Datos.length;i++){ 
            while(true){
                num = (int) (Math.random() * 1000);
                    if(num>=5 && num<=9){
                    numAleat=num;
                    break;
                        
                    }
         }              System.out.print(numAleat);
                        Datos[i] = numAleat;

            }
                imprimirMatriz(Datos);
                System.out.print("");
                frecuencia(Datos);
    }
     static void imprimirMatriz(int[] matriz) {
        for(int i = 0; i < matriz.length; i++) {
                int numeroActual = matriz[i];
                System.out.println(numeroActual+" ");
        }
}
      static void frecuencia(int[] matriz) {
         int [][]vec1={{5,0},{6,0},{7,0},{8,0},{9,0}};
         
          for (int i = 0; i < matriz.length; i++) {
                   if(matriz[i]==5){
                      vec1[0][1]+=1;
                  }
                   if(matriz[i]==6){
                      vec1[1][1]+=1;
                  }
                   if(matriz[i]==7){
                      vec1[2][1]+=1;
                  }
                   if(matriz[i]==8){
                      vec1[3][1]+=1;
                  }
                   if(matriz[i]==9){
                      vec1[4][1]+=1;
                  }
             
          } 
               for (int i = 0; i <5; i++) {
                    System.out.println("Frecuencia para el numero"+(i+5)+"= "+vec1[i][1]);
          }
   

          }
              }

    
