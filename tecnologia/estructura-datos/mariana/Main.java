package Mariana;


import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula();

        JFrame jFrame = new JFrame();

        int opcion = 0;
        String getMessage;


        do {
            System.out.println("");
            getMessage = JOptionPane.showInputDialog(jFrame, "Selecciona una opcion \n"
                    + "1: Ingresar elementos \n"
                    + "2: Escoger la posicion para agregr elemento \n"
                    + "3: Escoger la posicion para eliminar elemento \n"
                    + "4: Buscar \n"
                    + "5: Mostrar elementos \n"
                    + "6: promedio \n"
                    + "7: Mostrar menor y mayor \n"
                    + ""
                    + "0: Salir"
            );

            opcion = Integer.parseInt(getMessage);

            switch (opcion) {

                case 1:
                    pelicula.add();
                    break;
                case 2:
                    pelicula.addOption();
                    break;
                case 3:
                    pelicula.deleteOption();
                    break;
                case 4:
                    pelicula.search();
                    break;

                case 5:
                    pelicula.mostrar("");
                    break;

                case 6:
                    pelicula.promedio();
                    break;
                    
                case 7:
                    pelicula.MayorMenor();
                    break;

                case 0:
                    break;

                default:

                    getMessage = JOptionPane.showInputDialog(null, "Ingrese una opcion valida \n"
                           + "1: Ingresar elementos \n"
                    + "2: Escoger la posicion para agregr elemento \n"
                    + "3: Escoger la posicion para eliminar elemento \n"
                    + "4: Buscar \n"
                    + "5: Mostrar elementos \n"
                    + "6: promedio \n"
                    + "7: Mostrar menor \n"
                    + "8: Mostrar mayor \n"
                    + "0: Salir");

            }

        } while (opcion != 8);

    }
}
