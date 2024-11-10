
package estructuradatos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Double.parseDouble;

public class Alumno {
    
    BufferedReader cp=new BufferedReader(new InputStreamReader(System.in));
     private String cedula;
     private String nombre;
     private  int tamanoColumnas;
     private  int tamanoVector;
     private  double nota;
     

    public Alumno setDatosAlumno (String cedula, String nombre, double nota){
        
        this.cedula=cedula;
        this.nombre=nombre;
        this.nota=nota;
        
        return this; 
} 

    public Alumno(int tamanoVector,int tamanoColumnas) {
        this.tamanoVector = tamanoVector;
        this.tamanoColumnas=tamanoColumnas;
    }
    
    public Alumno vector () throws IOException {
       String vector []=new String [this.tamanoVector];
        for(int i=0;i<vector.length;i++){
              
            System.out.println("Ingrese el nombre del estudiante: ");
            this.nombre= cp.readLine();
            vector[i]=this.nombre;
            System.out.println("Nombre del estudiante: "+i+" es: "+vector[i]);
            
        }
    return this;
    }
    
     public Alumno MatrizNotas () throws IOException {
       double vectorNotas [][]=new double [this.tamanoVector][this.tamanoColumnas];
       double suma=0;
       int contador=0;
       double promedio=0;
       for(int i=0;i<vectorNotas.length;i++){
              for (int j = 0; j < vectorNotas[i].length; j++) {   
                System.out.println("Ingrese las notas del estudiante: "+i);
                this.nota= parseDouble(cp.readLine());
                vectorNotas[i][j]=this.nota;
                suma=suma+this.nota;
                contador+=1;
                System.out.println("Nombre del estudiante: "+(i+1)+" es: "+vectorNotas[i][j]);
            }
            promedio=suma/contador;
         System.out.println("Promedio del estudiante"+(i+1)+" es: "+promedio);  
        }
       
    return this;
    }
/*
    public Alumno promedio (double nota) throws IOException {
        double suma=0;
        int contador=0;
        for(int i=0;i<5;i++){
            
            System.out.println("Ingrese la nota: ");
            this.nota= parseDouble(cp.readLine());
            suma=suma+this.nota;
            System.out.println("La nota ingresada es: "+this.nota);
            System.out.println("\n");
            System.out.println("Suma: "+suma);
            
            contador=contador+1;
            
            
        }
        
        System.out.println("Promedio: "+suma/contador);
    return this;
    }*/
}

