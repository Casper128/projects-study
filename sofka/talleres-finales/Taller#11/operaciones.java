
package calculadora;

import java.util.Scanner;

public class operaciones {
    Scanner sc = new Scanner(System.in);

   private double dato;//Atributo del objeto para las operaciones
   
    //metodo para sumar
   public void suma(double valor){
       dato =dato+valor;
   }
    //Metodo para restar
    public void resta(double valor){
       dato =dato-valor;
   }    
    //Metodo para multiplicar
    public void multiplicacion(double valor){
       dato =dato*valor;
   }        
    
    //Metodo para dividir
    public void divisionUnNumero(double divisor){
        //Validacion del valor que se lleva de las operaciones si es diferente de 0
        if(dato!=0){
            //Validacion del valor ingresado si se va a divir que no se tenga en cuenta el 0
            if(divisor!=0){
            dato= dato/divisor;
            }
            //Mensaje para el usuario saber que ingreso un valor errado
            else{
                System.out.println("ingrese un numero diferente de 0");
            }
       }
        //Opcion en caso de que al iniciar las operaciones en numerador no contenga ninguna valor ingresado anteriormente
        else{
          divisionDosNumeros(divisor);
       
       }
    }
    //Metodo llamado para cuando el valor inicial es 0
  public void divisionDosNumeros(double numerador){  
      System.out.println("Digite el divisor");
        double divisor=sc.nextInt();
           dato= (numerador/divisor);
         
}
  
  //metodo para hallar el modulo 
      public void Modulo(double indice2){
//Validacion de que el valor que se lleva en el resultado sea diferente de 0
        if(dato!=0){
            //validacion de que al valor no se le halle modulo 0
            if(indice2!=0){
            dato= dato%indice2;
            }else{
                //Mensaje de valor ingresado 0
                System.out.println("Digite un valor diferente de 0 en el modulo");
            }
       }
        }
      //Metodo para hallar un modulo iniciando con sin un valor en la calculadora
    public void ModuloDosNum(){
        System.out.println("Digite el indice 1 al que le desea hallar el modulo");
            double indice1=sc.nextInt();
        System.out.println("Digite el indice 2 para hallar el modulo");
            double indice2=sc.nextInt();
            //Validacion de que el modulo no sea del numero 0
            if(indice2!=0){
            
            dato= indice1%indice2;
            }else{
                //Mensaje para valor ingresao 0
                System.out.println("Digite un valor diferente de 0 en el modulo");
            }
        } 
//Metodo para acceder al atributo
    public double getDato() {
        return dato;
    }
//Metodo para modificar el atributo
    public void setDato(double dato) {
        this.dato = dato;
    }
      
}
