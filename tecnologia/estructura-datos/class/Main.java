
package estructuradatos;

import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException{
        Scanner leer= new Scanner(System.in);
        try {
        System.out.println("Cuantos alumnos va a ingresar: ");
        int cantEst=leer.nextInt();
        System.out.println("Cuantos notas va a ingresar: ");
        int cantNot=leer.nextInt(); 
        Alumno materia1=new Alumno(cantEst,cantNot);
         materia1.vector().MatrizNotas();
            }
        catch(Exception e){
            System.out.println("Ingrese un numero");
        
    }
    }   
}
