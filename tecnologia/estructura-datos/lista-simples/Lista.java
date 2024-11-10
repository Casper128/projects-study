
package ListaSimples;


public class Lista {

    protected Nodo inicio;//Punto para saber donde esta el inicio
    protected Nodo fin;//Puntero para saber donde esta el fin
    private int tamanio;
    private int acumulador;
    private int mayor;
    private int menor;
    public Lista() {

        this.inicio = null;
        this.fin = null;
    }

    public boolean ListaVacia() {

        if (inicio == null) {

            return true;
        } else {

            return false;
        }
    }

    public void AgregarInicioLista(int elemento) {

        this.inicio = new Nodo(elemento, inicio);//Crea el Nodo

        if (fin == null) {

            fin = inicio;
        }
        acumulador+=elemento;
        tamanio++;

    }
   public void insrtarPorPosicion(int posicion, int valor){
        // Verifica si la posición ingresada se encuentre en el rango
        // >= 0 y <= que el numero de elementos del la lista.
       
        if(posicion>=0 && posicion<=tamanio){
            Nodo nuevo = new Nodo(valor);
            // Consulta si el nuevo nodo a ingresar va al inicio de la lista.
            if(posicion == 0){
                // Inserta el nuevo nodo al inicio de la lista.
                nuevo.setSiguiente(inicio);
                inicio = nuevo;
            }
            else{
                // Si el nodo a inserta va al final de la lista.
                if(posicion == tamanio){
                    Nodo aux = inicio;
                    // Recorre la lista hasta llegar al ultimo nodo.
                    while(aux.getSiguiente() != null){
                        aux = aux.getSiguiente();
                    }
                    // Inserta el nuevo nodo despues de del ultimo.
                    aux.setSiguiente(nuevo);              
                }
                else{
                    // Si el nodo a insertar va en el medio de la lista.
                    Nodo aux = inicio;
                    // Recorre la lista hasta llegar al nodo anterior
                    // a la posicion en la cual se insertara el nuevo nodo.
                    for (int i = 0; i < (posicion-1); i++) {
                        aux = aux.getSiguiente();
                    }
                    // Guarda el nodo siguiente al nodo en la posición
                    // en la cual va a insertar el nevo nodo.
                    Nodo siguiente = aux.getSiguiente();
                    // Inserta el nuevo nodo en la posición indicada.
                    aux.setSiguiente(nuevo);
                    // Une el nuevo nodo con el resto de la lista.
                    nuevo.setSiguiente(siguiente);
                }
                
            }
            // Incrementa el contador de tamaño de la lista.
            
        }
        acumulador+=valor;
        tamanio++;
   }
    
    

    public void AgregarFinLista(int elemento) {

        if (!ListaVacia()) {

            fin.siguiente = new Nodo(elemento);
            fin = fin.siguiente;

        } else {

            inicio = fin = new Nodo(elemento);
        }
        mayor=elemento;
        if(inicio.dato>mayor){
            mayor=inicio.dato;
        
        }
        acumulador+=elemento;
        tamanio++;
    }

    public int EliminarElementoInicio() {

        int elemento = inicio.dato;

        if (inicio == fin) {

            inicio = fin = null;
        } else {

            inicio = inicio.siguiente;
        }
        acumulador-=elemento;
        tamanio--;
        return elemento;

    }

    public int EliminarElementoFinal() {

        int elemento = fin.dato;

        if (inicio == fin) {

            inicio = fin = null;

        } else {

            Nodo auxiliar = inicio;

            while (auxiliar.siguiente != fin) {

                auxiliar = auxiliar.siguiente;
            }

            fin = auxiliar;
            fin.siguiente = null;

        }
        acumulador-=elemento;
        tamanio--;
        return elemento;
    }

    public void EliminarNodoEspecifico(int elemento) {

        if (!ListaVacia()) {

            if (inicio == fin && elemento == inicio.dato) {

                inicio = fin = null;

            } else if (elemento == inicio.dato) {

                inicio = inicio.siguiente;

            } else {

                Nodo anterior, posterior;

                anterior = inicio;
                posterior = inicio.siguiente;

                while (posterior != null && posterior.dato != elemento) {

                    anterior = anterior.siguiente;
                    posterior = posterior.siguiente;

                }

                if (posterior != null) {

                    anterior.siguiente = posterior.siguiente;

                    if (anterior == fin) {

                        fin = anterior;
                    }

                }
            }

        }
        acumulador-=elemento;
        tamanio--;

    }
    
    public boolean BuscarElemento(int elemento){
        
        Nodo temporal = inicio;
        
        while(temporal != null && temporal.dato != elemento){
            
            temporal = temporal.siguiente;
            
        }
        
        return temporal != null;
    }
    

    public String MostrarLista() {

        String lista = " ";
        Nodo mostrar = inicio;

        while (mostrar != null) {

            lista = lista + "[" + mostrar.dato + "] ->";

            mostrar = mostrar.siguiente;

        }
        return lista;
    }
    
    public int promedio(){
        int promedio = acumulador/tamanio;
        return promedio;
    
    }
    public int Mayor(){
        Nodo Mayor=inicio;
        mayor=Mayor.dato;
        while(Mayor!=null){
         if(Mayor.dato>mayor){
             mayor=Mayor.dato;
         }
        Mayor=Mayor.siguiente;
        }
        
        return mayor;
        
    }
    
      public int Menor(){
        Nodo Menor=inicio;
        menor=Menor.dato;
        while(Menor!=null){
         if(Menor.dato<menor){
             menor=Menor.dato;
         }
        Menor=Menor.siguiente;
        }
        
        return menor;
    }
        public String ordenar()
{
            int t=1,c=1;
            Nodo act = inicio;/*definimos que el apuntador act esta en el primer nodo*/
            while(act.siguiente !=null)//Este while cuenta el total de nodos.
            {
                act = act.siguiente;
                c++;
            }
            /* estas 2 variebles solo son variables que guardaran el valor temporalmente*/
            int tem=0;
            String tem1 ="";
            //aqui se hace el ordenamiento
            do{
                act = inicio;//aux esta en el primer nodo
                Nodo sig = act.siguiente;//esta en el siguiente nodo 
                while(act.siguiente!= null)
                {
                    if(act.dato > sig.dato)
                    {
                        tem = act.dato;
                        tem1 = act.palabra;
                        act.dato = sig.dato;
                        act.palabra = sig.palabra;
                        sig.dato = tem;
                        sig.palabra = tem1;
                        //imprimir();
                        act = act.siguiente;
                        sig = sig.siguiente;
                    }
                    else
                    {
                        //[1] [3] [2]
                        //    act sig 
                        act = act.siguiente;
                        sig = sig.siguiente;
                        //imprimir();
                    }
                }
                t++;
            }while(t<=c);//act.ap_sig != null);
       return "Su lista ya fue ordenada";     
    }
    }