Proceso Punto3Taller4
	//3.	Imprimir los números primos del 1 al 1000, el resultado debe ser buscado de forma matemática.
	Definir i,j,k Como Entero;
	Definir matriz Como Entero;
	Dimension matriz[170];
	i<-0;
	j<-0;
	k<-0;
		
		Para i<-1 Hasta 1000 Hacer
			
			Para j<-1 Hasta 1000 Hacer
				si i mod j = 0    Entonces
					k<-k+1;
				FinSi
				
			FinPara
			Escribir ",",j;
    FinPara
FinProceso
	

