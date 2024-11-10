package Taller1;


import java.io.*;

public class Punto2taller1 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String apellidos;
		int edad;
		double estatura;
		String nombre;
		System.out.println("Ingrese su nombre");
		nombre = bufEntrada.readLine();
		System.out.println("Ingrese sus apellido");
		apellidos = bufEntrada.readLine();
		System.out.println("Ingrese su edad");
		edad = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Ingrese su estatura");
		estatura = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Mi nombre es: "+nombre+" mi apellido es: "+apellidos+" mi edad es: "+edad+" mi estatura es: "+estatura);
	}


}

