Proceso Punto9Taller2
	//9.El profesor de geometría está explicando a sus estudiantes las fórmulas para calcular el área de diferentes figuras geométricas,
	//para ello requiere una aplicación que le facilite el ejercicio solicitándole los valores al estudiante.
	//La aplicación debe permitir que el estudiante seleccione si desea calcular el área de un rectángulo, triángulo o trapecio. 
	//No olvide solicitar los datos necesarios para realizar cada cálculo y mostrar su respectivo resultado.
	
	//Área de rectángulo = Base × Altura
	//Area de triangulo= Base × Altura/2
	//Area de trapecio= (Base1+Base2)×Altura/2
	Definir area Como Entero;
	Definir base Como Entero;
	Definir altura Como Entero;
	Definir base2 Como Entero;
	Definir opcion	 Como Entero;
	Escribir "Bienvenido a clase de geometria";
	Escribir "1. Calcular el area de un rectangulo";
	Escribir "2. Calcular el area de un triangulo";
	Escribir "3. Calcular el area de un trapecio";
	Escribir "Elija una opcion";
	Leer opcion;
	Segun opcion Hacer
		1: Escribir "El Área de rectángulo es igual a (Base × Altura) ";
			Escribir "Ingrese la base";
			Leer base;
			Escribir "Ingrese la altura";
			Leer altura;
			area<-base*altura;
			Limpiar Pantalla;
			Escribir "El area del rectangulo es: ",area,"(m2)";
		2: Escribir "El Area del triangulo= Base × Altura/2 ";
			Escribir "Ingrese la base";
			Leer base;
			Escribir "Ingrese la altura";
			Leer altura;
			area<-base*altura/2;
			Limpiar Pantalla;
			Escribir "El area del rectangulo es: ",area,"(m2)";
		3: Escribir "El Area de trapecio= (Base1+Base2)×Altura/2 ";
			Escribir "Ingrese la base 1 ";
			Leer base;
			Escribir "Ingrese la base 2 ";
			Leer base2;
			Escribir "Ingrese la altura";
			Leer altura;
			area<-((base+base2)*altura)/2;
			Limpiar Pantalla;
			Escribir "El area del rectangulo es: ",area,"(m2)";
	FinSegun
	
FinProceso
