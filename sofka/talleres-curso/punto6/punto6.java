/*
6. Escriba un algoritmo que lea un arreglo de números enteros, y un número p, y escriba en la pantalla todos los 
índices de las posiciones del arreglo donde está p. Por ejemplo, si el arreglo es el que aparece enseguida y p es 
2: 1 2 3 10 23 2 2 1 El programa debe escribir: 1 5 6. (indice desde0)

 */
package punto6;

import java.util.Scanner;
public class punto6 {
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el numero del cual desea hallar la posicion");
	int p=leer.nextInt();
	
        System.out.println("Ingrese el tama;o del arreglo 1");
        int[] arreglo=new int[leer.nextInt()];
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingrese los datos del arreglo : ");
            arreglo[i]=leer.nextInt();
        }

	       System.out.println("Las posiciones del numero: "+p+" en el arreglo es:");
	for(int i=0;i<arreglo.length;i++){
		if(p==arreglo[i]){
                System.out.print(i+" ");
		}
	}
    }
    
}
