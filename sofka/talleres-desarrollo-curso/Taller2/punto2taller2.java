package Taller2;

import java.io.*;

public class punto2taller2 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
                Persona persona= new Persona();
		// Realizar un programa en el cual se solicite la edad de una persona. 
		// Si la persona es menor a 18 a�os, deber� mostrar en pantalla: Usted a�n es un ni�o(a).
		System.out.println("Por favor ingrese su edad");
		persona.edad = Integer.parseInt(bufEntrada.readLine());
		if (persona.edad<18) {
			System.out.println("Usted aun es un niño(a).");
		}
	}


}

