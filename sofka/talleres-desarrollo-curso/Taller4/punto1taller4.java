package Taller4;

import java.io.*;
import java.util.Vector;

public class punto1taller4 {

	public static void main(String args[]) {
		int i;
                Vector matriz=new Vector(5);
		// 1.Crear un vector de tipo Entero con 5 posiciones, llenarlo con informaci�n solicitada al usuario. 
		// Despu�s de recoger toda la informaci�n, se requiere imprimir el �ndice de cada posici�n en el arreglo con su valor de la siguiente manera:
		// [0] = 55
		// [1] = 99
		// [2] = 11
		// [3] = 56
		// [4] = 69
		matriz.addElement(55);
		matriz.addElement(99);
		matriz.addElement(11);
		matriz.addElement(56);
		matriz.addElement(69);
		for (i=0;i<=4;i++) {
			System.out.println("["+i+"] ="+matriz.get(i));
		}
	}


}

