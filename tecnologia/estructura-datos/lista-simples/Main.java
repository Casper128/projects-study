
package ListaSimples;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "-- BIENVENIDO A LISTAS SIMPLES ---");

        int opcion = 0, dato = 0, dato_eliminado = 0;

        Lista ListaSimple = new Lista();

        do {

            String menu = "--MENÚ--\n\n"
                    + "1. Insertar Nodo al inicio de la Lista\n"
                    + "2. Inseertar Nodo al final de la Lista\n"
                    + "3. Insertar un Nodo en posicion específica de la Lista\n"
                    + "4. Eliminar Nodo del inicio de la Lista\n"
                    + "5. Eliminar Nodo del final de la Lista\n"
                    + "6. Eliminar un Nodo en específico de la Lista\n"
                    + "7. Buscar Elemento en la Lista\n"
                    + "8. Mostrar Lista\n"
                    + "9. Promedio\n"
                    + "10. Mayor\n"
                    + "11. Menor de la lista\n"
                    + "12. Ordenar"
                    + "0. Salir\n"
                    + "Ingrese su opción deseada: ";

            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {

                case 1:

                    dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserte un dato para el inicio de la lista: ", "Ingreso Dato"));
                    ListaSimple.AgregarInicioLista(dato);
                    break;
                    
                case 2:
                    dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserte un dato para el final de la lista: ", "Ingreso Dato"));
                    ListaSimple.AgregarFinLista(dato);
                    break;
                    
                case 3:
                    int posicion=Integer.parseInt(JOptionPane.showInputDialog(null, "Inserte en la posicion de la lista: ", "Posicion"));
                    dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserte un dato para la posicion de la lista: ", "Ingreso Dato"));
                    ListaSimple.insrtarPorPosicion(posicion, dato);
                    break;
                    
                    
                case 4:
                    dato_eliminado = ListaSimple.EliminarElementoInicio();
                    JOptionPane.showMessageDialog(null, "El dato ha sido eliminado con éxito y fue el: " + dato_eliminado);
                    break;
                    
                case 5:
                    dato_eliminado = ListaSimple.EliminarElementoFinal();
                    JOptionPane.showMessageDialog(null, "El dato ha sido eliminado con éxito y fue el: " + dato_eliminado);
                    break;
                    
                case 6:
                    dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserte un dato para eliminar de la lista: ", "Ingreso Dato"));
                    ListaSimple.EliminarNodoEspecifico(dato);
                    JOptionPane.showMessageDialog(null, "El dato ha sido eliminado con éxito");
                    break;
                    
                case 7:
                    dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un dato para buscar en la lista: ", "Ingreso Dato"));
                    
                    if(ListaSimple.BuscarElemento(dato)){
                        
                      JOptionPane.showMessageDialog(null, "El dato se encuentra en la lista");  
                    
                    }else{
                    
                    JOptionPane.showMessageDialog(null, "El dato no se encuentra en la lista");
                    }
                    
                    break;
                    
                case 8:
                    JOptionPane.showMessageDialog(null, ListaSimple.MostrarLista());
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null,"Su promedio es: "+ListaSimple.promedio());
                    break;
                    
                case 10:
                    JOptionPane.showMessageDialog(null, "El numero mayor es: "+ListaSimple.Mayor());
                    break;
                    
                case 11:
                JOptionPane.showMessageDialog(null, "El numero menor es: "+ListaSimple.Menor());
                break;    
                
                case 12:
                JOptionPane.showMessageDialog(null, "Su lista ya fue ordenada: "+ListaSimple.ordenar());
                break;  
                case 0:
                    JOptionPane.showMessageDialog(null, "--- Hasta Pronto---");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción NO válida... intente de nuevo");
                    break;

            }

        } while (opcion != 0);

    }

}