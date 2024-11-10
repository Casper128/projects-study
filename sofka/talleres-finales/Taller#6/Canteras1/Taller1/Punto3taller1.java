package Taller1;


import java.io.*;

public class Punto3taller1 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
                ClasePersona persona= new ClasePersona();
		System.out.println("Ingrese su nombre");
		persona.nombre = bufEntrada.readLine();
		System.out.println("Ingrese sus apellido");
		persona.apellidos = bufEntrada.readLine();
		System.out.println("Ingrese el nombre de su padre");
		persona.nompadre = bufEntrada.readLine();
		System.out.println("Ingrese el apellido de su padre");
		persona.apellidopadre = bufEntrada.readLine();
		System.out.println("Ingrese el nombre de su madre");
		persona.nommadre = bufEntrada.readLine();
		System.out.println("Ingrese el apellido de su madre");
		persona.apellidomadre = bufEntrada.readLine();
		System.out.println("Yo "+persona.nombre+" "+persona.apellidos+" ,soy hijo de "
                        +persona.nommadre+" "+persona.apellidomadre+" y "
                        +persona.nompadre+" "+persona.apellidopadre);
	}


}

