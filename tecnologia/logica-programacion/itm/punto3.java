
package Examen1;

import java.util.Scanner;


public class punto3 {
    public static void main(String[] args) {
        int a, b,c,prom;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero"); 
        a=leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        b=leer.nextInt();
        System.out.println("Ingrese el tercer numero");
        c=leer.nextInt();
        
    if( (a > b && a < c)){
        System.out.println( "La numero mayor es: "+c+" El menor es: "+b);
		}
    if( (a > c && a < b)){
        System.out.println("La numero mayor es: "+b+" El menor es: "+c);
		}
    if(b>a & b<c){
        System.out.println("La numer mayor es: "+c+" El menor es: "+a);
		}
    if (b<a & b>c){
	System.out.println("La numero mayor es: "+a+" El menor es: "+c);
		}		
    if(c<a & c>b){
	System.out.println("La numero mayor es: "+b+" El menor es: "+c);
		}			
    if(c<b & c>a){
	System.out.println("La numero mayor es: "+a+" El menor es: "+c);
		}
    prom=((a+b+c)/3);
        System.out.println("El promedio es: "+prom);
}
        
}
