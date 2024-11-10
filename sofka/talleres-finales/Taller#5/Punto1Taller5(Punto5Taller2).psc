SubProceso Comprar(producto)
	Escribir "Que producto deseas consultar";
	Leer producto;
	Si producto <> "" Entonces
		Escribir "Producto Disponible";
	SiNo
		Escribir "Digite el producto que busca";
	FinSi
FinSubProceso
SubProceso Consulta(producto)
	Escribir "De que producto desea saber el precio?";
	Leer producto;
	Si producto <> "" Entonces
		Escribir "El valor del ",producto," es:",200,"$";
	SiNo
		Escribir "Digite por favor el producto que desea consultar";
	FinSi
FinSubProceso
SubProceso Devolucion(producto,anotaciones)
	Escribir "Desea devolver un producto?";
	Leer producto;
	Escribir "Cual es el motivo de la devolucion";
	Definir opcion2 Como Entero;
	Escribir "1. Digite 1 si desea ingresar una observacion de la devolucion";
	Leer opcion2;
	si opcion2 == 1 Entonces
		Escribir "Explicanos la razon de la devolucion";
		Leer anotaciones;
		Escribir "El producto ",producto," se devolvio por que: ",anotaciones,".";
		Escribir "Comentarios procesados con exito";
	FinSi
FinSubProceso
Proceso Punto5Taller2
	
	//5.La Droguería Mi Salud presta sus servicios en la localidad de Suba y requiere una aplicación para poder facturar los productos 
	//que vende a sus clientes y para ello,los productos tienen unas características que deben indicársele al cliente para que pueda escoger 
	//el producto a comprar. Para cada cliente, se tienen las opciones de compra de producto, consulta de precios por producto 
	//y devoluciones en caso de que se presenten.
	//
	Definir opcion Como Entero;
	Definir producto Como Caracter;
	Definir anotaciones Como Caracter;
	producto<-"";
	anotaciones<-"";
	Escribir "Bievenido a Droguería Mi Salud , por favor eligir una opcion";
	Escribir "1. Comprar productos";
	Escribir "2. Consulta de precios por productos";
	Escribir "3. Devolucion de productos";
	
	Leer opcion;
	
	Segun opcion Hacer
		1:
			Comprar(producto);
		2:
			Consulta(producto);
		3:
			Devolucion(producto,anotaciones);
		FinSegun

		Escribir "Hasta pronto, gracias visitarnos";
FinProceso
