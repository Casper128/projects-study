
package calculadora;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Double.parseDouble;


public class Calc {


    public static void main(String[] args) throws IOException {
                BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int opcion;
                operaciones operacion=new operaciones();
		// 5. Utilizando el ciclo que usted desee, crear un men� de ejecuci�n infinita hasta que el usuario desee terminar dicho ciclo.
		do {    
                    
                    //Menu hasta que el usuario desea salir
			System.out.println("Menu Calculadora");
			System.out.println("1. Suma ");
			System.out.println("2. Resta");
                        System.out.println("3. Multiplicacion");
                        System.out.println("4. Division");
                        System.out.println("5. Modulo");
			System.out.println("6. AC (Reiniciar valor de suma a 0)");
                        System.out.println("0. Finalizar calculadora");
                        System.out.println("Total:"+operacion.getDato());// Total que se lleva en cada operacion
			System.out.println("Digite la opcion que desea:");
			opcion = Integer.parseInt(bufEntrada.readLine());
			switch (opcion) {
			case 1:
				System.out.println("Por favor digite el numero que desea sumar: ");
				operacion.suma(parseDouble(bufEntrada.readLine()));//Metodo llamado por el objeto para operacion sumar
				break;
			case 2:
				System.out.println("Por favor digite el numero que desea restar: ");
				operacion.resta(parseDouble(bufEntrada.readLine()));//Metodo llamado por el objeto para operacion restas

				break;
                        case 3:
                            System.out.println("Por favor digite el numero que desea multiplicar: ");
                            operacion.multiplicacion( parseDouble(bufEntrada.readLine()));//Metodo llamado por el objeto para operacion multiplicar

                                break;
                        case 4:
                            System.out.println("Por favor digite el numero que desea division: ");
                            operacion.divisionUnNumero( parseDouble(bufEntrada.readLine())); //Metodo llamado por el objeto para operacion dividir

                                break;
                        case 5:
                            if(operacion.getDato()!=0){ //Validacion del valor ingresado para hallar el modulo
                            System.out.println("Por favor digite el numero al que desea hallar el modulo: ");
                            operacion.Modulo( parseDouble(bufEntrada.readLine()));//metodo llamado por el objeto cuando el valor de la calculadora sea diferente de 0
                            }else{
                            operacion.ModuloDosNum();// Metodo llamado por el objeto siempre que el total de la calculadora sea 0
                            }
                                break;
                        case 6:
                            operacion.setDato(0); // Cambiar valor a 0 para reiniciar la calculadora
                            break;
			}
                        
		} while (opcion!=0);
		System.out.println("Hasta pronto");
                
	}
    }
    

