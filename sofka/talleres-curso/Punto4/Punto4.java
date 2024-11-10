/*
4. Escriba un algoritmo que efectúe la normalización de una colección de números reales. Para llevar a cabo esta 
normalización, se debe en primer lugar encontrar el número mayor de la colección; luego se divide cada número 
por dicho valor máximo, de forma que los valores resultantes (normalizados) estén comprendidos en el intervalo 
del 0 al 1. (USAR POO)
*/
package Punto4;


public class Punto4 {

    public static void main(String[] args) {
        double[]array ={19,22,33,24,55,100,250,18,200,10,11,200,15,14,15,16,27,38,49,20};
        clase1 mayorm=new clase1();
        clase1 arreglo=new clase1();
        mayorm.setMayor(arreglo.busquedaSecuencial(array));
        double normalizado=0;
        System.out.println("Numero mayor: "+mayorm.getMayor());
        for (int i = 0; i < array.length-1; i++) {
            normalizado=array[i]/mayorm.getMayor();
            System.out.println("Normalizado del numero en la posicion "+i+" : "+normalizado);
            
        }
        
    }
}
