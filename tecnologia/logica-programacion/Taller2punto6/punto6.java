/*Un restaurante paga a sus 5 meseros dos clases de comisiones
Una comisión del 7% sobre toda venta. Otra comisión que depende del tipo de venta, así: 15% si la venta 
es de contado, 10% si la venta se hizo en cheque y, 5% si se hizo con tarjeta de crédito.
El restaurante tiene por cada venta:
-Tipos de ventas (1: contado; 2: cheque; 3: tarjeta) –
-Cuantía de la venta.
Elaborar un programa usando POO (mínimo 2 clases) que obtenga el total a pagar a cada uno de los 
meseros.*/

package Taller2punto6;

import java.util.Scanner;

public class punto6 {

    public static void main(String[] args) {
        int venta;
        Scanner leer=new Scanner(System.in);
        for(int i=0;i<=4;i++){
        clase1 Tventa=new clase1();
        System.out.println("Ingrese el tipo de venta para el mesero "+(i+1)+" eliga 1: contado; 2: cheque; 3: tarjeta :");
        Tventa.setTipoV(leer.nextInt());
        System.out.println("Ingrese el valor de la venta para el mesero "+(i+1)+" :");
        Tventa.setValorV(leer.nextDouble());
                venta=Tventa.getTipoV();
       Tventa.imprimir(Tventa.getTipoV(),Tventa.getValorV());
        }  
    }
    
}
