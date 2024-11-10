
package segundapartefinal;

import java.util.Scanner;


public class Quick {

    public static void main(String[] args) {

          //Numero aleatorio para llenar el arreglo de la posicion correcta
        Scanner leer= new Scanner(System.in);
        System.out.print("Digite el numero de datos del registro: ");
        int numDatos=leer.nextInt();
        int[]Datos=new int[numDatos];
        int num=0;
        int numAleat=0;
     for(int i=0;i<numDatos;i++){ 
         for (int j = 0; j < 10; j++) {
         while(true){
            num = (int) (Math.random() * 1000);
            if(num>=100 && num<=999){
            numAleat=num;
            break;
            }
            }
         Datos[i]=numAleat;
         }
     }  
        int contador=0;
     for(int i=0;i<numDatos;i++){ 
         System.out.print(Datos[i]+" ");
         contador++;
         }   
        System.out.println("contador: "+contador);
        long inicio=System.nanoTime();
        int []retorno=quickSort(Datos,0,Datos.length-1);
        long fin=System.nanoTime();
        double tiempo= (double)(fin-inicio)*1.0e-9;
        System.out.println("Tiempo de ejecucion: "+tiempo+"nanosegundos");
     for(int i=0;i<retorno.length;i++){ 
         System.out.print(retorno[i]+" ");

         }        
    }
   
   public static int[] quickSort(int[] vector, int izquierda, int derecha) {
        int pivote = vector[izquierda];
        int i = izquierda;
        int j = derecha;
        int auxIntercambio;
        while (i < j) {
            while (vector[i] <= pivote && i < j) {
                i++;
            }
            while (vector[j] > pivote) {
                j--;
            }
            if (i < j) {
                auxIntercambio = vector[i];
                vector[i] = vector[j];
                vector[j] = auxIntercambio;
            }
        }
        vector[izquierda] = vector[j];
        vector[j] = pivote;
        if (izquierda < j - 1) {
            quickSort(vector, izquierda, j - 1);
        }
        if (j + 1 < derecha) {
            quickSort(vector, j + 1, derecha);
        }
        return vector;
    }


        }   

      
