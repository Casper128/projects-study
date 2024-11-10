Proceso Punto6Taller2
	
	//6.Se está creando una aplicación que va a estar conectada con un prototipo que permita almacenar contactos telefónicos en el dispositivo. 
	//Para ello cada contacto debe contener nombre completo, teléfono y organización. 
	//Se requiere que la aplicación permita añadir 3 contactos verificando que el número no esté almacenado, 
	//buscar contactos almacenados y eliminar contactos si el usuario lo requiere. 
	//Recuerde que el sistema debe terminar cuando el usuario así lo indique.
	
	//contacto 1
	Definir nom1,tel1,org1 Como Caracter;
	//Contacto 2
	Definir nom2,tel2,org2 Como Caracter;
	//Contacto 3
	Definir nom3,tel3,org3 Como Caracter;
	//Genericos
	Definir buscar, telDigitado, elimin Como Caracter;
	Definir opcion Como Entero;

	//Inicializacion de variables
	nom1<-"";
	tel1<-"";
	org1<-"";
	nom2<-"";
	tel2<-"";
	org2<-"";
	nom3<-"";
	tel3<-"";
	org3<-"";

	Repetir
		Escribir "Menu Usuario";
		Escribir "1. Agregar contacto";
		Escribir "2. Buscar contacto";
		Escribir "3.Eliminar contacto";
		Escribir "0. Salir del sistema";
		Escribir "Digite la opcion que desea:";
		Leer opcion;
		
		Segun opcion hacer	
			1: Escribir "Por favor Digite su nombre: ";
				si nom1=="" Entonces
					Leer nom1;
					Escribir "Por favor digite el telefono: ";
					Leer telDigitado;
					si tel1==telDigitado | tel2==telDigitado | tel3==telDigitado Entonces
						Escribir "ya existe un contacto con este telefono";
						nom1<-"";
						tel1<-"";
						org1<-"";	
					SiNo
						tel1<-telDigitado;
					FinSi
					si tel1==telDigitado Entonces
						Escribir "Por favor Digite la organizacion: ";
						Leer org1;
					FinSi
				SiNo
					si nom2=="" Entonces
						Leer nom2;
						Escribir "Por favor digite el telefono: ";
						Leer telDigitado;
						si tel1==telDigitado | tel2==telDigitado | tel3==telDigitado Entonces
							Escribir "ya existe un contacto con este telefono";
							nom2<-"";
							tel2<-"";
							org2<-"";
						SiNo
							tel2<-telDigitado;
						FinSi
						si tel2==telDigitado Entonces
							Escribir "Por favor Digite la organizacion: ";
							Leer org2;
						FinSi
					SiNo
						si nom3=="" Entonces
							Leer nom3;
							Escribir "Por favor digite el telefono: ";
							Leer telDigitado;
							si tel1==telDigitado | tel2==telDigitado | tel3==telDigitado Entonces
								Escribir "ya existe un contacto con este telefono";
								nom3<-"";
								tel3<-"";
								org3<-"";
							SiNo
								tel3<-telDigitado;
							FinSi
							si tel3==telDigitado Entonces
							Escribir "Por favor Digite la organizacion: ";
							Leer org3;
						FinSi
						
						Sino 
							Limpiar Pantalla;
							Escribir "Ya tiene la libreta de contactos llena ";
					FinSi
				FinSi
			FinSi
			
				Escribir "Nom 1= ",nom1,"| Nom 2= ",nom2," | nom3= ",nom3;
				Escribir "Tel1= ",tel1," | Tel2= ",tel2,"  | tel3= ",tel3;
				Escribir "org1= ",org1," | org2= ",org2,"  | org3= ",org3;
			2: Escribir "Por favor Digite el contacto que busca: ";
				Leer buscar;
				si nom1==buscar Entonces
					Escribir"El contacto buscado existe: ";
					Escribir "Nombre Contacto: ",nom1," Telefono: ',tel1," Organizacion: ",org1;
				SiNo					
					si nom2==buscar Entonces
						Escribir"El contacto buscado existe: ";
						Escribir "Nombre Contacto: ",nom2," Telefono: ',tel2," Organizacion: ",org2;
					SiNo
						si nom3==buscar Entonces
							Escribir"El contacto buscado existe: ";
							Escribir "Nombre Contacto: ",nom3," Telefono: ',tel3," Organizacion: ",org3;
						SiNo
						Escribir "El contacto que busca no existe";
					FinSi
				FinSi
			FinSi
		3: Escribir "Digite el nombre del contacto que desea eliminar";
			Leer elimin;
			si nom1==elimin Entonces
				nom1<-"";
				tel1<-"";
				org1<-"";
				Escribir "El contacto eliminado: ",elimin," fue eliminado correctamente";
			FinSi
			si	nom2==elimin Entonces
				nom2<-"";
				tel2<-"";
				org2<-"";
			Escribir "El contacto eliminado: ",elimin," fue eliminado correctamente";
		FinSi
		si	nom3==elimin Entonces
			nom3<-"";
			tel3<-"";
			org3<-"";
			Escribir "El contacto eliminado: ",elimin," fue eliminado correctamente";
		FinSi
			
	FinSegun
	
	Hasta Que opcion==0	
	
	
	Escribir "Hasta pronto";
	
	

FinProceso
