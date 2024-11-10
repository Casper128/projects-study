/*Una empresa tiene 5 empleados y de cada uno de ellos posee la siguiente información:
Código.
Nombres.
Número de hijos.
Salario por hora.
Número de horas trabajadas al mes.
La retención por cada empleado se determina así:
Para salarios menores de $300.000: si el número de hijos es mayor de 6 no hay retención; si el número de
hijos es menor o igual a 6, se le retiene un porcentaje igual a 6 menos el número de hijos dividido por 2.
Para salarios iguales o mayores a $300.000: si el número de hijos es menor de 3, se le retiene un 3%; si el
número de hijos es mayor o igual a 3 se le retiene un porcentaje igual a 10 dividido por el número de hijos.El
subsidio por cada hijo es de $1.200. Elaborar un algoritmo que muestre: código, nombres, devengado,
retención, subsidio y total a pagar a cadaempleado. APLICAR funciones o procedimientos*/
package Taller2punto4;

import java.util.Scanner;

public class punto4 {

    public static void main(String[] args) {
        String codigo, nombre;
        double SHora;
        int Hmes;
        double Sdevengado, totalPagar, subsidio, numHijos;
        for (int i = 0; i <= 4; i++) {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese el codigo del empleado " + (i + 1));
            codigo = leer.nextLine();
            System.out.println("Ingrese los nombres del empleado " + (i + 1));
            nombre = leer.nextLine();
            System.out.println("Ingrese cuantos hijos tiene el empleado " + (i + 1));
            numHijos = leer.nextInt();
            System.out.println("Ingrese el salario por hora del empleado " + (i + 1));
            SHora = leer.nextDouble();
            System.out.println("Ingrese las horas trabajadas en el mes del empleado " + (i + 1));
            Hmes = leer.nextInt();
            Sdevengado = Hmes * SHora;
            subsidio = numHijos * 1200;
            totalPagar = retencion(Sdevengado, numHijos);
            System.out.println("Codigo del empleado " + (i + 1) + "es : " + codigo);
            System.out.println("Nombre del empleado " + (i + 1) + "es : " + nombre);
            System.out.println("Salario Devengado del empleado " + (i + 1) + "es : " + Sdevengado);
            System.out.println("Subsidio del empleado " + (i + 1) + "es : " + subsidio);
            System.out.println("Total a pagar al empleado " + (i + 1) + "es : " + totalPagar);
            System.out.println("Retencion del empleado " + (i + 1) + "es : " + (Sdevengado - totalPagar));

        }
    }

    public static double retencion(double Sdevengado, double Hijos) {
        double retencion = 0;
        if (Sdevengado < 300000) {
            if (Hijos > 6) {
                retencion = 0;

            } else if (Hijos <= 6) {
                retencion = (((6 - Hijos) / 2) / 100) * Sdevengado;

            }

        } else if (Sdevengado >= 300000) {
            if (Hijos < 3) {
                retencion = 0.03 * Sdevengado;

            } else if (Hijos >= 3) {
                retencion = ((10 / Hijos) / 100) * Sdevengado;

            }

        }

        return Sdevengado - retencion;
    }

}
