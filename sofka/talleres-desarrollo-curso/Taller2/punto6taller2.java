package Taller2;

import java.io.*;

public class punto6taller2 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
                punto6TallerMotos moto=new punto6TallerMotos();
		// 6.El taller de motos "El Maquinista" recibe motocicletas de alto cilindraje para realizar las respectivas revisiones 
		// y requiere una aplicaci�n que le permita registrar los servicios generados a sus clientes. 
		// Para cada motocicleta se debe tener registro del ingreso al taller y las observaciones por parte del cliente. 
		// Tambi�n debe existir registro de salida del taller con las novedades y otra de arreglos hechos 
		// por el mec�nico en caso de que se requiera inventariar cambios repuestos en la motocicleta al entregarla.
		System.out.println("Bievenido a El taller de motos El Maquinista, por favor eligir una opcion");
		System.out.println("1. Registrar ingreso de la motocicleta");
		System.out.println("2. Registrar salida de la motocicleta");
		System.out.println("3. Registrar que se le reparo a la motocicleta");
		moto.opcion = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Referencia de la motocicleta que ingresa: ");
		moto.motocicleta = bufEntrada.readLine();
		switch (moto.opcion) {
		case 1:
			System.out.println("Fecha de ingreso de la motocicleta dd/mm/aaaa");
			moto.ingreso = bufEntrada.readLine();
			System.out.println("Ingresar observaciones del ingreso de la motocicleta");
			moto.observaciones = bufEntrada.readLine();
			System.out.println("La "+moto.motocicleta+" Ingreso: "+moto.ingreso+" Observaciones: "+moto.observaciones);
			break;
		case 2:
			System.out.println("Fecha de salida de la motocicleta dd/mm/aaaa");
			moto.salida = bufEntrada.readLine();
			System.out.println("Ingresar observaciones de la salida de la motocicleta");
			moto.observaciones = bufEntrada.readLine();
			System.out.println("La "+moto.motocicleta+" salio: "+moto.salida+" Observaciones: "+moto.observaciones);
			break;
		case 3:
			System.out.println("Ingresar observaciones de la reparacion de la motocicleta");
			moto.observaciones = bufEntrada.readLine();
			System.out.println("La "+moto.motocicleta+" se le reparo: "+moto.observaciones);
			break;
		}
		System.out.println("Hasta pronto, gracias visitarnos");
	}


}

