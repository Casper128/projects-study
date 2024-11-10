package Taller2;



import java.io.*;

public class punto8taller2 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
                punto8Pastel pastel=new punto8Pastel();
		int opcion;
		int opcion2;
		// El pastelero Don Carlos es el mejor pastelero de la ciudad y 
		// requiere una aplicaci�n que le permita registrar los pedidos 
		// de los clientes en cuanto a las tortas que realiza. Cada torta 
		// tiene unas caracter�sticas propias como sabor, cantidad (porciones) y decoraciones). 
		// Se requiere que la aplicaci�n permita registrar los pedidos, las tortas disponibles y 
		// las ventas que se registren diariamente.

		System.out.println("Bievenidos Pasteleria Don Carlos, elija una opcion");
		System.out.println("1. Registrar pedido");
		System.out.println("2. Tortas Disponibles");
		System.out.println("3. Registro de ventas");
		opcion = Integer.parseInt(bufEntrada.readLine());
		if (opcion==1) {
                pastel.pedido();
                
                }
		if (opcion==2) {
                    pastel.inventario();
		}
		if (opcion==3) {
			System.out.println("Ningun Registro de ventas");
		} else {
			if (opcion==3 || opcion==1) {
				System.out.println("Registros de ventas");
			}
			if (opcion==1) {
				System.out.println("Pedido: "+pastel.pedido+",Torta de sabor:  "+pastel.sabor+", Porciones: "+pastel.cantidad+", Decoracion: "+pastel.decoracion);
			}
			if (opcion==1) {
				 pastel.inventario();
			}
		}
	}


}

