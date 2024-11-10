/*1. Construir un programa que utilice POO, para calcular el estado meteorológico de 5 sitios
turístico de la ciudad. En cada sitio hay instalados 3 sensores de temperatura. Mostrar la 
temperatura promedio para cada sitio, además de su correspondiente estado meteorológico
así: si la temperatura promedio es menor o igual a 9 grados, imprimir “Frio”. Si la temperatura 
promedio esta entre 9 y 35 grados, imprimir “Cálido” y si la temperatura promedio es igual o 
superior de 35 grados entonces imprimir “Caliente”. (2.0 puntos).


*/

package Examen_2_Punto_1;

import java.util.Scanner;

public class punto1 {


    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        ciudades bogota=new ciudades();
        ciudades medellin=new ciudades();
        ciudades armenia=new ciudades();
        ciudades santaMarta=new ciudades();
        ciudades cartagena=new ciudades();
            System.out.println("Ingrese la temperatura para la ciudad 1 sensor 1");
                bogota.setSensor1(leer.nextInt());
             System.out.println("Ingrese la temperatura para la ciudad 1 sensor 2");
                bogota.setSensor2(leer.nextInt());
             System.out.println("Ingrese la temperatura para la ciudad 1 sensor 3");
                bogota.setSensor3(leer.nextInt());
                bogota.tempPromedio();
                       System.out.println("Ingrese la temperatura para la ciudad 2 sensor 1");
                medellin.setSensor1(leer.nextInt());
             System.out.println("Ingrese la temperatura para la ciudad 2 sensor 2");
                medellin.setSensor2(leer.nextInt());
             System.out.println("Ingrese la temperatura para la ciudad 2 sensor 3");
                medellin.setSensor3(leer.nextInt());
                medellin.tempPromedio();
                
                       System.out.println("Ingrese la temperatura para la ciudad 3 sensor 1");
                armenia.setSensor1(leer.nextInt());
             System.out.println("Ingrese la temperatura para la ciudad 3 sensor 2");
                armenia.setSensor2(leer.nextInt());
             System.out.println("Ingrese la temperatura para la ciudad 3 sensor 3");
                armenia.setSensor3(leer.nextInt());
                armenia.tempPromedio();
                
                       System.out.println("Ingrese la temperatura para la ciudad 4 sensor 1");
                santaMarta.setSensor1(leer.nextInt());
             System.out.println("Ingrese la temperatura para la ciudad 4 sensor 2");
                santaMarta.setSensor2(leer.nextInt());
             System.out.println("Ingrese la temperatura para la ciudad 4 sensor 3");
                santaMarta.setSensor3(leer.nextInt());
                santaMarta.tempPromedio();
                
                                System.out.println("Ingrese la temperatura para la ciudad 5 sensor 1");
                cartagena.setSensor1(leer.nextInt());
             System.out.println("Ingrese la temperatura para la ciudad 5 sensor 2");
                cartagena.setSensor2(leer.nextInt());
             System.out.println("Ingrese la temperatura para la ciudad 5 sensor 3");
                cartagena.setSensor3(leer.nextInt());
                cartagena.tempPromedio();
                
                
        
        }
        
    }
   


