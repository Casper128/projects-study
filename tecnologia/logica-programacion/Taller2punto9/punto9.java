/*Construir un programa que permita recibir N números enteros positivos. Cuando ingrese el número 6 el 
programa debe finalizar y mostrar cual fue el número menor y mayor ingresado hasta ese momento; además, 
calcular y mostrar el promedio de los números impares. APLICAR POO.*/
package Taller2punto9;

import java.util.Scanner;

public class punto9 {
        
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        clase1 num=new clase1();
        while(num.getNumero()!=6){
            System.out.println("Ingrese el numero ");
            num.setNumero(leer.nextInt());
            num.procedimiento();
            num.promedio();
        }
            System.out.println("Numero mayor: "+num.getMayor());
            System.out.println("Numero menor: "+num.getMenor());
            System.out.println("El promedio de los numeros impares ingresados es: "+num.getPromedio());
        }

}
