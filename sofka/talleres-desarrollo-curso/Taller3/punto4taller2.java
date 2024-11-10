package Taller3;

import java.io.*;

public class punto4taller2 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		// 4. Se requiere un programa que pueda crear la tabla de multiplicar del n�mero que el usuario indique por medio del ciclo Para; 
		// esta debe ser impresa del 1 al 10. Ejemplo, si el usuario indica que desea crear la tabla del 5, entonces el resultado deber�a ser el siguiente:
		ClaseCiclos objeto1=new ClaseCiclos();
                System.out.println("Ingrese el numero que desea multiplicar :");
		objeto1.num = Integer.parseInt(bufEntrada.readLine());
                objeto1.operacion();
                

	}


}

