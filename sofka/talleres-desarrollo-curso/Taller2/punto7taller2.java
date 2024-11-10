package Taller2;



import java.io.*;

public class punto7taller2 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
                Punto7IMC persona=new Punto7IMC();
		// 7.La Secretar�a de Salud Municipal requiere de una aplicaci�n que le permita calcular el IMC (�ndice de masa corporal) 
		// y requiere los datos peso en kilogramos y estatura en metros Para cada persona encuestada adicional a los datos suministrados, 
		// debe mostrar el resultado para cada uno y establecer en qu� rango se encuentra (bajo peso, normal, sobrepeso y obeso).
		System.out.println("Bievenido a La Secretar�a de Salud Municipal, por favor Ingrese los siguientes datos");
		System.out.println("1. Por favor ingrese el peso en kilogramos");
		persona.setPeso(Double.parseDouble(bufEntrada.readLine()));
		System.out.println("2. Por favor ingrese la estatura en metros");
		persona.setEstatura(Double.parseDouble(bufEntrada.readLine()));
                persona.IMC(persona.getPeso(),persona.getEstatura());
	}


}

