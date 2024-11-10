/*Un vendedor desea calcular la comisión total sobre la venta de varios artículos. Al vendedor le
corresponde el 10% de comisión sobre artículos, cuyo precio es: menor o igual a $1.000 y el 7% de
comisión sobre aquellos artículos cuyo precio sea mayor de $1.000. Elabore un programa usando 
POO (mínimo 2 clases) paraobtenerla comisión total, si se conoce que el vendedor hizo Nventas.*/
package Taller2punto5;

import java.util.Scanner;

public class punto5 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int Nventas=0;
        System.out.println("Ingrese cuanta ventas hizo: ");
        Nventas=leer.nextInt();    
        for(int i=0;i<Nventas;i++){
            System.out.println("Ingrese el valor del producto: ");
            clase1 producto=new clase1();
            producto.setValorProducto(leer.nextDouble());
            producto.calcular7();
            producto.calcular10();
            System.out.println("La comision total es: "+producto.getValorProducto());
        }
        
        
    }
    
}
