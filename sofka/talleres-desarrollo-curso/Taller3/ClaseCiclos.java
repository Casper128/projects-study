package Taller3;

public class ClaseCiclos {

    public int ancho;
    public int i;
    public int j;
    public int k;
    public int r;
    public int t;
    public int num;
    public int operacion;
    public String nombre;
    public void medioarbolDerecho() {
        i = 1;
        j = 1;
        for (i = 1; i <= 10; i++) {
            for (j = 1; j <= 10; j++) {
                if (j <= i) {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }

    public void medioarbolIzquierdo() {
        i = 0;
        j = 10;
        while (i < 10) {
            while (j > 1) {
                if (j - 1 > i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
                j = j - 1;
            }
            i = i + 1;
            j = 10;
            System.out.println("*");
        }

    }
    public void arbolCompleto(){
    
    i = 1;
		do {
			j = 21;
			r = ((21)-i)/2;
			do {
				if ((j>=1 && j<=r) || (j>r+i && j<=22)) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
				j = j-1;
			} while (j>0);
			System.out.println("");
			i = i+2;
			// Final completo del arbol 21 y 22 son los tam;os del arbol de ancho
		} while (i<22);
		k = 0;
		i = 0;
		t = 3;
		// inicio del tallo del arbol
		do {
			j = 21;
			// 9
			r = ((21)-t)/2;
			do {
				// validacion de la posicion de la impresion en el arbol si es mayor que 12 y menor que 9 imprime vacio
				if ((j>=1 && j<=r) || (j>r+t && j<=22)) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
				j = j-1;
			} while (j>0);
			// control del taller en la primera iteracion no aumenta T en el segundo ciclo imprime la misma linea y incrementa t para que el tercer ciclo imprima mas * 
			if (i>=1) {
				t = t+2;
			}
			i = i+1;
			// salta de linea al finalizar el ciclo e imprime un vacio
			System.out.println("");
			// Finaliza el ciclo
		} while (i<4);
    
    
    }

    public void operacion() {
        i = 10;
        j = 1;

        while (i >= 1) {
            if (i == num) {
                while (j <= 10) {
                    operacion = j * i;
                    System.out.println(j + " * " + i + " =" + operacion);
                    j = j + 1;
                }
            }
            i = i - 1;
        }

    }
}
