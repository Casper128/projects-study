package Taller3;


import java.io.*;

public class punto5taller2 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String nombre = null;
		int opcion;
                ClaseCiclos persona=new ClaseCiclos();
		// 5. Utilizando el ciclo que usted desee, crear un men� de ejecuci�n infinita hasta que el usuario desee terminar dicho ciclo.
		do {
			System.out.println("Menu Usuario");
			System.out.println("1. Captura nombre");
			System.out.println("2. Saludar Persona");
			System.out.println("3. Salir del sistema");
			System.out.println("Digite la opcion que desea:");
			opcion = Integer.parseInt(bufEntrada.readLine());
			switch (opcion) {
			case 1:
				System.out.println("Por favor digite su nombre: ");
				persona.nombre = bufEntrada.readLine();
				break;
			case 2:
				System.out.println("");
				System.out.println("Hola como estas, "+persona.nombre);
				break;
			}
		} while (opcion!=3);
		System.out.println("Hasta pronto");
	}


}

