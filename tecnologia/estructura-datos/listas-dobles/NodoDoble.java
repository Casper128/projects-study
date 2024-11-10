
package ListasDobles;


public class NodoDoble {
    
    public NodoDoble siguiente, anterior;
    public int dato;

    //Pra cuando no hay elementos en la lista
    public NodoDoble(int elemento) {

        this.dato = elemento;
        this.siguiente = null;
        this.anterior = null;

    }

    //Para cuando hay otros elementos en la lista
    public NodoDoble(int elemento, NodoDoble siguiente, NodoDoble anterior) {

        this.dato = elemento;
        this.siguiente = siguiente;
        this.anterior = anterior;

    }

}


    

