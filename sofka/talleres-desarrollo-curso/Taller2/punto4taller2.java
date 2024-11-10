package Taller2;


import java.io.*;
import java.util.Set;

public class punto4taller2 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
                PeliculasPunto4Taller2 doctorstrange=new PeliculasPunto4Taller2();
                PeliculasPunto4Taller2 jurassicpark=new PeliculasPunto4Taller2();
                PeliculasPunto4Taller2 topgun=new PeliculasPunto4Taller2();
		int opcion;
		int x = 0;
		// La video tienda que presta sus servicios de alquiler de pel�culas a los usuarios del barrio el Porvenir, 
		// requiere de una aplicaci�n que permita registrar el alquiler de las pel�culas que adquieren sus usuarios. 
		// Para cada usuario se debe permitir la opci�n de alquilar pel�cula, consultar pel�culas disponibles y 
		// recibir pel�cula en la video tienda con la opci�n de realizar anotaciones sobre estas si se llegan 
		// a presentar da�os u otra novedad sobre la pel�cula.
		doctorstrange.setAnotacion("Sin novedad");
		jurassicpark.setAnotacion("Sin novedad");
		topgun.setAnotacion("Sin novedad");
		doctorstrange.setAlquilada(true);
		jurassicpark.setAlquilada(false);
		topgun.setAlquilada(false);
		System.out.println("Elija una opcion");
		System.out.println("1. Peliculas Disponibles");
		System.out.println("2. Alquilar Peliculas");
		System.out.println("3. Realizar Entregas");
		System.out.println("4. Salir del sistema");
		opcion = Integer.parseInt(bufEntrada.readLine());
		switch (opcion) {
		case 1:
			System.out.println("Peliculas disponibles:");
			if (doctorstrange.getAlquilada()==true) {
				System.out.println("1.Doctor Strange: Disponible ");
			} else {
				System.out.println("1.Doctor Strange: Alquilada ");
			}
			if (jurassicpark.getAlquilada()==true) {
				System.out.println("2.JurassicPark: Disponible ");
			} else {
				System.out.println("2.JurassicPark: Alquilada ");
			}
			if (topgun.getAlquilada()==true) {
				System.out.println("3.Top Gun: Disponible ");
			} else {
				System.out.println("3.Top Gun: Alquilada ");
			}
			break;
		case 2:
			System.out.println("Alquilar disponibles:");
			if (doctorstrange.getAlquilada()==true) {
				System.out.println("1.Doctor Strange: Disponible ");
				System.out.println("Desea alquilarla: ");
				System.out.println("1.Si");
				System.out.println("2.No");
				x = Integer.parseInt(bufEntrada.readLine());
				if (x==1) {
					doctorstrange.setAlquilada(false);
				} else {
					System.out.println("1.Doctor Strange: Alquilada ");
				}
			}
			if (jurassicpark.getAlquilada()==true) {
				System.out.println("1.JurassicPark: Disponible ");
				System.out.println("Desea alquilarla: ");
				System.out.println("1.Si");
				System.out.println("2.No");
				x = Integer.parseInt(bufEntrada.readLine());
				if (x==1) {
					jurassicpark.setAlquilada(false);
				} else {
					System.out.println("1.Jurassic Park: Alquilada ");
				}
			}
			if (topgun.getAlquilada()==true) {
				System.out.println("1.TopGun : Disponible ");
				System.out.println("Desea alquilarla: ");
				System.out.println("1.Si");
				System.out.println("2.No");
				x = Integer.parseInt(bufEntrada.readLine());
				if (x==1) {
					topgun.setAlquilada(false);
				} else {
					System.out.println("1.TopGun : Alquilada ");
				}
			}
			break;
		case 3:
			if (doctorstrange.getAlquilada()==true) {
				System.out.println("1.Doctor Strange: Disponible ");
			} else {
				System.out.println("1.Doctor Strange: Alquilada ");
				System.out.println("Desea Entregarla: ");
				System.out.println("1.Si");
				System.out.println("2.No");
				x = Integer.parseInt(bufEntrada.readLine());
				if (x==1) {
					doctorstrange.setAlquilada(true);
					System.out.println("Alguna Observacion:");
					doctorstrange.setAnotacion(bufEntrada.readLine());
				}
			}
			if (jurassicpark.getAlquilada()==true) {
				System.out.println("1.JurassicPark: Disponible ");
			} else {
				System.out.println("1.Jurassic Park: Alquilada ");
				System.out.println("Desea Entregarla: ");
				System.out.println("1.Si");
				System.out.println("2.No");
				x = Integer.parseInt(bufEntrada.readLine());
				if (x==1) {
					jurassicpark.setAlquilada(true);
					System.out.println("Alguna Observacion:");
					jurassicpark.setAnotacion(bufEntrada.readLine());
				}
			}
			if (topgun.getAlquilada()==true) {
				System.out.println("1.TopGun : Disponible ");
			} else {
				System.out.println("1.TopGun : Alquilada ");
				System.out.println("Desea Entregarla: ");
				System.out.println("1.Si");
				System.out.println("2.No");
				x = Integer.parseInt(bufEntrada.readLine());
				if (x==1) {
					topgun.setAlquilada(true);
					System.out.println("Alguna Observacion:");
					topgun.setAnotacion(bufEntrada.readLine());
				}
			}
			break;
		case 4:
			System.out.println("Hasta luego");
			break;
		default:
			System.out.println("La opci�n elegida no existe");
		}
                
                
                if(x!=1){
                    System.out.println("Gracias por la visita");
                }
                else{
                		System.out.println("Peliculas disponibles:");
		if (doctorstrange.getAlquilada()==true) {
			System.out.println("1.Doctor Strange: Disponible "+doctorstrange.getAnotacion());
		} else {
			System.out.println("1.Doctor Strange: Alquilada "+doctorstrange.getAnotacion());
		}
		if (jurassicpark.getAlquilada()==true) {
			System.out.println("2.JurassicPark: Disponible "+jurassicpark.getAnotacion());
		} else {
			System.out.println("2.JurassicPark: Alquilada "+jurassicpark.getAnotacion());
		}
		if (topgun.getAlquilada()==true) {
			System.out.println("3.Top Gun: Disponible "+topgun.getAnotacion());
		} else {
			System.out.println("3.Top Gun: Alquilada "+topgun.getAnotacion());
		}
                }
	}


}

