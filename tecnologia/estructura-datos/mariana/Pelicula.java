package Mariana;


import java.util.LinkedList;
import java.util.Scanner;
import javax.swing.*;

public class Pelicula {

    Scanner sc = new Scanner(System.in);
    LinkedList linkedList = new LinkedList();
    JFrame jFrame = new JFrame();
    int dato;
    int posicion;
    int opcion;
    int suma;
    int size = linkedList.size() - 1;
    double promedio;

    public void add() {
        String getMessage;
        getMessage = JOptionPane.showInputDialog(null, "Ingrese el dato");

        dato = Integer.parseInt(getMessage);

        linkedList.add(dato);

    }

    public void addOption() {
        String getMessage;

        do {

            getMessage = JOptionPane.showInputDialog(null, "Selecciona una opcion \n"
                    + "1: Ingresar elemento al principio \n"
                    + "2: Ingresar elemento al final \n"
                    + "3: 3: ingresar en una posicion especifica \n"
                    + "4: Salir \n"
            );

            opcion = Integer.parseInt(getMessage);

            switch (opcion) {
                case 1:
                    getMessage = JOptionPane.showInputDialog(null, "Ingrese el dato");
                    dato = Integer.parseInt(getMessage);
                    linkedList.addFirst(dato);
                    break;

                case 2:
                    getMessage = JOptionPane.showInputDialog(null, "Ingrese el dato");
                    dato = Integer.parseInt(getMessage);
                    linkedList.addLast(dato);
                    break;

                case 3:
                    getMessage = JOptionPane.showInputDialog(null, "Ingrese el dato");
                    dato = Integer.parseInt(getMessage);
                    addAndletePosition("add");
                    break;

                case 4:
                    break;

                default:
                    getMessage = JOptionPane.showInputDialog(null, "Ingrese una opcion valida  \n"
                            + "1: Ingresar elemento al principio \n"
                            + "2: Ingresar elemento al final \n"
                            + "3: 3: ingresar en una posicion especifica \n"
                            + "4: Salir \n"
                    );

            }

        } while (opcion != 4);

    }

    public void deleteOption() {
        String getMessage;
        do {

            getMessage = JOptionPane.showInputDialog(null, "Selecciona una opcion \n"
                    + "1: Eliminar elemento al principio \n"
                    + "2: Eliminar elemento al final \n"
                    + "3: 3: Eliminar en una posicion especifica \n"
                    + "4: Salir \n"
            );

            opcion = Integer.parseInt(getMessage);

            if (!validStack()) {
                switch (opcion) {
                    case 1:
                        linkedList.removeFirst();
                        break;

                    case 2:
                        linkedList.removeLast();
                        break;

                    case 3:
                        addAndletePosition("delete");
                        break;

                    case 4:
                        break;

                    default:

                        getMessage = JOptionPane.showInputDialog(null, "Ingrese una opcion valida  \n"
                                + "1: Eliminar elemento al principio \n"
                                + "2: Eliminar elemento al final \n"
                                + "3: 3: Eliminar en una posicion especifica \n"
                                + "4: Salir \n"
                        );
                }
            } else {
                System.out.println("Lista vacia, no puede elimanr elementos");
            }
            opcion = 4;

        } while (opcion != 4);

    }

    public void addAndletePosition(String action) {

        if (validStack()) {
            System.out.println("La lista esta vacia, la posicion en la que se agrego el elemento es en cero");
            posicion = 0;
        } else {

            do {

                System.out.println("Ingrese  la posicion, los valores validos son del 0 a" + size);
                posicion = sc.nextInt();

            } while ((posicion > size) || (size < 0));

        }

        if (action.equals("add")) {
            linkedList.add(posicion, dato);
        }

        if (action.equals("delete")) {
            linkedList.remove(posicion);
        }

    }

    public void mostrar(String action) {
        String getMessage;

        if (validStack()) {
            getMessage = JOptionPane.showInputDialog(null, "La Lista esta vacia");
        } else {
            getMessage = JOptionPane.showInputDialog(null, linkedList.toArray(), null);
        }
    }

    public void promedio() {
        String getMessage;

        if (validStack()) {
            getMessage = JOptionPane.showInputDialog(null, "La Lista esta vacia");
        } else {
            for (int i = 0; i < linkedList.size(); i++) {

                suma = suma + (Integer) (linkedList.get(i));

            }

        }

        promedio = suma / linkedList.size();
        getMessage = JOptionPane.showInputDialog(null, "El promedio es" + promedio);

    }

    public void search() {
        System.out.println("Ingrese el dato");
        dato = sc.nextInt();

        if (linkedList.indexOf(dato) == -1) {
            System.out.println("El dato no existe"); 
        } else {
            System.out.println("El dato se encuentra en la posicion :" + linkedList.indexOf(dato));
        }
    }
    public boolean validStack() {

        return linkedList.isEmpty();
    }
     public void MayorMenor(){
        Object[] num = linkedList.toArray();
        int numMax=(int) num[0]; 
        for(int i = 0;i<num.length;i++) {
                if ((int) num[i]>numMax){
                    numMax = (int)num[i];
                } 
            }
        int numMin=(int) num[0]; 
        for(int i = 0;i<num.length;i++) { 
                if ((int) num[i]<numMin){
                    numMin = (int)num[i];
                } 
            }
        String getMessage = JOptionPane.showInputDialog(null, "El numero mayor es:"+numMax+" y el menor es: "+numMin, null);
    }
     
    }
