Proceso sin_titulo
	Definir matriz Como Entero;
	Definir i,j,result Como Entero;
	Dimension matriz[10,10];
	result<-0;
	
	Escribir "Original";

	Para i<-0 Hasta 9 Hacer
		Escribir " ";	
		Para j<-0 Hasta 9 con paso 1 Hacer
			result<-(i+1)*(j+1);
			matriz[j,i]<-result;
			Escribir (j+1)," X ",(i+1)," = ",result," |     " Sin Saltar;
			
		FinPara
	FinPara
	
	Escribir "Desea conocer el valor de algun campo";
	Escribir "Digite la columna  ";
	Leer i;
	Escribir "Digite la fila";
	Leer j;
	
			Escribir "El resultado es: " ,matriz[i-1,j-1] Sin Saltar;
			
	
	
FinProceso
