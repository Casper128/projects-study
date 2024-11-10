/*
Hacer un programa empleando POO (mínimo 2 clases) que cuente y muestre los números múltiplos de 
4, 5 y 7 en el intervalo desde el número 4 hasta un numero natural N dado por el usuario, también
imprimir el promedio de cada uno deestos múltiplos (prom4, prom5 y prom7) respectivamente.
 */
package Taller2punto3;
import java.util.Scanner;
public class Punto3 {

    public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
  clase1 Numero=new clase1();
    System.out.println("Ingrese un numero natural: ");
        Numero.setNumero(leer.nextInt());
        Numero.MultiploDe4();
        System.out.println("\n");
        Numero.MultiploDe5();
        System.out.println("\n");
        Numero.MultiploDe7();
    }
    }
