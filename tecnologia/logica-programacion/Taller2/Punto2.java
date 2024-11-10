/*En una empresa reparten uno de cinco premios para los mejores vendedores del mes, de loscuales
el sistema recibe el número de categoría de cada vendedor que durante el mes ha sido el mejor.
Hacer un programa que utilice funciones o procedimientos, donde el usuario ingrese para los 6
mejores vendedores del mes, el númerodecategoría del mejor vendedor y este muestre el premio
que se le adjudica según la siguiel usuario ingrese para los 6
mejores vendedores del mes, el númerodecategoría del mejor vendedor y este muntetabla:
Nº de Categoría Premio a entregar
1
2
3
4
5
Otro Numero
Viaje en crucero por el caribe para dos personas
Viaje a Brasil con gastos pagos para los partidos de Colombia
Viaje turístico por Perú con gastos pagos de tres días
Un Televisor Smart TV con HD, WIFI y 3D
Comisión adicional de $ 500000
Esa categoría no existe*/

package Taller2;

import java.util.Scanner;

public class Punto2 {
    
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int categoria = 1;
       while(categoria>0 && categoria<6){
            System.out.println("Ingrese la categoria que obtuvo el vendedor");
            categoria = leer.nextInt();
            double c=Calcular(categoria);
        } 
        System.out.println("Esa categoría no existe");
        
}
    private static int Calcular (int Cat){  
        if (Cat== 1) {
            System.out.println("El vendedor #"+Cat+" Obtiene un Viaje en crucero por el caribe para dos personas");
        }
        else if (Cat== 2) {
            System.out.println("El vendedor #"+Cat+" Obtiene un Viaje a Brasil con gastos pagos para los partidos de Colombia");
        }
        else if(Cat== 3) {
            System.out.println("El vendedor #"+Cat+" Obtiene un Viaje turístico por Perú con gastos pagos de tres días");
        }
        else if(Cat==4) {
            System.out.println("El vendedor #"+Cat+" Obtiene un Un Televisor Smart TV con HD, WIFI y 3D");
        }
        else if(Cat== 5) {
            System.out.println("El vendedor #"+Cat+" Obtiene un Comisión adicional de $ 500000");
        }
        else if(Cat> 6) {
            System.out.println("El vendedor #"+Cat+" Obtiene un Comisión adicional de $ 500000");
        }
        return Cat;
    }
}

