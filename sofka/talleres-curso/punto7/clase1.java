/*
 * 7. Construya un algoritmo que lea una frase del español de máximo 100 caracteres y determine cuántas
palabras, vocales y consonantes tiene. (USAR POO)
 */
package punto7;

/**
 *
 * @author yonnyescobar
 */
public class clase1 {
    
    public static int contarConsonantes(String frase){
        //Validadndo las consonantes
        char consonantes[] = {'b','c','d','f','g','h','j','k','l','m','n','ñ','p','q','r','s','t','v','w','x','y','z'};
        int numeroConsonantes = 0;
        String letrasMinus = frase.toLowerCase();
        
        //Recorriendo la frase
        for (int i = 0; i < letrasMinus.length(); i++) {
            for (int j = 0; j < consonantes.length; j++) {
                if (letrasMinus.charAt(i) == consonantes[j]) {
                    numeroConsonantes++;
                }
            }
        }
        return numeroConsonantes;
    }
    //Función para contar vocales
    public static int contarVocales(String frase){
        //Validando las vocales
        char vocales[] = {'a','e','i','o','u'};
        int numeroVocales = 0;
        String letrasMinus = frase.toLowerCase();
        
        //Recorriendo la frase
        for (int i = 0; i < letrasMinus.length(); i++) {
            for (int j = 0; j < vocales.length; j++) {
                if (letrasMinus.charAt(i) == vocales[j]) {
                    numeroVocales++;
                }
            }
        }
        return numeroVocales;
    }
    //Función para contar las palabras
    public static int contarPalabras(String frase){
        int palabras = 1;
        for (int i = 0; i < frase.length(); i++) {
            if ((frase.charAt(i) == ' ') && (frase.charAt(i+1) != ' ')) {
                palabras++;
            }
        }
        return palabras;
    }
}
