/*Hacer un programa que utilice funciones o procedimientos, que calcule y muestre el salario nominal, el valor 
de la retención en la fuente y el valor del salario total a pagar para 5 trabajadores, uno por uno, según las 
siguientes condiciones: A cada trabajador le pagan según sus horas trabajadas, donde el valor del sueldo 
nominal es el número de horas trabajadas por el valor de la hora. De acuerdo con el salario nominal que 
gana el trabajador, se le descuenta un valor de retención en la fuente así:
- Si el salario nominal excede los $2.000.000, el valor de retención en la fuente es el 10% del salario
nominal.
- Si el salario nominal esta entre $800.000 y $2.000.000 la retención en la fuente será del 7% del salario
nominal y si es menos de $800.000 la retención será del 3% del salarionominal.
Hacer un programa que calcule y muestre para cada trabajador lo siguiente: El valor del salario nominal. El
valor de la retención en la fuente y el valor del salario total a pagarle altrabajador*/
package Taller2;

import java.util.Scanner;

public class Punto1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        double Vhora = 9000;
        double Htrabajadas = 0;
        double Snominal = 0, Stotal = 0;
        double RetFuente = 0;
        for (int i = 0; i <= 4; i++) {

            System.out.println("Ingrese las horas trabajadas del empelado " + (i + 1));
            Htrabajadas = leer.nextInt();
            Snominal = (Htrabajadas * Vhora);
            double c=Calcular(Snominal,Stotal,RetFuente);
            System.out.println("El salario nominal del empleado " + (i+1) + " es :" + Snominal);
            System.out.println("El salario total del empleado " + (i+1) + " es :" + c);
            System.out.println("La retencion de la fuenete del empleado " + (i+1) + " es :" + (Snominal-c));
        } 

        
}
    private static double Calcular (double Salarionominal,double Stotal,double RetFuente){  
        if (Salarionominal >= 2000000) {
            RetFuente = Salarionominal * 0.1;
            Stotal = Salarionominal - RetFuente;
        }
        else if (Salarionominal >= 800000 && Salarionominal < 2000000) {
            RetFuente = Salarionominal * 0.07;
            Stotal = Salarionominal - RetFuente;
        }
        else{
            RetFuente = Salarionominal * 0.03;
            Stotal = Salarionominal - RetFuente;
        }
        return Salarionominal - RetFuente;
    }
}


