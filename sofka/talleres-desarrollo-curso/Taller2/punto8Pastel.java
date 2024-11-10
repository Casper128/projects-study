
package Taller2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class punto8Pastel {
    		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
    		public String a="Mango";
		public String b="Fresa";
		public String c="Cereza";
                public int d=0;
                public int e=0;
		public int f=1;
		int cantidad = 0;
		String decoracion = null;
		String pedido = null;
		String sabor = null;
    public  void pedido() throws IOException{
    
    
			System.out.println("Tome su pedido: Digite el nombre del cliente");
			pedido = bufEntrada.readLine();
			System.out.println("Que sabor desea en el pedido?");
			System.out.println("Mango");
			System.out.println("Fresa");
			System.out.println("Cereza");
			sabor = bufEntrada.readLine();
			if (sabor.equals(a)) {
				d = 1;
			}
			if (sabor.equals(b)) {
				e = 1;
			}
			if (sabor.equals(c)) {
				f = 1;
			}
			System.out.println("Que cantidad de porciones desea?");
			System.out.println("4");
			System.out.println("12");
			System.out.println("18");
			cantidad = Integer.parseInt(bufEntrada.readLine());
			System.out.println("Que decoracion desea en el pedido?");
			System.out.println("Mickye mouse");
			System.out.println("Karol G");
			System.out.println("Dora La exploradora");
			decoracion = bufEntrada.readLine();
			System.out.println(""); 
		}
    public void inventario(){
    			System.out.println("Tortas Disponibles");
			if (d==0) {
				System.out.println("Torta de "+a+" : Disponible");
			} else {
				System.out.println("Torta de "+a+" : NO Disponible");
			}
			if (e==0) {
				System.out.println("Torta de "+b+" : Disponible");
			} else {
				System.out.println("Torta de "+b+" : NO Disponible");
			}
			if (f==0) {
				System.out.println("Torta de "+c+" : Disponible");
			} else {
				System.out.println("Torta de "+c+" : NO Disponible");
			}
    
    }

    }    
    
    
    
    

