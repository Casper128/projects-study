package punto11;

public class punto11 {

    public static void main(String[] args) {

        int[][] matriz = {
            {10, 5, 12},
            {98, 5, 6},
            {8, 4, 6},};
        System.out.println("La matriz es:");
        imprimirMatriz(matriz);
  int y = 0,x = 0,suma=0;
            while (x < matriz.length && y < matriz.length) {
                suma += matriz[y][x];
                x++;
                y++;
        }
        System.out.println("La suma de la diagonal de la matriz es: " + suma);
    }

    static void imprimirMatriz(int[][] matriz) {
        for (int y = 0; y < matriz.length; y++) {
            for (int x = 0; x < matriz[y].length; x++) {
                int numeroActual = matriz[y][x];
                System.out.printf("%5d", numeroActual);
            }
            System.out.println();
        }
    }
}
