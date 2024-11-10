
package segundapartefinal;

import java.util.Scanner;


public class Burbuja {

    public static void main(String[] args) {

          //Numero aleatorio para llenar el arreglo de la posicion correcta
        Scanner leer= new Scanner(System.in);
        System.out.print("Digite el numero de datos del registro: ");
        int numDatos=leer.nextInt();
        int[]Datos=new int[numDatos];
        int num=0;
        int numAleat=0;
     for(int i=0;i<numDatos;i++){ 
         for (int j = 0; j <numDatos; j++) {
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
        int []retorno=burbuja(Datos);
        long fin=System.nanoTime();
        double tiempo= (double)(fin-inicio)*1.0e-9;
        System.out.println("Tiempo de ejecucion: "+tiempo+"nanosegundos");
        
        for(int i=0;i<retorno.length;i++){ 
         System.out.print(retorno[i]+" ");

         }   
        
        
        
    }
    public static int[] burbuja(int[]matrix){
        int temp;
        for(int i=1;i < matrix.length;i++){
            for (int j=0 ; j < matrix.length- 1; j++){
                if (matrix[j] > matrix[j+1]){
                    temp = matrix[j];
                    matrix[j] = matrix[j+1];
                    matrix[j+1] = temp;
                }
            }
        }
        return matrix;
    }
}
