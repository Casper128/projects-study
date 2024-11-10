
package segundapartefinal;

import java.util.Scanner;


public class Insercion {

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
        int []retorno=Insercion(Datos);
        long fin=System.nanoTime();
        double tiempo= (double)(fin-inicio)*1.0e-9;
        System.out.println("Tiempo de ejecucion: "+tiempo+"nanosegundos");
        for(int i=0;i<retorno.length;i++){ 
         System.out.print(retorno[i]+" ");
         }   
        
        
        
        
    }

    public static int[] Insercion (int[] vector) {
      for (int i=1; i < vector.length; i++) {
         int aux = vector[i];
         int j;
         for (j=i-1; j >=0 && vector[j] > aux; j--){
              vector[j+1] = vector[j];
          }
         vector[j+1] = aux;
      }
      return vector;
   }
    
    
}
