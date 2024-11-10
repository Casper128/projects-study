/*
12. Multiplicación de dos matrices. Si A y Bson matrices de dimensiones nxm y mxk, respectivamente, la matriz 
C=A*B, de dimensión nxk, se calcula haciendo que:
Especifique y escriba un algoritmo para cada una de estas operaciones.
 */
package punto12;

public class punto12 {

    public static void main(String[] args) {
            int[][] matrizA = {
            {10, 5,1},
            {98, 5,1},
            {8, 4,1}};              
            int[][] matrizB = {
            {10, 5, 12},
            {98, 5, 6},
            {8, 4, 6},};
            
            multiplicacion(matrizA,matrizB);
            
    }public static int[][] multiplicacion(int[][] a, int[][] b) {
    int[][] c = new int[a.length][b[0].length];
    // se comprueba si las matrices se pueden multiplicar
    if (a[0].length == b.length) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    // aquí se multiplica la matriz
                    c[i][j] += a[i][k] * b[k][j];
                    System.out.println("Posicion fila"+i+" columna "+k+"valor en la matriz A: "+a[i][k]+
                            "Posicion fila"+i+" columna "+k+"valor en la matriz B: "
                            + b[k][j]);
                    System.out.println("Posicion fila"+i+" columna "+j+"valor en la matriz: "+(a[i][k] * b[k][j]));
                }
            }
        }
    }     for (int y = 0; y <c.length; y++) {
            for (int x = 0; x < c[y].length; x++) {
                int numeroActual = c[y][x];
                System.out.printf("%5d", numeroActual);
            }
            System.out.println("");
        }
    /**
     * si no se cumple la condición se retorna una matriz vacía
     */
    return c;
}
}
    

