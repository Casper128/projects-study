package Taller2;

import java.io.*;

public class punto3taller2 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		Persona persona= new Persona();
		// Realizar un programa en el cual se solicite el nombre, 
		// apellidos y edad de la persona. Si la persona es mayor o igual a 18 a�os, 
		// entonce se deber� imprimir en pantalla [Nombre completo] usted es mayor de edad, 
		// por lo tanto puede entrar a la fiesta. Si la edad de la persona es menor que 18 a�os, 
		// entonces, deber� imprimirse el siguiente mensaje: [Nombre completo] usted es menor de edad,
		// por lo tanto, no puede entrar a la fiesta, por favor devu�lvase a su casa.
		System.out.println("Ingrese su nombre");
		persona.nombre = bufEntrada.readLine();
		System.out.println("Ingrese sus apellidos");
		persona.apellidos = bufEntrada.readLine();
		System.out.println("Por favor ingrese su edad");
		persona.edad = Integer.parseInt(bufEntrada.readLine());
		if (persona.edad>=18) {
			System.out.println(persona.nombre+" "+persona.apellidos+" Usted es mayor de edad, por lo tanto puede entrar a la fiesta.");
		} else {
			System.out.println(persona.nombre+" "+persona.apellidos+" usted es menor de edad,por lo tanto, no puede entrar a la fiesta, por favor devuelvase a su casa.");
		}
	}


}

