SubProceso imprimir ( i,matriz )
	Para i<-0 Hasta 4 Con paso 1 Hacer
		Escribir "[",i,"] =",matriz[i];
	FinPara
FinSubProceso



Proceso Punto1Taller4
	//1.Crear un vector de tipo Entero con 5 posiciones, llenarlo con informaci�n solicitada al usuario. 
	//Despu�s de recoger toda la informaci�n, se requiere imprimir el �ndice de cada posici�n en el arreglo con su valor de la siguiente manera:
	//	[0] = 55
	//	[1] = 99
	//  [2] = 11
	//  [3] = 56
	//  [4] = 69
	
	Definir matriz,i como Entero;
	i<-0;
	Dimension matriz[5];
	matriz[0] <-55;
	matriz[1] <-99;
	matriz[2] <-11;
	matriz[3] <-56;
	matriz[4] <-69;
	imprimir( i,matriz );

FinProceso
