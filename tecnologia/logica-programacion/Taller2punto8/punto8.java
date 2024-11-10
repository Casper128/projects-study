/*8)Aplicar uno de los dos paradigmas, sea POO o funciones y procedimientos.
Se tienen N registros donde cada uno contiene:
- Edad.
- Tipo (1: alto, 2: bajo, 3: medio).
- Nacionalidad (1: latino, 2: germano, 3: hindú).
Hacer un algoritmo que obtenga:
- Número de hindúes altos.
- Total de latinos.
- Germanos bajos menores de 30 años.
- Total de hindúes medianos.
- Total de germanos.
- Latinos bajos menores de 40 años*/

package Taller2punto8;

import java.util.Scanner;
public class punto8 {

    public static void main(String[] args) {
        int registros,edad,estatura,nacionalidad;
        int hAltos=0,latinos=0,germanosbajos=0,germanosmediano=0,totalGer=0,latinosB=0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuantos registros desea hacer: ");
        registros=leer.nextInt();
        while(registros!=0){
        {       
        System.out.println("Ingrese su edad: ");
        edad=(leer.nextInt());
        System.out.println("Ingrese su estatura (1: alto, 2: bajo, 3: medio) ");
        estatura=(leer.nextInt());
        System.out.println("Ingrese su nacionalidad (1: latino, 2: germano, 3: hindú)");
        nacionalidad=(leer.nextInt());
        
       if(estatura==1 && nacionalidad==3 ){
                hAltos=hAltos+1;
        }
        if(nacionalidad==1){
                latinos=latinos+1;
        }
        if(edad<30 && estatura==2 && nacionalidad==2){
            germanosbajos=germanosbajos+1;
        
        }
        if(nacionalidad==3 && estatura==3){
            germanosmediano=germanosmediano+1;
        }
        if(nacionalidad==2){
            totalGer=totalGer+1;
        }
        if(nacionalidad==1 && estatura==2 && edad<40){
            latinosB=latinosB+1;  
        }
        }
        registros--;
        }
        imprimir( hAltos, latinos, germanosbajos, germanosmediano,totalGer, latinosB);
    }
   
    
    public static void imprimir(int hAltos,int latinos,int germanosbajos,int germanosmediano,int totalGer,int latinosB){
    System.out.println("Los hindues altos son: "+hAltos);
    System.out.println("El total de latinos son: "+latinos );
    System.out.println("Los germanos de 30 a;os bajos son: "+germanosbajos);
    System.out.println("Total hindues medianos son: "+germanosmediano);
    System.out.println("Total germanos :"+totalGer);
    System.out.println("Total latinos bajos menores de 40: "+latinosB);
    
    }
    
}
