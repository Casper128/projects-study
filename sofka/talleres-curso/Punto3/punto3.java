/* FALTA APLICAR POO
3. Suponga que se quiere construir un algoritmo que califique un examen de selección múltiple presentado por 
un estudiante de Lógica de Programación 1. En cada una de las preguntas del examen, el estudiante debió elegir 
una de cinco opciones, identificadas con las letras A, B, C, D y E. (USAR POO)
Las entradas para el algoritmo son:
• El número de preguntas del examen
• Cada una de las respuestas dadas por el estudiante
• Las respuestas correctas
• la nota obtenida. Esta nota corresponde al número de aciertos que tuvo el estudiante.
 */
package Punto3;

import java.util.Random;
import java.util.Scanner;

public class punto3 {

    public static void main(String[] args) {
       
        Scanner leer= new Scanner(System.in);
        System.out.print("Ingrese el numero de preguntas del examen ");
        int numPreguntas=leer.nextInt();
        String[]respuestas=new String[numPreguntas];
        
        //Pedir respuestas        
        for (int i = 0; i <=numPreguntas-1; i++) {
            System.out.print("Respuesta de la pregunta "+(i+1)+": ");
            respuestas[i]=(leer.next());
              
        }
       
        
        //Numero aleatorio para llenar el arreglo de la posicion correcta
         
        int num=0;
        int numAleat=0;
        int position=0;
        int[]posicion=new int[numPreguntas];
     for(int i=0;i<numPreguntas;i++){ 
      while(true){
            num = (int) (Math.random() * 100);
            if(num>=0 && num<=4){
            numAleat=num;
            posicion[i]=num;
            break;
            }
        }
     }  
        //Seleccion de respuesta correcta
        String[] opciones={"A","B","C","D","E"};
        String []correctas=new String[numPreguntas];
        for (int i = 0; i <=numPreguntas-1; i++) {
            position=posicion[i];
            correctas[i]=opciones[position];
            System.out.print(" correcta: "+correctas[i]);
        }
        
        // comparar respuestas vs correctas
        int contadorCorrectas=0;
        String resp;
        String corr;
        for (int i = 0; i <=numPreguntas-1; i++) {
            resp= respuestas[i];
            corr= correctas[i];
            if(resp.equalsIgnoreCase(corr)){
                System.out.println(" Respuestas "+i+": "+respuestas[i]);
                System.out.print(" correctas "+i+": "+correctas[i]);
                System.out.println("");
            contadorCorrectas+=1;
                System.out.println("Contador de correctas "+contadorCorrectas);
                System.out.println("");
            }
            
        }
            double resultado=contadorCorrectas/(double)numPreguntas*5;
            System.out.println("Su nota fue: "+resultado);
            System.out.println("Su # de preguntas fue: "+numPreguntas);
        
    }
    
}
