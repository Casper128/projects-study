Proceso Punto2Taller3
	//2.	Realizar la siguiente figura por medio del ciclo Mientras - Hacer
	Definir i ,j Como Entero;
	
	i <-0;
	j <- 10;
	
	Mientras i<10 Hacer
		Mientras j>1 hacer
			Si j-1>i  Entonces
				Escribir " " Sin Saltar;
			Sino 
				Escribir "*" Sin Saltar;
			FinSi
			j<-j-1;
		FinMientras
		i<-i+1;
		j<-10;
		Escribir "*";
	FinMientras
	
FinProceso
