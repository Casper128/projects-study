/*
5. Escriba un algoritmo que lea dos arreglos de números enteros ORDENADOS ascendentemente y luego 
produzca la lista ordenada de la mezcla de los dos. Por ejemplo, si los dos arreglos tienen los números 
, respectivamente, la lista de números en la pantalla debe ser 1 2 3 4 6 9 10 17 17.
 */
package Punto5;

import java.util.Scanner;


public class Punto5 {

 
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el tama;o del vector 1");
        int[] vec1=new int[leer.nextInt()];
        for (int i = 0; i < vec1.length; i++) {
            System.out.println("Ingrese los datos del arreglo 1");
            vec1[i]=leer.nextInt();
        }
        
        System.out.println("Ingrese el tama;o del vector 2");
        int[] vec2=new int[leer.nextInt()];
        for (int i = 0; i <vec2.length; i++) {
            System.out.println("Ingrese los datos del arreglo 1");
            vec2[i]=leer.nextInt();
        }
        
        int[] vec3= new int[vec1.length+vec2.length];
        int position = 0;
        for (int object : vec1)
        {
            vec3[position] = object;
            position++;
        }
        for (int object : vec2)
        {
            vec3[position] = object;
            position++;
    }
        burbuja(vec3);
        for (int i = 0; i < vec3.length; i++) {
            System.out.print(vec3[i]+",");
            
        }
        
        
        
}
    public static void burbuja(int[]matrix){
        int temp;
        for(int i=1;i < matrix.length;i++){
            for (int j=0 ; j < matrix.length- 1; j++){
                if (matrix[j] > matrix[j+1]){
                    temp = matrix[j];
                    matrix[j] = matrix[j+1];
                    matrix[j+1] = temp;
                }
            }
        }
    }
}