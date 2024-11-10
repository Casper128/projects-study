package Taller2;


import java.io.*;

public class punto9taller2 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
                punto9Areas figura=new punto9Areas();
		int opcion;
		// 9.El profesor de geometr�a est� explicando a sus estudiantes las f�rmulas para calcular el �rea de diferentes figuras geom�tricas,
		// para ello requiere una aplicaci�n que le facilite el ejercicio solicit�ndole los valores al estudiante.
		// La aplicaci�n debe permitir que el estudiante seleccione si desea calcular el �rea de un rect�ngulo, tri�ngulo o trapecio. 
		// No olvide solicitar los datos necesarios para realizar cada c�lculo y mostrar su respectivo resultado.
		// �rea de rect�ngulo = Base � Altura
		// Area de triangulo= Base � Altura/2
		// Area de trapecio= (Base1+Base2)�Altura/2
		System.out.println("Bienvenido a clase de geometria");
		System.out.println("1. Calcular el area de un rectangulo");
		System.out.println("2. Calcular el area de un triangulo");
		System.out.println("3. Calcular el area de un trapecio");
		System.out.println("Elija una opcion");
		opcion = Integer.parseInt(bufEntrada.readLine());
		switch (opcion) {
		case 1:
                        figura.rectangulo();
                        break;  
		case 2:
                        figura.triangulo();
			break;
		case 3:
                    figura.trapecio();
			break;
		}
	}


}

