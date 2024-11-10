
SubProceso arreglada(i,j,matriz )
	Para i<-0 Hasta 3 Hacer
		
		si i==3 | i==1 Entonces
			Escribir "";	
			Para j<-4 Hasta 0 con paso -1 Hacer
				Escribir  matriz[i,j]," " Sin Saltar;
				
			FinPara
		SiNo
			Escribir "";	
			Para j<-0 Hasta 4 Hacer
				Escribir  matriz[i,j]," " Sin Saltar;
				
			FinPara
		FinSi
	FinPara
FinSubProceso

SubProceso imprimirMatriz (i,j,matriz )
	Para i<-0 Hasta 3 Hacer
		Escribir "";	
		Para j<-0 Hasta 4 con paso 1 Hacer
			Escribir  matriz[i,j]," " Sin Saltar;
		FinPara
	FinPara
FinSubProceso



Proceso sin_titulo
	Definir matriz Como Caracter;
	Definir i,j Como Entero;
	i<-0;
	j<-0;
	Dimension matriz[4,5];
	
	matriz[0,0]<-"01";
	matriz[0,1]<-"02";
	matriz[0,2]<-"03";
	matriz[0,3]<-"04";
	matriz[0,4]<-"05";
	matriz[1,0]<-"06";
	matriz[1,1]<-"07";
	matriz[1,2]<-"08";
	matriz[1,3]<-"09";
	matriz[1,4]<-"10";
	matriz[2,0]<-"11";
	matriz[2,1]<-"12";
	matriz[2,2]<-"13";
	matriz[2,3]<-"14";
	matriz[2,4]<-"15";
	matriz[3,0]<-"16";
	matriz[3,1]<-"17";
	matriz[3,2]<-"18";
	matriz[3,3]<-"19";
	matriz[3,4]<-"20";
	
	Escribir "Original";
	imprimirMatriz(i,j,matriz);
	Escribir"";
	
	Escribir "Final ";
	arreglada(i,j,matriz);
	
	
FinProceso
