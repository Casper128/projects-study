package Taller1;

import java.io.*;

public class Punto5taller_1 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
                ClasePersona persona= new ClasePersona();   
		System.out.println("Ingrese el nombre de mascota");
		persona.nommascota = bufEntrada.readLine();
		System.out.println("Ingrese la edad de su mascota");
		persona.edadmascota = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Ingrese el tipo de mascota");
		persona.tipomascota = bufEntrada.readLine();
		System.out.println("Ingrese su nombre completo");
		persona.nomcompleto = bufEntrada.readLine();
		System.out.println(persona.nommascota+" es un(a) "+persona.tipomascota+" el cual, tiene "
                        +persona.edadmascota+" a�os de edad y "+persona.nomcompleto+" es actualmente su due�o(a)");
	}


}

