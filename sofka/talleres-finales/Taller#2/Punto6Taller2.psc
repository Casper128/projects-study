Proceso Punto6Taller2
	//6.El taller de motos "El Maquinista" recibe motocicletas de alto cilindraje para realizar las respectivas revisiones 
	//y requiere una aplicación que le permita registrar los servicios generados a sus clientes. 
	//Para cada motocicleta se debe tener registro del ingreso al taller y las observaciones por parte del cliente. 
	//También debe existir registro de salida del taller con las novedades y otra de arreglos hechos 
	//por el mecánico en caso de que se requiera inventariar cambios repuestos en la motocicleta al entregarla.
	
	Definir ingreso Como Caracter;
	Definir motocicleta Como Caracter;
	Definir observaciones Como Caracter;
	Definir salida Como Caracter;
	Definir reparacion Como Caracter;
	Definir opcion Como Entero;
	Definir producto Como Caracter;
	Definir obsCambios Como Caracter;
	Escribir "Bievenido a El taller de motos El Maquinista, por favor eligir una opcion";
	Escribir "1. Registrar ingreso de la motocicleta";
	Escribir "2. Registrar salida de la motocicleta";
	Escribir "3. Registrar que se le reparo a la motocicleta";
	
	Leer opcion;
	Escribir "Referencia de la motocicleta que ingresa: ";
	Leer motocicleta;
	Segun opcion Hacer
		1:
			Escribir "Fecha de ingreso de la motocicleta dd/mm/aaaa";
			Leer ingreso;
			Escribir "Ingresar observaciones del ingreso de la motocicleta";
			Leer observaciones;
			Escribir "La ",motocicleta," Ingreso: ",ingreso," Observaciones: ",observaciones;
		2:
			Escribir "Fecha de salida de la motocicleta dd/mm/aaaa";
			Leer salida;
			Escribir "Ingresar observaciones de la salida de la motocicleta";
			Leer observaciones;
			Escribir "La ",motocicleta," salio: ",salida," Observaciones: ",observaciones;
			
		3:
			Escribir "Ingresar observaciones de la reparacion de la motocicleta";
			Leer observaciones;
			Escribir "La ",motocicleta," se le reparo: ",observaciones;
	FinSegun
	
	Escribir "Hasta pronto, gracias visitarnos";
	
	
FinProceso
