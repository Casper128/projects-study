
package EDYL05.Pilas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejecutor {

 public static void main(String[] args) throws IOException {

 BufferedReader cp = new BufferedReader(new InputStreamReader(System.in));

 PilaLista pilita = new PilaLista();

 int opcion, dato, dato2;
 String producto = null;

 do {

 System.out.println("\n-- PILAS CON LISTAS --\n");

 System.out.println("1. Insertar un producto en la Pila");
System.out.println("2. Mostrar el de producto la CIMA de la Pila");
System.out.println("3. Mostrar los productos de la Pila");
System.out.println("4. Buscar producto en la Pila");
System.out.println("5. Eliminar el producto del TOPE de la Pila");
System.out.println("6. Eliminar listado de productos");
System.out.println("7. Eliminar producto específico de la Pila");
System.out.println("8. Actualizar producto");
System.out.println("9. ordenar datos en la Pila");
System.out.println("0. Salir\n");
System.out.println("Ingrese la opción deseada: ");
opcion = Integer.parseInt(cp.readLine());

 switch (opcion) {

 case 1:
System.out.println("\nPor favor ingrese la cantidad para la Pila: ");
dato = Integer.parseInt(cp.readLine());
     System.out.println("Ingrese el nombre del producto");
producto= cp.readLine();
pilita.Apilar(dato,producto);
break;

 case 2:
System.out.println("\nEl producto que se encuentra en la CIMA de la Pila es: " + pilita.CimaMostrar());
break;

 case 3:
System.out.println("\nLos productos de la Pila son: ");
pilita.MostrarPila();
break;

 case 4:
System.out.println("\nDigite el produicto a buscar en la Pila: ");
producto = cp.readLine();

 if (pilita.BuscarElemento(producto)) {
System.out.println("\nEl elemento SI se encuentra en la Pila");
} else {
System.out.println("\nEl elemento NO se encuentra en la Pila");
}

 break;

 case 5:

 int Resultado = pilita.EliminarTope();

 if (Resultado != 0) {

 System.out.println("\nEl producto: " + Resultado + " fue Eliminado del TOPE");

 } else {

 System.out.println("\nLa Pila se encuentra vacía");

 }

 System.out.println("\nLa nueva Pila queda: ");
pilita.MostrarPila();
break;

 case 6:
pilita.EliminarPila();
System.out.println("\nSe han borrado los elementos de la Pila");
System.out.println("La Pila ha quedado vacía");
break;

 case 7:
System.out.println("\nDigite el elemento a Eliminar: ");
producto = cp.readLine();

 pilita.EliminarDatoEspecifico(producto);

 System.out.println("\nLa nueva Pila queda: ");
pilita.MostrarPila();
break;

 case 8:
     System.out.println("");
     System.out.println("\nProducto actual que desea modificar");
     producto= cp.readLine();
System.out.println("\nIngrese el nuevo producto: ");
String producto_nuevo = cp.readLine();
System.out.println("\nIngrese la cantidad con la cual se va a reemplazar: ");
dato2 = Integer.parseInt(cp.readLine());

 pilita.ActualizarDatoExistente(producto,producto_nuevo, dato2);

 System.out.println("\nLa Pila con el cambio de dato queda: ");
pilita.MostrarPila();

 break;
 
  case 9:
pilita.promedio();
System.out.println("\nLa Pila es : ");
pilita.MostrarPila();

 break;

 case 0:
System.out.println("\nHasta Pronto");
break;

 default:
System.out.println("\nOpción Incorrecta... Intente de nuevo");
break;

 }

 } while (opcion != 0);

 }

}