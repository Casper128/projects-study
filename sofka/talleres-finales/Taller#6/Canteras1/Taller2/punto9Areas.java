
package Taller2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class punto9Areas {
    BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
    		private int altura;
		private int area;
		private int base;
		private int base2;

      public void rectangulo() throws IOException{         
       			System.out.println("El area de rectagulo es igual a (Base * Altura) ");
			System.out.println("Ingrese la base");
			base = Integer.parseInt(bufEntrada.readLine());
			System.out.println("Ingrese la altura");
			altura = Integer.parseInt(bufEntrada.readLine());
			area = base*altura;
			System.out.println(""); // no hay forma directa de borrar la consola en Java
			System.out.println("El area del rectangulo es: "+area+"(m2)");
       
      }
      public void triangulo() throws IOException{
      			System.out.println("El Area del triangulo= Base � Altura/2 ");
			System.out.println("Ingrese la base");
			base = Integer.parseInt(bufEntrada.readLine());
			System.out.println("Ingrese la altura");
			altura = Integer.parseInt(bufEntrada.readLine());
			area = base*altura/2;
			System.out.println(""); // no hay forma directa de borrar la consola en Java
			System.out.println("El area del rectangulo es: "+area+"(m2)");
      }
      public void trapecio() throws IOException{
      			System.out.println("El Area de trapecio= (Base1+Base2)�Altura/2 ");
			System.out.println("Ingrese la base 1 ");
			base = Integer.parseInt(bufEntrada.readLine());
			System.out.println("Ingrese la base 2 ");
			base2 = Integer.parseInt(bufEntrada.readLine());
			System.out.println("Ingrese la altura");
			altura = Integer.parseInt(bufEntrada.readLine());
			area = ((base+base2)*altura)/2;
			System.out.println(""); // no hay forma directa de borrar la consola en Java
			System.out.println("El area del rectangulo es: "+area+"(m2)");
      
      }
                
}
