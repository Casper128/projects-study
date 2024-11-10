/*3. Construir un programa que utilice FUNCIONES o PROCEDIMIENTOS o POO, que reciba 3 
números enteros positivos e imprima todos los divisores de cada número. Además, el programa 
debe calcular el Mínimo Común Múltiplo (MCM) de los tres números. (1.0 puntos).*/
package Examen_2_Punto_3;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        clase1 num1 = new clase1();
        clase1 num2 = new clase1();
        clase1 num3 = new clase1();
        System.out.println("Ingrese el primer numero natural: ");
        num1.setNumero(leer.nextInt());
        num1.Multiplos();
        System.out.println("Ingrese el segundo numero natural: ");
        num2.setNumero(leer.nextInt());
        num2.Multiplos();
        System.out.println("Ingrese el tercer numero natural: ");
        num3.setNumero(leer.nextInt());
        num3.Multiplos();
        
    }
    public static void mcm(int num1,int num2,int num3){
    int mcm=1;
    int i=0;
     while(i <= num1 || i <= num2 ||i <= num3)
        {
            if(num1%i==0 || num2%i==0 || num3%i==0)
            {
            mcm=mcm*i;
            if(num1%i==0) num1=num1/i;
            if(num2%i==0) num2=num2/i;
            if(num3%i==0) num3=num3/i;
            }
            else
                i=i+1;               
        }
        System.out.println("El mcm de los tres numero ingresados es: "+mcm);
    
}
}
        



