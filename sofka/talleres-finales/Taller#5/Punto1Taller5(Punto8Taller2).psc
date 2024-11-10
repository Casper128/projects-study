//SubProceso1
SubProceso registrar(pedido,sabor,a,b,c,d,e,f,cantidad,decoracion)
	Limpiar Pantalla;
	Escribir "Tome su pedido: Digite el nombre del cliente";	
	Leer Pedido;
	Escribir "Que sabor desea en el pedido?";
	Escribir "Mango";
	Escribir "Fresa";
	Escribir "Cereza";
	Leer sabor;
	si sabor == a Entonces
		d<-1;
	FinSi
	si sabor == b Entonces
		e<-1;
	FinSi
	si sabor == c Entonces
		f<-1;
	FinSi
	Escribir "Que cantidad de porciones desea?";
	Escribir "4";
	Escribir "12";
	Escribir "18";
	Leer cantidad;
	Escribir "Que decoracion desea en el pedido?";
	Escribir "Mickye mouse";
	Escribir "Karol G";
	Escribir "Dora La exploradora";
	Leer decoracion;
	
FinSubProceso
//SubProceso2
SubProceso disponibilidad(d,a,e,f,c)
	Escribir "Tortas Disponibles";
	si d == 0 Entonces
		Escribir "Torta de ",a," : Disponible";
	SiNo
		Escribir "Torta de ",a," : NO Disponible";
	FinSi
	si e == 0 Entonces
		Escribir "Torta de ",b," : Disponible";
	SiNo
		Escribir "Torta de ",b," : NO Disponible";
	FinSi
	si f == 0 Entonces
		Escribir "Torta de ",c," : Disponible";
	SiNo
		Escribir "Torta de ",c," : NO Disponible";
	FinSi
	
	
	
	
FinSubProceso
//SubProceso3
SubProceso ventas()
	
FinSubProceso


Proceso Punto8Taller2
	//El pastelero Don Carlos es el mejor pastelero de la ciudad y 
	//requiere una aplicación que le permita registrar los pedidos 
	//de los clientes en cuanto a las tortas que realiza. Cada torta 
	//tiene unas características propias como sabor, cantidad (porciones) y decoraciones). 
	//Se requiere que la aplicación permita registrar los pedidos, las tortas disponibles y 
	//las ventas que se registren diariamente.

	Definir opcion Como Entero;
	Definir opcion2 Como Entero;
	Definir pedido Como Caracter;
	Definir sabor Como Caracter;
	Definir cantidad Como Entero;
	Definir decoracion Como Caracter;
	Definir a Como Caracter;
	Definir b Como Caracter;
	Definir c Como Caracter;
	Definir d Como Entero;
	Definir e Como Entero;
	Definir f Como Entero;
	
	a<-"Mango";
	b<-"Fresa";
	c<-"Cereza";
	d<-1;
	e<-0;
	f<-1;

	Escribir "Bievenidos Pasteleria Don Carlos, elija una opcion";
	Escribir "1. Registrar pedido";
	Escribir "2. Tortas Disponibles";
	Escribir "3. Registro de ventas";
	
	Leer opcion;
	
	si opcion == 1 Entonces
		registrar(pedido,sabor,a,b,c,d,e,f,cantidad,decoracion);
		FinSi
		si opcion==2 Entonces
			disponibilidad(d,a,e,f,c);
		FinSi
		si opcion==3 Entonces
			Escribir "Ningun Registro de ventas";
		Sino
		si opcion==3 | opcion==1 Entonces
			Escribir "Registros de ventas";
		FinSi
	si opcion ==1  Entonces
		Escribir "Pedido: ",Pedido,",Torta de sabor:  ",sabor,", Porciones: ",cantidad,", Decoracion: ",decoracion;		
	FinSi
	si opcion == 1 Entonces
		Escribir "Tortas Disponibles";
		si d == 0 Entonces
			Escribir "Torta de ",a," : Disponible";
		SiNo
			Escribir "Torta de ",a," : NO Disponible";
		FinSi
		si e == 0 Entonces
			Escribir "Torta de ",b," : Disponible";
		SiNo
			Escribir "Torta de ",b," : NO Disponible";
		FinSi
		si f == 0 Entonces
			Escribir "Torta de ",c," : Disponible";
		SiNo
			Escribir "Torta de ",c," : NO Disponible";
		FinSi
	FinSi

FinSi

FinProceso