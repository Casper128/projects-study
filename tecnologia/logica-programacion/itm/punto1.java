
package Examen1;

import java.util.Scanner;
public class punto1 {

    public static void main(String[] args) {
    int a=0;
    
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un numero");
    a=leer.nextInt();
    double modulo3=a % 3;
    double modulo5=a % 5;
	if(modulo3==0){
            System.out.println("es multiplo de 3"+" "+modulo3);
        }
        else if(modulo3!=0){
            System.out.println("No es multiplo de 3");
	}
	if(modulo5==0){
            System.out.println("es múltiplo de 5"+" "+modulo5);
        }
	else if(modulo5!=0){
            System.out.println("No es multiplo de 5");
	}
	if(a>0){
            System.out.println("Positivo");
        }
	else {
            System.out.println("Negativo");
                }
}
}

