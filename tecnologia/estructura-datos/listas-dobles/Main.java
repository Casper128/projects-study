
package ListasDobles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader cp = new BufferedReader(new InputStreamReader(System.in));

        ListaDoble LD = new ListaDoble();

        int opcion, elemento;

        do {

            System.out.println("\n-- MENÚ LISTAS DOBLES --\n");
            System.out.println("1. Insertar un elemento al inicio de la lista");
            System.out.println("2. Insertar un elemento al final de la lista");
            System.out.println("3. Mostrar la lista de inicio a fin");
            System.out.println("4. Mostrar la lista de fin a inicio");
            System.out.println("5. Eliminar elemento del inicio de la lista");
            System.out.println("6. Eliminar elemento del final de la lista");
            System.out.println("7. Buscar un elemento en la lista");
            System.out.println("0. Salir");

            System.out.println("\nSeleccione una opción: ");
            opcion = Integer.parseInt(cp.readLine());

            switch (opcion) {

                case 1:
                    System.out.println("\nInserte un número: ");
                    elemento = Integer.parseInt(cp.readLine());

                    LD.InsertarElementoInicio(elemento);

                    break;

                case 2:

                    System.out.println("\nInserte un número: ");
                    elemento = Integer.parseInt(cp.readLine());

                    LD.InsertarElementoFina(elemento);
                    break;

                case 3:

                    if (LD.ListaVacia()) {

                        System.out.println("\nLa lista esta vacía");

                    } else {

                        LD.MostrarInicioFinal();
                    }

                    break;

                case 4:

                    if (LD.ListaVacia()) {

                        System.out.println("\nLa lista esta vacía");

                    } else {

                        LD.MostrarFinalInicio();
                    }

                    break;

                case 5:

                    elemento = LD.EliminarElementoInicio();

                    System.out.println("El elemento eliminado es: " + elemento);

                    break;

                case 6:

                    elemento = LD.EliminarElementoFin();

                    System.out.println("El elemento eliminado es: " + elemento);

                    break;
                    
                case 7:
                    System.out.println("\nCual es el elemento que desea buscar: ");
                    elemento = Integer.parseInt(cp.readLine());
                    
                    
                    if(LD.BuscarElementoLista(elemento)){
                        
                        System.out.println("\nEl elemento se encuentra en la lista");
                        
                    }else{
                        
                        System.out.println("\nEl elemento no se encuentra en la lista");
                    }
                    
                    break;

                case 0:
                    System.out.println("\nHasta pronto");
                    break;
            }

        } while (opcion != 0);

    }

}
