/*
 * 7. Construya un algoritmo que lea una frase del español de máximo 100 caracteres y determine cuántas
palabras, vocales y consonantes tiene. (USAR POO)
 */
package punto7;

import java.util.Scanner;

/**
 *
 * @author yonnyescobar
 */
public class punto7 {

    public static void main(String[] args) {
        //Solicitar la frase
        Scanner lector = new Scanner(System.in);
        String frase;
        System.out.println("Dígite una frase de máximo 100 caracteres: ");
        frase = lector.nextLine().trim();//.trim() quita los espacios al inicio y al final

        //Validando la cantidad de caracteres
        if (frase.length() <= 100) {

            //Objeto para contar consonantes
            clase1 contadorCons = new clase1();
            System.out.println("La cantidad de consonantes que tiene la frase es: " + contadorCons.contarConsonantes(frase));

            //Objeto para contar vocales
            clase1 contadorVoc = new clase1();
            System.out.println("La cantidad de vocales que tiene la frase es: " + contadorVoc.contarVocales(frase));

            //Objeto para contar palabras
            clase1 contadorPal = new clase1();
            System.out.println("La cantidad de palabras que tiene la frase es: " + contadorPal.contarPalabras(frase));

        } else {
            System.out.println("¡El número de caracteres en la frase supera la cantidad máxima permitida!");
        }
    }
}
