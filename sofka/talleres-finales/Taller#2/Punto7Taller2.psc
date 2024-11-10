Proceso Punto7Taller2
	//7.La Secretaría de Salud Municipal requiere de una aplicación que le permita calcular el IMC (Índice de masa corporal) 
	//y requiere los datos peso en kilogramos y estatura en metros Para cada persona encuestada adicional a los datos suministrados, 
	//debe mostrar el resultado para cada uno y establecer en qué rango se encuentra (bajo peso, normal, sobrepeso y obeso).
	
	Definir IMC Como Real;
	Definir Peso Como Real;
	Definir Estatura Como Real;
	Escribir "Bievenido a La Secretaría de Salud Municipal, por favor Ingrese los siguientes datos";
	Escribir "1. Por favor ingrese el peso en kilogramos";
	Leer Peso;
	Escribir "2. Por favor ingrese la estatura en metros";
	Leer Estatura;
	IMC<-Peso/(Estatura*Estatura);
	Si IMC <16 Entonces
		Escribir "Su indice de masa corporal es: ",IMC," Se encuentra en BAJO peso";
	FinSi
	Si IMC >= 16 y IMC <18 Entonces
		Escribir "Su indice de masa corporal es: ",IMC," Se encuentra en un peso NORMAL";
	FinSi
	Si IMC >=18 y IMC <20 Entonces
		Escribir "Su indice de masa corporal es: ",IMC," Se encuentra en un peso sobrepeso";
	FinSi
	Si IMC >=20 Entonces
		Escribir "Su indice de masa corporal es: ",IMC," Se encuentra en un peso obeso";
	FinSi
FinProceso
