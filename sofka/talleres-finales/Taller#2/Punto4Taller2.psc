Proceso sin_titulo
	//La video tienda que presta sus servicios de alquiler de películas a los usuarios del barrio el Porvenir, 
	//requiere de una aplicación que permita registrar el alquiler de las películas que adquieren sus usuarios. 
	//Para cada usuario se debe permitir la opción de alquilar película, consultar películas disponibles y 
	//recibir película en la video tienda con la opción de realizar anotaciones sobre estas si se llegan 
	//a presentar daños u otra novedad sobre la película.
	Definir DoctorStrange Como Logico;
	Definir JurassicPark Como Logico;
	Definir TopGun Como Logico;
	Definir Anotacion1 Como Caracter;
	Definir Anotacion2 Como Caracter;
	Definir Anotacion3 Como Caracter;
	Anotacion1<-"Sin novedad";
	Anotacion2<-"Sin novedad";
	Anotacion3<-"Sin novedad";
	DoctorStrange<-Verdadero;
	JurassicPark<-Falso;
	TopGun<-Verdadero;
	
	Definir opcion Como Entero;
	Escribir"Elija una opción";
	Escribir"1. Peliculas Disponibles";
	Escribir"2. Alquilar Peliculas";
	Escribir"3. Realizar Entregas";
	Escribir"4. Salir del sistema";
	Leer opcion;
	Segun opcion Hacer
		1:
			Escribir"Peliculas disponibles:";
			Si DoctorStrange = Verdadero Entonces
				Escribir"1.Doctor Strange: Disponible ";
			SiNo
				Escribir"1.Doctor Strange: Alquilada ";
			FinSi
			
			Si JurassicPark = Verdadero Entonces
				Escribir"2.JurassicPark: Disponible ";
			SiNo
				Escribir"2.JurassicPark: Alquilada ";
			FinSi
			
			Si TopGun = Verdadero Entonces
				Escribir"3.Top Gun: Disponible ";
			SiNo
				Escribir"3.Top Gun: Alquilada ";
			FinSi
		2:Escribir"Alquilar disponibles:";
			Definir x Como Entero;
				Si DoctorStrange = Verdadero Entonces
					Escribir"1.Doctor Strange: Disponible ";
					Escribir "Desea alquilarla: ";
					Escribir "1.Si";
					Escribir "2.No";
					Leer x;
					Si x==1 Entonces
						DoctorStrange <- Falso;
					
					SiNo
						Escribir"1.Doctor Strange: Alquilada ";
					FinSi
				FinSi
					
				Si JurassicPark = Verdadero Entonces
						Escribir"1.JurassicPark: Disponible ";
						Escribir "Desea alquilarla: ";
						Escribir "1.Si";
						Escribir "2.No";
						Leer x;
						Si x==1 Entonces
							JurassicPark <- Falso;
						
				SiNo
						Escribir"1.Jurassic Park: Alquilada ";
					FinSi
				FinSi
				Si TopGun = Verdadero Entonces
						Escribir"1.TopGun : Disponible ";
						Escribir "Desea alquilarla: ";
						Escribir "1.Si";
						Escribir "2.No";
						Leer x;
					Si x==1 Entonces
							TopGun <- Falso;
						
						SiNo
							Escribir"1.TopGun : Alquilada ";
						FinSi
					FinSi
			3: 	Definir x Como Entero;
				Si DoctorStrange = Verdadero Entonces
					Escribir"1.Doctor Strange: Disponible ";
					SiNo
						Escribir"1.Doctor Strange: Alquilada ";
						Escribir "Desea Entregarla: ";
						Escribir "1.Si";
						Escribir "2.No";
						Leer x;
						Si x==1 Entonces
							DoctorStrange <- Verdadero;
							Escribir "Alguna Observacion:";
							Leer Anotacion1;
						FinSi
				FinSi
				
				Si JurassicPark = Verdadero Entonces
					Escribir"1.JurassicPark: Disponible ";
					SiNo
						Escribir"1.Jurassic Park: Alquilada ";
						Escribir "Desea Entregarla: ";
						Escribir "1.Si";
						Escribir "2.No";
						Leer x;
						Si x==1 Entonces
							JurassicPark <- Verdadero;
							Escribir "Alguna Observacion:";
							Leer Anotacion2;
					FinSi
				FinSi
				Si TopGun = Verdadero Entonces
					Escribir"1.TopGun : Disponible ";
					
					SiNo
						Escribir"1.TopGun : Alquilada ";
						Escribir "Desea Entregarla: ";
						Escribir "1.Si";
						Escribir "2.No";
						Leer x;
						Si x==1 Entonces
							TopGun <- Verdadero;
							Escribir "Alguna Observacion:";
							Leer Anotacion3;
					FinSi
				FinSi
			4: 		
			Escribir"Hasta luego";
		De Otro Modo:
		Escribir"La opción elegida no existe";
		
FinSegun

	Escribir"Peliculas disponibles:";
	Si DoctorStrange = Verdadero Entonces
		Escribir"1.Doctor Strange: Disponible ",Anotacion1;
	SiNo
		Escribir"1.Doctor Strange: Alquilada ",Anotacion1;
	FinSi
	
	Si JurassicPark = Verdadero Entonces
		Escribir"2.JurassicPark: Disponible ",Anotacion2;
	SiNo
		Escribir"2.JurassicPark: Alquilada ",Anotacion2;
	FinSi
	
	Si TopGun = Verdadero Entonces
		Escribir"3.Top Gun: Disponible ",Anotacion3;
	SiNo
		Escribir"3.Top Gun: Alquilada ",Anotacion3;
	FinSi
FinProceso

