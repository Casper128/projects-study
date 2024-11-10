
package ListasDobles;
    
public class ListaDoble {

    private NodoDoble inicio, fin;

    public ListaDoble() {

        inicio = fin = null;
    }

    public boolean ListaVacia() {

        if (this.inicio == null) {

            return true;

        } else {

            return false;
        }

    }

    public void InsertarElementoInicio(int elemento) {

        if (!ListaVacia()) {

            inicio = new NodoDoble(elemento, inicio, null);
            inicio.siguiente.anterior = inicio;

        } else {

            inicio = fin = new NodoDoble(elemento);
        }

    }

    public void InsertarElementoFina(int elemento) {

        if (!ListaVacia()) {

            fin = new NodoDoble(elemento, null, fin);
            fin.anterior.siguiente = fin;

        } else {

            inicio = fin = new NodoDoble(elemento);
        }
    }

    public void MostrarInicioFinal() {

        if (!ListaVacia()) {

            NodoDoble Auxiliar = inicio;

            while (Auxiliar != null) {

                System.out.print("<->[" + Auxiliar.dato + "]<->");
                Auxiliar = Auxiliar.siguiente;

            }
        }

    }

    public void MostrarFinalInicio() {

        if (!ListaVacia()) {

            NodoDoble Auxiliar = fin;

            while (Auxiliar != null) {

                System.out.print("<->[" + Auxiliar.dato + "]<->");
                Auxiliar = Auxiliar.anterior;

            }
        }

    }

    public int EliminarElementoInicio() {

        int elemento = inicio.dato;

        if (inicio == fin) {

            inicio = fin = null;

        } else {

            inicio = inicio.siguiente;
            inicio.anterior = null;
        }

        return elemento;

    }

    public int EliminarElementoFin() {

        int elemento = fin.dato;

        if (inicio == fin) {

            inicio = fin = null;

        } else {

            fin = fin.anterior;
            fin.siguiente = null;
        }

        return elemento;

    }
    
    public boolean BuscarElementoLista(int elemento){
        
        NodoDoble temporal = inicio;
        
        while(temporal != null && temporal.dato != elemento){
            
            temporal = temporal.siguiente;
        }
        
        return temporal != null;
    }

}
        

