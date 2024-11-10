/*
Construir un programa que permita generar aleatoriamente 40 números enteros positivos entre 5 y 10 ambos 
incluidos. Contar cuantos números 5, 6, 7, 8, 9 y 10 se generaron. Un ejemplo para 20 números: 8, 6, 9, 10, 7, 
10, 7, 6, 8, 7, 8, 10, 8, 8, 9, 10, 9, 9, 6, 7 entonces contando los números generados tenemos: c6=3, c7=4, 
c8=5, c9=4, c10=4. APLICAR ya sea POO o funciones y procedimientos, cualquiera de las dos
 */
package Taller2punto10;

public class punto10 {

    public static void main(String[] args) {
        int acumulador = 0, cinco = 0, seis = 0, siete = 0, ocho = 0, nueve = 0, diez = 0;
        int num=0,numAleat=0;
        for (int i = 1; i <= 40; i++) {
               numAleat=numeroAleatorio(num,numAleat);
            
                if (numAleat == 5) {
                    cinco++;
                }
                if (numAleat == 6) {
                    seis++;
                }
                if (numAleat == 7) {
                    siete++;
                }
                if (numAleat == 8) {
                    ocho++;
                }
                if (numAleat == 9) {
                    nueve++;
                }
                if (numAleat == 10) {
                    diez++;
                }
                System.out.print(numAleat+"-");
        }
        System.out.println("\n"+"Los numeros 5 contados fueron: " + cinco);
        System.out.println("Los numeros 6 contados fueron: " + seis);
        System.out.println("Los numeros 7 contados fueron: " + siete);
        System.out.println("Los numeros 8 contados fueron: " + ocho);
        System.out.println("Los numeros 9 contados fueron: " + nueve);
        System.out.println("Los numeros 10 contados fueron: " + diez);
        }
    
    
    
    
    
    public static int numeroAleatorio(int num,int numAleat){
while(true){
            num = (int) (Math.random() * 100);
            if(num>=5 && num<=10){
            numAleat=num;
            break;
            }

}
   return numAleat;
   }
    
    

    }
