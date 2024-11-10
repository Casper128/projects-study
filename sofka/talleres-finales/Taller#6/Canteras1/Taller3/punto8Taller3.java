package Taller3;
import java.io.*;

public class punto8Taller3 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String buscar;
		boolean ingre1;
		boolean ingre2;
		boolean ingre3;
		boolean ingre4;
		boolean ingre5;
		boolean ingre6;
		boolean ingre7;
		boolean ingre8;
		String nom1;
		String nom2;
		String nom3;
		String nom4;
		String nom5;
		String nom6;
		String nom7;
		String nom8;
		int opcion;
		int puntuacion1;
		int puntuacion2;
		int puntuacion3;
		int puntuacion4;
		int puntuacion5;
		int puntuacion6;
		int puntuacion7;
		int puntuacion8;
		String resultado;
		// 8.La escuela automovil�stica "El Maestro" requiere una aplicaci�n que permita registrar 
		// a sus Clientes en los cursos de ense�anza automovil�stica y establecer quienes lo han aprobado 
		// para continuar con el tr�mite de adquirir la licencia de conducci�n. Para cada usuario se debe
		// permitir registrar su ingreso al curso, consultar usuarios que hayan presentado el curso y resultados de la prueba del curso (si fueron aprobados o no). 
		// Recuerde que el sistema debe terminar cuando el usuario as� lo indique. 
		// Tenga presente que la escuela tiene capacidad m�xima de gestionar 8 usuarios en su totalidad.
		// Cliente1
		// Cliente2
		// Cliente3
		// Cliente4
		// Cliente5
		// Cliente5
		// Cliente7
		// Cliente8
		// Genericos
		// Inicializacion de variables
		nom1 = "";
		puntuacion1 = 0;
		ingre1 = false;
		nom2 = "";
		puntuacion2 = 0;
		ingre2 = false;
		nom3 = "";
		puntuacion3 = 0;
		ingre3 = false;
		nom4 = "";
		puntuacion4 = 0;
		ingre4 = false;
		nom5 = "";
		puntuacion5 = 0;
		ingre5 = false;
		nom6 = "";
		puntuacion6 = 0;
		ingre6 = false;
		nom7 = "";
		puntuacion7 = 0;
		ingre7 = false;
		nom8 = "";
		puntuacion8 = 0;
		ingre8 = false;
		do {
			System.out.println("Bienvenido a la escuela automovil�stica El Maestro ");
			System.out.println("1. Registrar en curso de conduccion : ");
			System.out.println("2. Consultar usuarios del curso : ");
			System.out.println("3. Consultar resultados por usuario :");
			System.out.println("0. Salir del sistema");
			System.out.println("Digite la opcion que desea:");
			opcion = Integer.parseInt(bufEntrada.readLine());
			switch (opcion) {
			case 1:
				System.out.println("Por favor Digite su nombre: ");
				if (ingre1==false) {
					nom1 = bufEntrada.readLine();
					System.out.println("Por favor Digite la puntuacion de (0 a 10) : ");
					puntuacion1 = Integer.parseInt(bufEntrada.readLine());
					ingre1 = true;
				} else {
					if (ingre2==false) {
						nom2 = bufEntrada.readLine();
						System.out.println("Por favor Digite la puntuacion de (0 a 10) : ");
						puntuacion2 = Integer.parseInt(bufEntrada.readLine());
						ingre2 = true;
					} else {
						if (ingre3==false) {
							nom3 = bufEntrada.readLine();
							System.out.println("Por favor Digite la puntuacion de (0 a 10) : ");
							puntuacion3 = Integer.parseInt(bufEntrada.readLine());
							ingre3 = true;
						} else {
							if (ingre4==false) {
								nom4 = bufEntrada.readLine();
								System.out.println("Por favor Digite la puntuacion de (0 a 10) : ");
								puntuacion4 = Integer.parseInt(bufEntrada.readLine());
								ingre4 = true;
							} else {
								if (ingre5==false) {
									nom5 = bufEntrada.readLine();
									System.out.println("Por favor Digite la puntuacion de (0 a 10) : ");
									puntuacion5 = Integer.parseInt(bufEntrada.readLine());
									ingre5 = true;
								} else {
									if (ingre6==false) {
										nom6 = bufEntrada.readLine();
										System.out.println("Por favor Digite la puntuacion de (0 a 10) : ");
										puntuacion6 = Integer.parseInt(bufEntrada.readLine());
										ingre6 = true;
									} else {
										if (ingre7==false) {
											nom7 = bufEntrada.readLine();
											System.out.println("Por favor Digite la puntuacion de (0 a 10) : ");
											puntuacion7 = Integer.parseInt(bufEntrada.readLine());
											ingre7 = true;
										} else {
											if (ingre8==false) {
												nom8 = bufEntrada.readLine();
												System.out.println("Por favor Digite la puntuacion de (0 a 10) : ");
												puntuacion8 = Integer.parseInt(bufEntrada.readLine());
												ingre8 = true;
											} else {
												System.out.println(""); // no hay forma directa de borrar la consola en Java
												System.out.println("La escuela esta llena");
											}
										}
									}
								}
							}
						}
					}
				}
				System.out.println("Nom 1= "+nom1+"| Nom 2= "+nom2+" | nom3= "+nom3+" | nom4= "+nom4+" | nom5= "+nom5);
				System.out.println("ingre1= "+ingre1+" | ingre2= "+ingre2+"  | ingre3= "+ingre3+"  | ingre4= "+ingre4+"  | ingre5= "+ingre5);
				break;
			case 2:
				System.out.println("Usuarios que han realizado el curso y su puntuacion: ");
				if (ingre1==true) {
					System.out.println("Nombre Cliente 1: "+nom1+" Realizo el curso");
				}
				if (ingre2==true) {
					System.out.println("Nombre Cliente 2: "+nom2+" Realizo el curso");
				}
				if (ingre3==true) {
					System.out.println("Nombre Cliente 3: "+nom3+" Realizo el curso");
				}
				if (ingre4==true) {
					System.out.println("Nombre Cliente 4: "+nom4+" Realizo el curso");
				}
				if (ingre5==true) {
					System.out.println("Nombre Cliente 5: "+nom5+" Realizo el curso");
				}
				if (ingre6==true) {
					System.out.println("Nombre Cliente 6: "+nom6+" Realizo el curso");
				}
				if (ingre7==true) {
					System.out.println("Nombre Cliente 7: "+nom7+" Realizo el curso");
				}
				if (ingre8==true) {
					System.out.println("Nombre Cliente 8: "+nom8+" Realizo el curso");
				}
				break;
			case 3:
				System.out.println("Digite el Cliente que desea consultar");
				buscar = bufEntrada.readLine();
				if (nom1.equals(buscar)) {
					if (puntuacion1>=8) {
						resultado = "Aprobo";
						System.out.println("Usuario buscado con Nombre: "+nom1+" Resultado: "+resultado);
					} else {
						resultado = "Reprobo";
						System.out.println("Usuario buscado con Nombre: "+nom1+" Resultado: "+resultado);
					}
				}
				if (nom2.equals(buscar)) {
					if (puntuacion2>=8) {
						resultado = "Aprobo";
						System.out.println("Usuario buscado con Nombre: "+nom1+" Resultado: "+resultado);
					} else {
						resultado = "Reprobo";
						System.out.println("Usuario buscado con Nombre: "+nom2+" Resultado: "+resultado);
					}
				}
				if (nom3.equals(buscar)) {
					if (puntuacion3>=8) {
						resultado = "Aprobo";
						System.out.println("Usuario buscado con Nombre: "+nom1+" Resultado: "+resultado);
					} else {
						resultado = "Reprobo";
						System.out.println("Usuario buscado con Nombre: "+nom3+" Resultado: "+resultado);
					}
				}
				if (nom4.equals(buscar)) {
					if (puntuacion4>=8) {
						resultado = "Aprobo";
						System.out.println("Usuario buscado con Nombre: "+nom1+" Resultado: "+resultado);
					} else {
						resultado = "Reprobo";
						System.out.println("Usuario buscado con Nombre: "+nom4+" Resultado: "+resultado);
					}
				}
				if (nom5.equals(buscar)) {
					if (puntuacion5>=8) {
						resultado = "Aprobo";
						System.out.println("Usuario buscado con Nombre: "+nom1+" Resultado: "+resultado);
					} else {
						resultado = "Reprobo";
						System.out.println("Usuario buscado con Nombre: "+nom5+" Resultado: "+resultado);
					}
				}
				if (nom6.equals(buscar)) {
					if (puntuacion6>=8) {
						resultado = "Aprobo";
						System.out.println("Usuario buscado con Nombre: "+nom1+" Resultado: "+resultado);
					} else {
						resultado = "Reprobo";
						System.out.println("Usuario buscado con Nombre: "+nom6+" Resultado: "+resultado);
					}
				}
				if (nom7.equals(buscar)) {
					if (puntuacion7>=8) {
						resultado = "Aprobo";
						System.out.println("Usuario buscado con Nombre: "+nom1+" Resultado: "+resultado);
					} else {
						resultado = "Reprobo";
						System.out.println("Usuario buscado con Nombre: "+nom7+" Resultado: "+resultado);
					}
				}
				if (nom8.equals(buscar)) {
					if (puntuacion8>=8) {
						resultado = "Aprobo";
						System.out.println("Usuario buscado con Nombre: "+nom1+" Resultado: "+resultado);
					} else {
						resultado = "Reprobo";
						System.out.println("Usuario buscado con Nombre: "+nom8+" Resultado: "+resultado);
					}
				}
				break;
			}
		} while (opcion!=0);
		System.out.println("Hasta pronto");
	}


}

