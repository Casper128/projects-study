
package Punto8;

import java.util.Scanner;


public class punto8 {

    public static void main(String[] args) {
        System.out.println("Digite su palabra: ");
        Scanner leer = new Scanner(System.in);
        String cadena=leer.nextLine();
                char[]invertir=cadena.toCharArray();                      
                        for(int i=cadena.length()-1;i>=0;i--){
                            System.out.print(""+invertir[i]);
                        }
    }
    
}
