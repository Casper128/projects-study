package Taller1;


import java.io.*;

public class Punto4taller1 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		ClasePersona persona= new ClasePersona();
		System.out.println("Ingrese la ciudad capital");
		persona.capital = bufEntrada.readLine();
		System.out.println("Ingrese el pais");
		persona.pais = bufEntrada.readLine();
		System.out.println("La ciudad "+persona.capital+" es la capital del pa�s "+persona.pais);
	}


}

