/*2. Construir un programa que utilice FUNCIONES o PROCEDIMIENTOS, que reciba 3 números 
enteros positivos. Se debe determinar el número menor y el número mayor respectivamente. 
Solo si los tres números son iguales sacar un mensaje que diga “Números iguales”. Además, 
mostrar los números primos, si hay. Sino hay, imprimir un mensaje que diga “ningún número 
es primo”. (2.0 puntos).*/
package Examen_2_Punto_2;

import java.util.Scanner;

public class punto2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, num3, mcm, i, mayor = 0, medio, menor = 0;
        System.out.println("Ingrese primer numero:");
        num1 = leer.nextInt();
        System.out.println("Ingrese segundo numero:");
        num2 = leer.nextInt();
        System.out.println("Ingrese tercer numero:");
        num3 = leer.nextInt();
        mayor = mayor(num1, num2, num3, mayor);
        menor = menor(num1, num2, num3, menor);
        iguales(num1, num2, num3, mayor, menor);
        primos(num1,num2,num3);
    }

    public static int mayor(int num1, int num2, int num3, int mayor) {
        if ((num1 > num2 && num1 > num3)) {
            mayor = num1;
        }
        if ((num2 > num1 && num2 > num3)) {
            mayor = num2;
        }
        if ((num3 > num1 && num3 > num2)) {
            mayor = num3;
        }
        if (num1 == num2 && num1 == num3) {
            mayor = num1;
        }
        return mayor;
    }

    public static int menor(int num1, int num2, int num3, int menor) {
        if ((num1 < num2 && num1 < num3)) {
            menor = num1;
        }
        if ((num2 < num1 && num2 < num3)) {
            menor = num2;
        }
        if ((num3 < num1 && num3 < num2)) {
            menor = num3;
        }
        if (num1 == num2 && num1 == num3) {
            menor = num1;
        }
        return menor;
    }

    public static void iguales(int num1, int num2, int num3, int mayor, int menor) {
        if (num1 != num2 && num1 != num3) {

                System.out.println("El numero mayor es:" + mayor);
                System.out.println("El numero menor es:" + menor);
            }
                if (num1 == num2 && num1 == num3) {
            System.out.println("Números iguales");
        }
    }
    public static void primos(int num1,int num2,int num3){
            if(num1%2!=0){
                System.out.println("El numero "+num1+" es primo");
            }
            if(num2%2!=0){
                System.out.println("El numero "+num2+" es primo");
            }
            if(num3%2!=0){
                System.out.println("El numero "+num3+" es primo");
            }

                }
}

