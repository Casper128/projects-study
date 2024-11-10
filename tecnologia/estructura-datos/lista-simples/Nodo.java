
package ListaSimples;


public class Nodo {

    public int dato;
    public Nodo siguiente;//puntero enlace
    String palabra;
    //Consutrctor para insertar al inicio
    public Nodo(int dato, Nodo inicio) {

        this.dato = dato;
        this.siguiente = inicio;

    }
//Constructor para insertar al final
    public Nodo(int dato) {

        this.dato = dato;
        this.siguiente = null;
    }
    
    
    //-----GETTER y SETTER------
    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
    
}
