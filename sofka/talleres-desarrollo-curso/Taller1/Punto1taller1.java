package Taller1;

import java.io.*;

public class Punto1taller1 {
	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
                ClasePersona persona=new ClasePersona();
		System.out.println("Ingrese su nombre");
		persona.nombre = bufEntrada.readLine();
		System.out.println("Ingrese sus apellidos");
		persona.apellidos = bufEntrada.readLine();
		System.out.println("Su nombre y apellido son: "+persona.nombre+" "+persona.apellidos);
	}


}

