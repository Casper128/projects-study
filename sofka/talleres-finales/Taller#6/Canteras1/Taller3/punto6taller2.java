package Taller3;


import java.io.*;

public class punto6taller2 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String buscar;
		String elimin;
		String nom1;
		String nom2;
		String nom3;
		int opcion;
		String org1;
		String org2;
		String org3;
		String tel1;
		String tel2;
		String tel3;
		String teldigitado;
		// 6.Se est� creando una aplicaci�n que va a estar conectada con un prototipo que permita almacenar contactos telef�nicos en el dispositivo. 
		// Para ello cada contacto debe contener nombre completo, tel�fono y organizaci�n. 
		// Se requiere que la aplicaci�n permita a�adir 3 contactos verificando que el n�mero no est� almacenado, 
		// buscar contactos almacenados y eliminar contactos si el usuario lo requiere. 
		// Recuerde que el sistema debe terminar cuando el usuario as� lo indique.
		// contacto 1
		// Contacto 2
		// Contacto 3
		// Genericos
		// Inicializacion de variables
		nom1 = "";
		tel1 = "";
		org1 = "";
		nom2 = "";
		tel2 = "";
		org2 = "";
		nom3 = "";
		tel3 = "";
		org3 = "";
		do {
			System.out.println("Menu Usuario");
			System.out.println("1. Agregar contacto");
			System.out.println("2. Buscar contacto");
			System.out.println("3.Eliminar contacto");
			System.out.println("0. Salir del sistema");
			System.out.println("Digite la opcion que desea:");
			opcion = Integer.parseInt(bufEntrada.readLine());
			switch (opcion) {
			case 1:
				System.out.println("Por favor Digite su nombre: ");
				if (nom1.equals("")) {
					nom1 = bufEntrada.readLine();
					System.out.println("Por favor digite el telefono: ");
					teldigitado = bufEntrada.readLine();
					if (tel1.equals(teldigitado) || tel2.equals(teldigitado) || tel3.equals(teldigitado)) {
						System.out.println("ya existe un contacto con este telefono");
						nom1 = "";
						tel1 = "";
						org1 = "";
					} else {
						tel1 = teldigitado;
					}
					if (tel1.equals(teldigitado)) {
						System.out.println("Por favor Digite la organizacion: ");
						org1 = bufEntrada.readLine();
					}
				} else {
					if (nom2.equals("")) {
						nom2 = bufEntrada.readLine();
						System.out.println("Por favor digite el telefono: ");
						teldigitado = bufEntrada.readLine();
						if (tel1.equals(teldigitado) || tel2.equals(teldigitado) || tel3.equals(teldigitado)) {
							System.out.println("ya existe un contacto con este telefono");
							nom2 = "";
							tel2 = "";
							org2 = "";
						} else {
							tel2 = teldigitado;
						}
						if (tel2.equals(teldigitado)) {
							System.out.println("Por favor Digite la organizacion: ");
							org2 = bufEntrada.readLine();
						}
					} else {
						if (nom3.equals("")) {
							nom3 = bufEntrada.readLine();
							System.out.println("Por favor digite el telefono: ");
							teldigitado = bufEntrada.readLine();
							if (tel1.equals(teldigitado) || tel2.equals(teldigitado) || tel3.equals(teldigitado)) {
								System.out.println("ya existe un contacto con este telefono");
								nom3 = "";
								tel3 = "";
								org3 = "";
							} else {
								tel3 = teldigitado;
							}
							if (tel3.equals(teldigitado)) {
								System.out.println("Por favor Digite la organizacion: ");
								org3 = bufEntrada.readLine();
							}
						} else {
							System.out.println(""); // no hay forma directa de borrar la consola en Java
							System.out.println("Ya tiene la libreta de contactos llena ");
						}
					}
				}
				System.out.println("Nom 1= "+nom1+"| Nom 2= "+nom2+" | nom3= "+nom3);
				System.out.println("Tel1= "+tel1+" | Tel2= "+tel2+"  | tel3= "+tel3);
				System.out.println("org1= "+org1+" | org2= "+org2+"  | org3= "+org3);
				break;
			case 2:
				System.out.println("Por favor Digite el contacto que busca: ");
				buscar = bufEntrada.readLine();
				if (nom1.equals(buscar)) {
					System.out.println("El contacto buscado existe: ");
					System.out.println("Nombre Contacto: "+nom1+" Telefono: "+tel1+" Organizacion: "+org1);
				} else {
					if (nom2.equals(buscar)) {
						System.out.println("El contacto buscado existe: ");
						System.out.println("Nombre Contacto: "+nom2+" Telefono: "+tel2+" Organizacion: "+org2);
					} else {
						if (nom3.equals(buscar)) {
							System.out.println("El contacto buscado existe: ");
							System.out.println("Nombre Contacto: "+nom3+" Telefono: "+tel3+" Organizacion: "+org3);
						} else {
							System.out.println("El contacto que busca no existe");
						}
					}
				}
				break;
			case 3:
				System.out.println("Digite el nombre del contacto que desea eliminar");
				elimin = bufEntrada.readLine();
				if (nom1.equals(elimin)) {
					nom1 = "";
					tel1 = "";
					org1 = "";
					System.out.println("El contacto eliminado: "+elimin+" fue eliminado correctamente");
				}
				if (nom2.equals(elimin)) {
					nom2 = "";
					tel2 = "";
					org2 = "";
					System.out.println("El contacto eliminado: "+elimin+" fue eliminado correctamente");
				}
				if (nom3.equals(elimin)) {
					nom3 = "";
					tel3 = "";
					org3 = "";
					System.out.println("El contacto eliminado: "+elimin+" fue eliminado correctamente");
				}
				break;
			}
		} while (opcion!=0);
		System.out.println("Hasta pronto");
	}


}

