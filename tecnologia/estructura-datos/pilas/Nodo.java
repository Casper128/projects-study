
package EDYL05.Pilas;
public class Nodo {

private int dato;
private String producto;
private Nodo siguiente;

 public Nodo() {
 this.producto="";
 this.dato = 0;
this.siguiente = null;
}

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

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