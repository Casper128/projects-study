Proceso Punto2Taller4
	//2.Crear un arreglo de números enteros de 20 posiciones, el cual,
	//debe ser llenado con números aleatorios entre 1 y 100; 
	//después de haber llenado dicho arreglo, se debe volver a recorrer utilizando un ciclo diferente al que se usó para llenarse 
	//e imprimir los números pares e impares. Ejemplo
	//Números pares: 2, 4, 6, 8, 10
	//Números impares: 1, 3, 5, 7, 9
	Definir matriz Como Entero;
	Definir i,j Como Entero;
	Definir numero_aleatorio como Entero;
	Dimension matriz[20];
	i<-0;
	Para i<-0 Hasta 19 Con paso 1 Hacer
		numero_aleatorio <- AZAR(100);
		matriz[i]<-numero_aleatorio;
	FinPara
	i<-0;
	j<-0;

		Escribir "Numeros pares: " Sin Saltar;
		Mientras j<=19 Hacer
			Si matriz[j] mod 2=0 Entonces
				Escribir ",",matriz[j]Sin Saltar;
			FinSi
		j<-j+1;
		FinMientras
		j<-0;
		Escribir " ";
		Escribir "Numeros Impares: " Sin Saltar;
	Mientras j<=19 hacer
		Si matriz[j] mod 2<>0 Entonces
		Escribir ",",matriz[j], Sin Saltar;
	FinSi
	j<-j+1;
	FinMientras
FinProceso
