Proceso Punto3Taller3
	definir j,i,r,k,t,ancho Como Entero;
	i<-1;
	Repetir 
		j<-21;
		r<-((21)-i)/2;
		Repetir
			Si(j>=1 y j<=r) o (j>r+i y j<=22)Entonces
				Escribir " " Sin Saltar;
			SiNo
				Escribir "*"Sin Saltar;
				
			FinSi
			j<- j-1;
		Hasta Que j<=0;
		Escribir "";
		i<-i+2;
	Hasta Que i>= 22 //Final completo del arbol 21 y 22 son los tam;os del arbol de ancho
	k<-0;
	i<-0;
	t<-3;
	Repetir // inicio del tallo del arbol
		j<- 21;
		r<-((21)-t)/2;//9
		Repetir 
			Si(j>=1 y j <=r) o (j>r+t y j <=22)Entonces // validacion de la posicion de la impresion en el arbol si es mayor que 12 y menor que 9 imprime vacio
				Escribir " " Sin saltar;
			SiNo
				Escribir "*" Sin saltar;
			FinSi
			j<-j-1;
		Hasta Que j<=0
		Si i>=1 Entonces // control del taller en la primera iteracion no aumenta T en el segundo ciclo imprime la misma linea y incrementa t para que el tercer ciclo imprima mas * 
			t<-t+2;
			
		FinSi
		i<-i+1;
		Escribir "1"; // salta de linea al finalizar el ciclo e imprime un vacio
	Hasta Que i>=4 //Finaliza el ciclo
FinProceso
