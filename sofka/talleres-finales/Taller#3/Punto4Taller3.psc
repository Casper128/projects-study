Proceso Punto4Taller2
	//4.	Se requiere un programa que pueda crear la tabla de multiplicar del número que el usuario indique por medio del ciclo Para; 
//esta debe ser impresa del 1 al 10. Ejemplo, si el usuario indica que desea crear la tabla del 5, entonces el resultado debería ser el siguiente:
		Definir i,j Como Entero;
		Definir num como Entero;
		Definir operacion Como Entero;
		num<-0;
		i <- 10;
		j <- 1;
		Escribir "Ingrese el numero que desea multiplicar :";
		Leer num;
		Mientras i>=1 Hacer
			
			si i==num Entonces
				
				Mientras j<=10 hacer
					
					operacion<-j*i;
					Escribir j," * ",i," =",operacion ;
					
					j<-j+1;
				FinMientras
			FinSi
			i<-i-1;
			FinMientras
FinProceso

