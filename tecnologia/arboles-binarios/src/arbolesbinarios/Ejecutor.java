package arbolesbinarios;

// MAIN

import javax.swing.JOptionPane;

public class Ejecutor {

    public static void main(String[] args) {

        ArbolBinario Arbol = new ArbolBinario();
        int dato;
        int opcion;

        do {

            String menu = "--- MENÚ DE ÁRBOLES ---\n"
                    + "1. Insertar un Nodo en el ÁRBOL\n"
                    + "2. Mostrado del Árbol InOrden\n"
                    + "3. Mostrado del Árbol en PreOrden\n"
                    + "4. Mostrado del Árbol en PostOrden\n"
                    + "5. Eliminar NODO del Árbol\n"
                    + "6. Buscar Dato en Nodos\n"
                    + "7. Sumas nodos\n"
                    + "8. Contar nodos\n"
                    + "9. Contar hojas\n"
                    + "0. Salir";

            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {

                case 1:
                    dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un dato para el árbol: "));
                    Arbol.AgregarNodo(8);
                    Arbol.AgregarNodo(10);
                    Arbol.AgregarNodo(6);
                    Arbol.AgregarNodo(4);
                    Arbol.AgregarNodo(11);
                    Arbol.AgregarNodo(9);
                    Arbol.AgregarNodo(3);
                    Arbol.AgregarNodo(5);
                    break;

                case 2:

                    System.out.println("");
                    if (Arbol.ArbolVacio()) {

                        JOptionPane.showMessageDialog(null, "El árbol está vacío");

                    } else {

                        Arbol.inOrden(Arbol.raiz);
                    }

                    break;

                case 3:

                    System.out.println("");
                    if (Arbol.ArbolVacio()) {

                        JOptionPane.showMessageDialog(null, "El árbol está vacío");

                    } else {

                        Arbol.PreOrden(Arbol.raiz);
                    }

                    break;

                case 4:

                    System.out.println("");
                    if (Arbol.ArbolVacio()) {

                        JOptionPane.showMessageDialog(null, "El árbol está vacío");

                    } else {

                        Arbol.PostOrden(Arbol.raiz);
                    }

                    break;
                    
                case 5:
                    
                    dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un dato para borrar del árbol: "));
                    Arbol.Eliminar(dato);
                    
                    break;
                case 6:
                    
                    dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el dato que desea buscar en el árbol: "));
                    if(Arbol.buscar(dato)== true){
                        System.out.println("Su dato se encuentra en el arbol");
                    }
                    else{
                        System.out.println("Lo siento su dato no se encuentra en el arbol");
                    };
                    
                    
                    break;
                case 7:
                    System.out.println("La suma de su arbol es : "+Arbol.suma(Arbol.raiz));
                    
                    break;
                case 8:
                    System.out.println("Su arbol tiene : "+Arbol.contarNodos(Arbol.raiz)+" nodos");
                    
                case 9:
                    System.out.println("Su arbol tiene : "+Arbol.contarHojas(Arbol,Arbol.raiz)+" Hoja");

                    
                case 0:
                    JOptionPane.showMessageDialog(null, "Hasta Pronto");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Error intente de nuevo");
                    break;

            }

        } while (opcion != 0);

    }
    }
