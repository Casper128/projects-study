Proceso Punto7Taller2
	//7.El parqueadero "El guardián" presta sus servicios de parqueadero nocturno para los usuarios del barrio y 
	//requiere una aplicación que permita registrar los vehículos que se cuidan en estas instalaciones. 
	//Se sugiere que el parqueadero tenga los atributos del vehículo como son, placa y marca, y los datos del cliente.
	//como son nombre completo y número de teléfono. //
	//Para cada vehículo se debe permitir la opción de ingresar al parqueadero, 
	//retirar del parqueadero y consultar si un vehículo se encuentra en el parqueadero. 
	//Recuerde que el sistema debe terminar cuando el usuario así lo indique. //
	//Tenga en presente que el parqueadero solo puede almacenar máximo 5 vehículos.//
	
	//Vehiculo1
	Definir placa1,marca1,nom1,tel1 Como Caracter;
	//Vehiculo2
	Definir placa2,marca2,nom2,tel2 Como Caracter;
	//Vehiculo3
	Definir placa3,marca3,nom3,tel3 Como Caracter;
	//Vehiculo4
	Definir placa4,marca4,nom4,tel4 Como Caracter;
	//Vehiculo5
	Definir placa5,marca5,nom5,tel5 Como Caracter;
	
	//Genericos
	Definir buscar, telDigitado, elimin Como Caracter;
	Definir opcion Como Entero;
	
	//Inicializacion de variables
	nom1<-"";
	tel1<-"";
	placa1<-"";
	marca1<-"";
	nom2<-"";
	tel2<-"";
	placa2<-"";
	marca2<-"";
	nom3<-"";
	tel3<-"";
	placa3<-"";
	marca3<-"";
	nom4<-"";
	tel4<-"";
	placa4<-"";
	marca4<-"";
	nom5<-"";
	tel5<-"";
	placa5<-"";
	marca5<-"";
	
	Repetir
		Escribir "Menu Usuario";
		Escribir "1. Ingresar vehiculo al parqueadero : ";
		Escribir "2. Buscar contacto: ";
		Escribir "3. Retirar vehiculo al parqueadero :";
		Escribir "0. Salir del sistema";
		Escribir "Digite la opcion que desea:";
		Leer opcion;
		
		Segun opcion hacer	
			1: Escribir "Por favor Digite su nombre: ";
				si placa1=="" Entonces
					Leer nom1;
					Escribir "Por favor digite el telefono: ";
					Leer tel1;
					Escribir "Por favor Digite la placa: ";
					Leer placa1;
					Escribir "Por favor Digite la marca del vehiculo: ";
					Leer marca1;
				SiNo
					si placa2=="" Entonces
						Leer nom2;
						Escribir "Por favor digite el telefono: ";
						Leer tel2;
						Escribir "Por favor Digite la placa: ";
						Leer placa2;
						Escribir "Por favor Digite la marca del vehiculo: ";
						Leer marca2;
					SiNo
						si placa3=="" Entonces
							Leer nom3;
							Escribir "Por favor digite el telefono: ";
							Leer tel3;
							Escribir "Por favor Digite la placa: ";
							Leer placa3;
							Escribir "Por favor Digite la marca del vehiculo: ";
							Leer marca3;
						Sino
							si placa4=="" Entonces
								Leer nom4;
								Escribir "Por favor digite el telefono: ";
								Leer tel4;
								Escribir "Por favor Digite la placa: ";
								Leer placa4;
								Escribir "Por favor Digite la marca del vehiculo: ";
								Leer marca4;
							Sino 
								si placa5=="" Entonces
									Leer nom5;
									Escribir "Por favor digite el telefono: ";
									Leer tel5;
									Escribir "Por favor Digite la placa: ";
									Leer placa5;
									Escribir "Por favor Digite la marca del vehiculo: ";
									Leer marca5;
								Sino
									Limpiar Pantalla;
									Escribir "El parqueadero esta lleno";
								FinSi
							FinSi
						FinSi
					FinSi
				FinSi
				
				
				Escribir "Nom 1= ",nom1,"| Nom 2= ",nom2," | nom3= ",nom3," | nom4= ",nom4," | nom5= ",nom5;
				Escribir "Tel1= ",tel1," | Tel2= ",tel2,"  | tel3= ",tel3,"  | tel4= ",tel4,"  | tel5= ",tel5;
				Escribir "placa1= ",placa1," | placa2= ",placa2,"  | placa3= ",placa3,"  | placa4= ",placa4,"  | placa5= ",placa5;
				Escribir "Marca1= ",marca1," | Marca2= ",marca2,"  | Marca3= ",marca3,"  | Marca4= ",marca4,"  | Marca5= ",marca5;
			2: Escribir "Por favor Digite la placa del vehiculo que busca: ";
				Leer buscar;
				si placa1==buscar Entonces
					Escribir"El vehiculo buscado esta en el parqueadero: ";
					Escribir "Nombre cliente: ",nom1," Telefono: ",tel1," placa: ",placa1," marca:  ",marca1;
				SiNo					
					si placa2==buscar Entonces
						Escribir"El vehiculo buscado esta en el parqueadero: ";
						Escribir "Nombre Cliente: ",nom2," Telefono: ",tel2," placa: ",placa2," marca:  ",marca2;
					SiNo
						si placa3==buscar Entonces
							Escribir"El vehiculo buscado esta en el parqueadero: ";
							Escribir "Nombre Cliente: ",nom3," Telefono: ",tel3," placa: ",placa3," marca:  ",marca3;
						SiNo
							si placa4==buscar Entonces
								Escribir"El vehiculo buscado esta en el parqueadero: ";
								Escribir "Nombre Cliente: ",nom4," Telefono: ",tel4," placa: ",placa4," marca:  ",marca4;
							SiNo
								si placa5==buscar Entonces
									Escribir"El vehiculo buscado esta en el parqueadero: ";
									Escribir "Nombre Cliente: ",nom5," Telefono: ",tel5," placa: ",placa5," marca:  ",marca5;
								SiNo
									Escribir "El contacto que busca no existe";
								FinSi
							FinSi
						FinSi
					FinSi
				FinSi
			3: Escribir "Digite la placa del vehiculo que desea retirar";
				Leer elimin;
				si placa1==elimin Entonces
					nom1<-"";
					tel1<-"";
					placa1<-"";
					marca1<-"";
					Escribir "El contacto eliminado: ",elimin," fue eliminado correctamente";
				FinSi
				si	placa2==elimin Entonces
					nom2<-"";
					tel2<-"";
					placa2<-"";
					marca2<-"";
					Escribir "El contacto eliminado: ",elimin," fue eliminado correctamente";
				FinSi
				si	placa3==elimin Entonces
					nom3<-"";
					tel3<-"";
					placa3<-"";
					marca3<-"";
					Escribir "El contacto eliminado: ",elimin," fue eliminado correctamente";
				FinSi
				si	placa4==elimin Entonces
					nom4<-"";
					tel4<-"";
					placa4<-"";
					marca4<-"";
					Escribir "El contacto eliminado: ",elimin," fue eliminado correctamente";
				FinSi
				si	placa5==elimin Entonces
					nom5<-"";
					tel5<-"";
					placa5<-"";
					marca5<-"";
					Escribir "El contacto eliminado: ",elimin," fue eliminado correctamente";
				FinSi
				
		FinSegun
		
	Hasta Que opcion==0	
	
	
	Escribir "Hasta pronto";
	
FinProceso