package Taller2;


import Taller2.Persona;
import java.io.*;

public class punto1taller2 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		Persona persona= new Persona();
		// Realizar un programa en el cual se solicite la edad de una persona. 
		// Si la persona es mayor o igual a 18 a�os, deber� mostrar en pantalla: Usted es mayor de edad. 
		System.out.println("Por favor ingrese su edad");
		persona.edad = Integer.parseInt(bufEntrada.readLine());
		if (persona.edad>=18) {
			System.out.println("Usted es mayor de edad");
		}
	}


}

