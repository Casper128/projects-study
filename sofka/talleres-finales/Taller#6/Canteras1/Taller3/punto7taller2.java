package Taller3;

import java.io.*;

public class punto7taller2 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String buscar;
		String elimin;
		String marca1;
		String marca2;
		String marca3;
		String marca4;
		String marca5;
		String nom1;
		String nom2;
		String nom3;
		String nom4;
		String nom5;
		int opcion;
		String placa1;
		String placa2;
		String placa3;
		String placa4;
		String placa5;
		String tel1;
		String tel2;
		String tel3;
		String tel4;
		String tel5;
		String teldigitado;
		// 7.El parqueadero "El guardi�n" presta sus servicios de parqueadero nocturno para los usuarios del barrio y 
		// requiere una aplicaci�n que permita registrar los veh�culos que se cuidan en estas instalaciones. 
		// Se sugiere que el parqueadero tenga los atributos del veh�culo como son, placa y marca, y los datos del cliente.
		// como son nombre completo y n�mero de tel�fono. //
		// Para cada veh�culo se debe permitir la opci�n de ingresar al parqueadero, 
		// retirar del parqueadero y consultar si un veh�culo se encuentra en el parqueadero. 
		// Recuerde que el sistema debe terminar cuando el usuario as� lo indique. //
		// Tenga en presente que el parqueadero solo puede almacenar m�ximo 5 veh�culos.//
		// Vehiculo1
		// Vehiculo2
		// Vehiculo3
		// Vehiculo4
		// Vehiculo5
		// Genericos
		// Inicializacion de variables
		nom1 = "";
		tel1 = "";
		placa1 = "";
		marca1 = "";
		nom2 = "";
		tel2 = "";
		placa2 = "";
		marca2 = "";
		nom3 = "";
		tel3 = "";
		placa3 = "";
		marca3 = "";
		nom4 = "";
		tel4 = "";
		placa4 = "";
		marca4 = "";
		nom5 = "";
		tel5 = "";
		placa5 = "";
		marca5 = "";
		do {
			System.out.println("Menu Usuario");
			System.out.println("1. Ingresar vehiculo al parqueadero : ");
			System.out.println("2. Buscar contacto: ");
			System.out.println("3. Retirar vehiculo al parqueadero :");
			System.out.println("0. Salir del sistema");
			System.out.println("Digite la opcion que desea:");
			opcion = Integer.parseInt(bufEntrada.readLine());
			switch (opcion) {
			case 1:
				System.out.println("Por favor Digite su nombre: ");
				if (placa1.equals("")) {
					nom1 = bufEntrada.readLine();
					System.out.println("Por favor digite el telefono: ");
					tel1 = bufEntrada.readLine();
					System.out.println("Por favor Digite la placa: ");
					placa1 = bufEntrada.readLine();
					System.out.println("Por favor Digite la marca del vehiculo: ");
					marca1 = bufEntrada.readLine();
				} else {
					if (placa2.equals("")) {
						nom2 = bufEntrada.readLine();
						System.out.println("Por favor digite el telefono: ");
						tel2 = bufEntrada.readLine();
						System.out.println("Por favor Digite la placa: ");
						placa2 = bufEntrada.readLine();
						System.out.println("Por favor Digite la marca del vehiculo: ");
						marca2 = bufEntrada.readLine();
					} else {
						if (placa3.equals("")) {
							nom3 = bufEntrada.readLine();
							System.out.println("Por favor digite el telefono: ");
							tel3 = bufEntrada.readLine();
							System.out.println("Por favor Digite la placa: ");
							placa3 = bufEntrada.readLine();
							System.out.println("Por favor Digite la marca del vehiculo: ");
							marca3 = bufEntrada.readLine();
						} else {
							if (placa4.equals("")) {
								nom4 = bufEntrada.readLine();
								System.out.println("Por favor digite el telefono: ");
								tel4 = bufEntrada.readLine();
								System.out.println("Por favor Digite la placa: ");
								placa4 = bufEntrada.readLine();
								System.out.println("Por favor Digite la marca del vehiculo: ");
								marca4 = bufEntrada.readLine();
							} else {
								if (placa5.equals("")) {
									nom5 = bufEntrada.readLine();
									System.out.println("Por favor digite el telefono: ");
									tel5 = bufEntrada.readLine();
									System.out.println("Por favor Digite la placa: ");
									placa5 = bufEntrada.readLine();
									System.out.println("Por favor Digite la marca del vehiculo: ");
									marca5 = bufEntrada.readLine();
								} else {
									System.out.println(""); // no hay forma directa de borrar la consola en Java
									System.out.println("El parqueadero esta lleno");
								}
							}
						}
					}
				}
				System.out.println("Nom 1= "+nom1+"| Nom 2= "+nom2+" | nom3= "+nom3+" | nom4= "+nom4+" | nom5= "+nom5);
				System.out.println("Tel1= "+tel1+" | Tel2= "+tel2+"  | tel3= "+tel3+"  | tel4= "+tel4+"  | tel5= "+tel5);
				System.out.println("placa1= "+placa1+" | placa2= "+placa2+"  | placa3= "+placa3+"  | placa4= "+placa4+"  | placa5= "+placa5);
				System.out.println("Marca1= "+marca1+" | Marca2= "+marca2+"  | Marca3= "+marca3+"  | Marca4= "+marca4+"  | Marca5= "+marca5);
				break;
			case 2:
				System.out.println("Por favor Digite la placa del vehiculo que busca: ");
				buscar = bufEntrada.readLine();
				if (placa1.equals(buscar)) {
					System.out.println("El vehiculo buscado esta en el parqueadero: ");
					System.out.println("Nombre cliente: "+nom1+" Telefono: "+tel1+" placa: "+placa1+" marca:  "+marca1);
				} else {
					if (placa2.equals(buscar)) {
						System.out.println("El vehiculo buscado esta en el parqueadero: ");
						System.out.println("Nombre Cliente: "+nom2+" Telefono: "+tel2+" placa: "+placa2+" marca:  "+marca2);
					} else {
						if (placa3.equals(buscar)) {
							System.out.println("El vehiculo buscado esta en el parqueadero: ");
							System.out.println("Nombre Cliente: "+nom3+" Telefono: "+tel3+" placa: "+placa3+" marca:  "+marca3);
						} else {
							if (placa4.equals(buscar)) {
								System.out.println("El vehiculo buscado esta en el parqueadero: ");
								System.out.println("Nombre Cliente: "+nom4+" Telefono: "+tel4+" placa: "+placa4+" marca:  "+marca4);
							} else {
								if (placa5.equals(buscar)) {
									System.out.println("El vehiculo buscado esta en el parqueadero: ");
									System.out.println("Nombre Cliente: "+nom5+" Telefono: "+tel5+" placa: "+placa5+" marca:  "+marca5);
								} else {
									System.out.println("El contacto que busca no existe");
								}
							}
						}
					}
				}
				break;
			case 3:
				System.out.println("Digite la placa del vehiculo que desea retirar");
				elimin = bufEntrada.readLine();
				if (placa1.equals(elimin)) {
					nom1 = "";
					tel1 = "";
					placa1 = "";
					marca1 = "";
					System.out.println("El contacto eliminado: "+elimin+" fue eliminado correctamente");
				}
				if (placa2.equals(elimin)) {
					nom2 = "";
					tel2 = "";
					placa2 = "";
					marca2 = "";
					System.out.println("El contacto eliminado: "+elimin+" fue eliminado correctamente");
				}
				if (placa3.equals(elimin)) {
					nom3 = "";
					tel3 = "";
					placa3 = "";
					marca3 = "";
					System.out.println("El contacto eliminado: "+elimin+" fue eliminado correctamente");
				}
				if (placa4.equals(elimin)) {
					nom4 = "";
					tel4 = "";
					placa4 = "";
					marca4 = "";
					System.out.println("El contacto eliminado: "+elimin+" fue eliminado correctamente");
				}
				if (placa5.equals(elimin)) {
					nom5 = "";
					tel5 = "";
					placa5 = "";
					marca5 = "";
					System.out.println("El contacto eliminado: "+elimin+" fue eliminado correctamente");
				}
				break;
			}
		} while (opcion!=0);
		System.out.println("Hasta pronto");
	}


}

