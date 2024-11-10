package Punto2;

import java.util.Random;

public class Punto2_bueno {

    public static void main(String[] args) {
        int num=0;
        int numAleat=0;
        int[] calificaciones =new int [100];            
     for(int i=0;i<100;i++){ 
      while(true){
            num = (int) (Math.random() * 100);
            if(num>=1 && num<=10){
            numAleat=num;
            calificaciones[i]=num;
            System.out.print(calificaciones[i]+",");

            break;
            }
        }
     }
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;
        int contador5 = 0;
        int contador6 = 0;
        int contador7 = 0;
        int contador8 = 0;
        int contador9 = 0;
        int contador10 = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            if (calificaciones[i] == 1) {
                contador1 += 1;
            }
            if (calificaciones[i] == 2) {
                contador2 += 1;
            }
            if (calificaciones[i] == 3) {
                contador3 += 1;
            }
            if (calificaciones[i] == 4) {
                contador4 += 1;
            }
            if (calificaciones[i] == 5) {
                contador5 += 1;
            }
            if (calificaciones[i] == 6) {
                contador6 += 1;
            }
            if (calificaciones[i] == 7) {
                contador7 += 1;
            }
            if (calificaciones[i] == 8) {
                contador8 += 1;
            }
            if (calificaciones[i] == 9) {
                contador9 += 1;
            }
            if (calificaciones[i] == 10) {
                contador10 += 1;
            }
        }
        System.out.println("");
        System.out.print("Contador de 1: " + contador1 + " | ");
        asteriscos(contador1);
        System.out.println("");
        System.out.print("Contador de 2: " + contador2 + " | ");
        asteriscos(contador2);
        System.out.println("");
        System.out.print("Contador de 3: " + contador3 + " | ");
        asteriscos(contador3);
        System.out.println("");
        System.out.print("Contador de 4: " + contador4 + " | ");
        asteriscos(contador4);
        System.out.println("");
        System.out.print("Contador de 5: " + contador5 + " | ");
        asteriscos(contador5);
        System.out.println("");
        System.out.print("Contador de 6: " + contador6 + " | ");
        asteriscos(contador6);
        System.out.println("");
        System.out.print("Contador de 7: " + contador7 + " | ");
        asteriscos(contador7);
        System.out.println("");
        System.out.print("Contador de 8: " + contador8 + " | ");
        asteriscos(contador8);
        System.out.println("");
        System.out.print("Contador de 9: " + contador9 + " | ");
        asteriscos(contador10);
        System.out.println("");
                System.out.print("Contador de 10: " + contador10 + " | ");
        asteriscos(contador10);
        System.out.println("");


    }

    public static void asteriscos(int repeticiones) {
        for (int i = 0; i < repeticiones; i++) {
            System.out.print("*");
        }

    }
}
