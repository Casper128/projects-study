
package arbolesbinarios;

//CLASE NODO ARBOL

public class NodoArbol {
    
    int dato;
    NodoArbol hijoizquierdo;
    NodoArbol hijoderecho;
    
    public NodoArbol(int dato){
        
        this.dato = dato;
        this.hijoizquierdo = null;
        this.hijoderecho = null;
    }
    
}