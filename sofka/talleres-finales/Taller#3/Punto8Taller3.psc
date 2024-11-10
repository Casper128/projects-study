Proceso sin_titulo
	//8.La escuela automovilística "El Maestro" requiere una aplicación que permita registrar 
	//a sus Clientes en los cursos de enseñanza automovilística y establecer quienes lo han aprobado 
	//para continuar con el trámite de adquirir la licencia de conducción. Para cada usuario se debe
	//permitir registrar su ingreso al curso, consultar usuarios que hayan presentado el curso y resultados de la prueba del curso (si fueron aprobados o no). 
	
	//Recuerde que el sistema debe terminar cuando el usuario así lo indique. 
	//Tenga presente que la escuela tiene capacidad máxima de gestionar 8 usuarios en su totalidad.
	
	//Cliente1
	Definir nom1 Como Caracter;
	Definir puntuacion1 Como Entero;
	Definir ingre1 como Logico;
	//Cliente2
	Definir nom2 Como Caracter;
	Definir puntuacion2 Como Entero;
	Definir ingre2 como Logico;
	//Cliente3
	Definir nom3 Como Caracter;
	Definir puntuacion3 Como Entero;
	Definir ingre3 como Logico;
	//Cliente4
	Definir nom4 Como Caracter;
	Definir puntuacion4 Como Entero;
	Definir ingre4 como Logico;
	//Cliente5
	Definir nom5 Como Caracter;
	Definir puntuacion5 Como Entero;
	Definir ingre5 como Logico;
	//Cliente5
	Definir nom6 Como Caracter;
	Definir puntuacion6 Como Entero;
	Definir ingre6 como Logico;	
	//Cliente7
	Definir nom7 Como Caracter;
	Definir puntuacion7 Como Entero;
	Definir ingre7 como Logico;
	//Cliente8
	Definir nom8 Como Caracter;
	Definir puntuacion8 Como Entero;
	Definir ingre8 como Logico;
	
	//Genericos
	Definir buscar,resultado Como Caracter;
	Definir opcion Como Entero;
	
	//Inicializacion de variables
	nom1<-"";
	puntuacion1<-0;
	ingre1<-Falso;
	nom2<-"";
	puntuacion2<-0;
	ingre2<-Falso;
	nom3<-"";
	puntuacion3<-0;
	ingre3<-Falso;
	nom4<-"";
	puntuacion4<-0;
	ingre4<-Falso;
	nom5<-"";
	puntuacion5<-0;
	ingre5<-Falso;
	nom6<-"";
	puntuacion6<-0;
	ingre6<-Falso;
	nom7<-"";
	puntuacion7<-0;
	ingre7<-Falso;
	nom8<-"";
	puntuacion8<-0;
	ingre8<-Falso;
	
	
	Repetir
		Escribir "Bienvenido a la escuela automovilística El Maestro ";
		Escribir "1. Registrar en curso de conduccion : ";
		Escribir "2. Consultar usuarios del curso : ";
		Escribir "3. Consultar resultados por usuario :";
		Escribir "0. Salir del sistema";
		Escribir "Digite la opcion que desea:";
		Leer opcion;
		
		Segun opcion hacer	
			1: Escribir "Por favor Digite su nombre: ";
				si ingre1==Falso Entonces
					Leer nom1;
					Escribir "Por favor Digite la puntuacion de (0 a 10) : ";
					Leer puntuacion1;
					ingre1<-Verdadero;
				SiNo
					si ingre2==Falso Entonces
						Leer nom2;
						Escribir "Por favor Digite la puntuacion de (0 a 10) : ";
						Leer puntuacion2;	
						ingre2<-Verdadero;
					SiNo
						si ingre3==Falso Entonces
							Leer nom3;
							Escribir "Por favor Digite la puntuacion de (0 a 10) : ";
							Leer puntuacion3;	
							ingre3<-Verdadero;
						Sino
							si ingre4==Falso Entonces
								Leer nom4;
								Escribir "Por favor Digite la puntuacion de (0 a 10) : ";
								Leer puntuacion4;									
								ingre4<-Verdadero;
							Sino 
								si ingre5==Falso Entonces
									Leer nom5;
									Escribir "Por favor Digite la puntuacion de (0 a 10) : ";
									Leer puntuacion5;	
									ingre5<-Verdadero;
								Sino 
									si ingre6==Falso Entonces
										Leer nom6;
										Escribir "Por favor Digite la puntuacion de (0 a 10) : ";
										Leer puntuacion6;	
										ingre6<-Verdadero;
									Sino 
										si ingre7==Falso Entonces
											Leer nom7;
											Escribir "Por favor Digite la puntuacion de (0 a 10) : ";
											Leer puntuacion7;	
											ingre7<-Verdadero;
										Sino 
											si ingre8==Falso Entonces
												Leer nom8;
												Escribir "Por favor Digite la puntuacion de (0 a 10) : ";
												Leer puntuacion8;	
												ingre8<-Verdadero;
											Sino
												Limpiar Pantalla;
												Escribir "La escuela esta llena";
											FinSi
										FinSi
									FinSi
								FinSi
							FinSi
						FinSi
					FinSi
				FinSi
				
				Escribir "Nom 1= ",nom1,"| Nom 2= ",nom2," | nom3= ",nom3," | nom4= ",nom4," | nom5= ",nom5;
				Escribir "ingre1= ",ingre1," | ingre2= ",ingre2,"  | ingre3= ",ingre3,"  | ingre4= ",ingre4,"  | ingre5= ",ingre5;
				
			2: Escribir "Usuarios que han realizado el curso y su puntuacion: ";
				si ingre1==verdadero Entonces
					Escribir "Nombre Cliente 1: ",nom1," Realizo el curso";
				FinSi
				si ingre2==verdadero Entonces
					Escribir "Nombre Cliente 2: ",nom2," Realizo el curso";
				FinSi
				si ingre3==verdadero Entonces
					Escribir "Nombre Cliente 3: ",nom3," Realizo el curso";
				FinSi
				si ingre4==verdadero Entonces
					Escribir "Nombre Cliente 4: ",nom4," Realizo el curso";
				FinSi
				si ingre5==verdadero Entonces
					Escribir "Nombre Cliente 5: ",nom5," Realizo el curso";
				FinSi
				si ingre6==verdadero Entonces
					Escribir "Nombre Cliente 6: ",nom6," Realizo el curso";
				FinSi
				si ingre7==verdadero Entonces
					Escribir "Nombre Cliente 7: ",nom7," Realizo el curso";
				FinSi
				si ingre8==verdadero Entonces
					Escribir "Nombre Cliente 8: ",nom8," Realizo el curso";
				FinSi				
			3: Escribir "Digite el Cliente que desea consultar";
				Leer buscar;
				si nom1==buscar Entonces
					si puntuacion1>= 8 Entonces 
						resultado<-"Aprobo";
						Escribir "Usuario buscado con Nombre: ",nom1," Resultado: ",resultado;
					SiNo 
						resultado<-"Reprobo";
						Escribir "Usuario buscado con Nombre: ",nom1," Resultado: ",resultado;
					FinSi
					Finsi
					si nom2==buscar Entonces
						si puntuacion2>= 8 Entonces 
							resultado<-"Aprobo";
							Escribir "Usuario buscado con Nombre: ",nom1," Resultado: ",resultado;
						SiNo 
							resultado<-"Reprobo";
							Escribir "Usuario buscado con Nombre: ",nom2," Resultado: ",resultado;
						FinSi
					FinSi
					
						si nom3==buscar Entonces
							si puntuacion3>= 8 Entonces 
								resultado<-"Aprobo";
								Escribir "Usuario buscado con Nombre: ",nom1," Resultado: ",resultado;
							SiNo 
								resultado<-"Reprobo";
								Escribir "Usuario buscado con Nombre: ",nom3," Resultado: ",resultado;
							FinSi
							Finsi
							si nom4==buscar Entonces
								si puntuacion4>= 8 Entonces 
									resultado<-"Aprobo";
									Escribir "Usuario buscado con Nombre: ",nom1," Resultado: ",resultado;
								SiNo 
									resultado<-"Reprobo";
									Escribir "Usuario buscado con Nombre: ",nom4," Resultado: ",resultado;
								FinSi
							FinSi
							
								si nom5==buscar Entonces
									si puntuacion5>= 8 Entonces 
										resultado<-"Aprobo";
										Escribir "Usuario buscado con Nombre: ",nom1," Resultado: ",resultado;
									SiNo 
										resultado<-"Reprobo";
										Escribir "Usuario buscado con Nombre: ",nom5," Resultado: ",resultado;
									FinSi
								FinSi
								
									si nom6==buscar Entonces
										si puntuacion6>= 8 Entonces 
											resultado<-"Aprobo";
											Escribir "Usuario buscado con Nombre: ",nom1," Resultado: ",resultado;
										SiNo 
											resultado<-"Reprobo";
											Escribir "Usuario buscado con Nombre: ",nom6," Resultado: ",resultado;
										FinSi
										FinSi
										si nom7==buscar Entonces
											si puntuacion7>= 8 Entonces 
												resultado<-"Aprobo";
												Escribir "Usuario buscado con Nombre: ",nom1," Resultado: ",resultado;
											SiNo 
												resultado<-"Reprobo";
												Escribir "Usuario buscado con Nombre: ",nom7," Resultado: ",resultado;
											FinSi
											FinSi
											si nom8==buscar Entonces
												si puntuacion8>= 8 Entonces 
													resultado<-"Aprobo";
													Escribir "Usuario buscado con Nombre: ",nom1," Resultado: ",resultado;
												SiNo 
													resultado<-"Reprobo";
													Escribir "Usuario buscado con Nombre: ",nom8," Resultado: ",resultado;
												FinSi
											FinSi
											
										FinSegun
										
				Hasta Que opcion==0	
									
									
									Escribir "Hasta pronto";
									
									
FinProceso