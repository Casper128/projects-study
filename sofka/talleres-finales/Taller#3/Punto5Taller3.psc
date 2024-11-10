Proceso Punto5Taller2
	//5.	Utilizando el ciclo que usted desee, crear un menú de ejecución infinita hasta que el usuario desee terminar dicho ciclo.
	Definir nombre Como Caracter;
	Definir opcion Como Entero;

	
	Repetir
		Escribir "Menu Usuario";
		Escribir "1. Captura nombre";
		Escribir "2. Saludar Persona";
		Escribir "3. Salir del sistema";
		Escribir "Digite la opcion que desea:";
		Leer opcion;
		
		Segun opcion hacer	
			1: Escribir "Por favor digite su nombre: ";
				Leer nombre;
				
			2: Limpiar Pantalla;
				Escribir "Hola como estas, ",nombre;
		FinSegun
	Hasta Que opcion==3	


	Escribir "Hasta pronto";
	
FinProceso
