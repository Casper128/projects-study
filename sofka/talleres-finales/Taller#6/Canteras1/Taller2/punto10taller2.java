package Taller2;

import java.io.*;

public class punto10taller2 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int cantidad;
		int ingreso;
		int opcion;
		int retiro;
		int saldo;
		String titular;
		// 10. El banco "Su banco fiel" es un banco que inicia sus actividades financieras y necesita una aplicaci�n para llevar las cuentas de sus usuarios; 
		// por lo tanto, se sugiere que la cuenta tenga los atributos titular y cantidad. 
		// Para cada cliente las cuentas permitir�n realizar ingresos, retiros o consultas de valor. 
		// En los ingresos no se pueden insertar valores negativos y para los retiros el valor no puede ser mayor al valor que tiene en la cuenta.
		System.out.println("Bienvenidos a Su Banco fiel , Que desea hacer elija una opcion por favor: ");
		System.out.println("1.Desea hacer un ingreso a la cuenta");
		System.out.println("2.Desea hacer un retiro de la cuenta");
		System.out.println("3.Desea consultar su saldo");
		saldo = 1000;
		opcion = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Digite el titular de la cuenta: ");
		titular = bufEntrada.readLine();
		switch (opcion) {
		case 1:
			System.out.println("Ingresar dinero:");
			System.out.println("Su saldo actual es: "+saldo);
			System.out.println("Digite la cantidad que desea ingresar en la cuenta:");
			cantidad = Integer.parseInt(bufEntrada.readLine());
			if (cantidad<=-1) {
				System.out.println(" Valor digitado es negativo y no es posible continuar");
			} else {
				System.out.println(" Valor ingresado es correcto");
				saldo = saldo+cantidad;
				System.out.println("Su saldo actual es: "+saldo);
			}
			break;
		case 2:
			System.out.println("Desea retirar dinero:");
			System.out.println("Su saldo actual es: "+saldo);
			System.out.println("Digite la cantidad que desea retirar de la cuenta:");
			cantidad = Integer.parseInt(bufEntrada.readLine());
			if (cantidad<=-1 || cantidad>=saldo) {
				System.out.println(" Valor digitado es negativo y no es posible continuar");
			} else {
				System.out.println(" Valor ingresado para descontar es correcto");
				saldo = saldo-cantidad;
				System.out.println("Su saldo actual es: "+saldo);
			}
			break;
		case 3:
			System.out.println("Consulta de saldo");
			System.out.println("Su saldo actual es: "+saldo);
			break;
		}
		System.out.println("Cuenta actual es de "+titular+" con un saldo de "+saldo);
	}


}

