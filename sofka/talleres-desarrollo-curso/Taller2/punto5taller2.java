package Taller2;

import java.io.*;

public class punto5taller2 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
                Punto5DrogueriaMiSalud producto=new Punto5DrogueriaMiSalud();

		int opcion;
		int opcion2;

		// 5.La Drogueria Mi Salud presta sus servicios en la localidad de Suba y requiere una aplicaci�n para poder facturar los productos 
		// que vende a sus clientes y para ello,los productos tienen unas caracter�sticas que deben indic�rsele al cliente para que pueda escoger 
		// el producto a comprar. Para cada cliente, se tienen las opciones de compra de producto, consulta de precios por producto 
		// y devoluciones en caso de que se presenten.
		System.out.println("Bievenido a Droguer�a Mi Salud , por favor eligir una opcion");
		System.out.println("1. Comprar productos");
		System.out.println("2. Consulta de precios por productos");
		System.out.println("3. Devolucion de productos");
		opcion = Integer.parseInt(bufEntrada.readLine());
		switch (opcion) {
		case 1:
			System.out.println("Que producto deseas consultar");
			producto.setProducto( bufEntrada.readLine());
			if (!producto.equals("")) {
				System.out.println("Producto Disponible");
			} else {
				System.out.println("Digite el producto que busca");
			}
			break;
		case 2:
			System.out.println("De que producto desea saber el precio?");
			producto.setProducto(bufEntrada.readLine());
			if (!producto.equals("")) {
				System.out.println("El valor del "+producto+" es:"+200+"$");
			} else {
				System.out.println("Digite por favor el producto que desea consultar");
			}
			break;
		case 3:
			System.out.println("Desea devolver un producto?");
			producto.setProducto(bufEntrada.readLine());
			System.out.println("Cual es el motivo de la devolucion");
			System.out.println("1. Digite 1 si desea ingresar una observacion de la devolucion");
			opcion2 = Integer.parseInt(bufEntrada.readLine());
			if (opcion2==1) {
				System.out.println("Explicanos la razon de la devolucion");
				producto.setAnotaciones(bufEntrada.readLine());
				System.out.println("El producto "+producto.getProducto()+" se devolvio por que: "+producto.getAnotaciones()+".");
				System.out.println("Comentarios procesados con exito");
			}
			break;
		}
		System.out.println("Hasta pronto, gracias visitarnos");
	}


}

