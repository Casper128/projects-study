package EDYL05.Pilas;

import java.util.Set;

public class PilaLista {

    private Nodo inicio;
    private int tamaño;

    public PilaLista() {

        this.inicio = null;
        this.tamaño = 0;
    }

    public boolean PilaVacia() {

        return inicio == null;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void Apilar(int dato, String producto) {

        Nodo nuevo = new Nodo();
        nuevo.setDato(dato);
        nuevo.setProducto(producto);

        if (PilaVacia()) {

            inicio = nuevo;

        } else {

            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }

        tamaño++;

    }

    public String CimaMostrar() {

        if (!PilaVacia()) {
            String aux = "Producto: " + inicio.getProducto() + " Cantidad: " + inicio.getDato();
            return aux;
        } else {

            return "";
        }
    }

    public int Cima() {

        if (!PilaVacia()) {

            return inicio.getDato();

        } else {

            return 0;
        }

    }

    public void MostrarPila() {

        Nodo Auxiliar = inicio;

        while (Auxiliar != null) {

            System.out.println("Producto: " + Auxiliar.getProducto() + " Cantidad: " + Auxiliar.getDato());
            Auxiliar = Auxiliar.getSiguiente();
        }

    }

    public boolean BuscarElemento(String elemento_buscar) {

        Nodo Auxiliar = inicio;
        boolean Existe = false;
        int posicion = 1;
        while (Existe != true && Auxiliar != null) {

            if (elemento_buscar.equals(Auxiliar.getProducto())) {
                System.out.println("El producto encontrado: " + Auxiliar.getProducto()
                        + " \nLa cantidad del producto es: " + Auxiliar.getDato()
                        + "\nLa Posicion Actual es: " + posicion);
                Existe = true;

            } else {

                Auxiliar = Auxiliar.getSiguiente();

            }
            posicion++;
        }

        return Existe;

    }

    public int EliminarTope() {
        int elemento_borrado = inicio.getDato();
        if (!PilaVacia()) {

            inicio = inicio.getSiguiente();
            tamaño--;
        }
        return elemento_borrado;
    }

    public void EliminarPila() {
        this.inicio = null;
        this.tamaño = 0;
    }

    public void EliminarDatoEspecifico(String Elemento_Eliminar) {
        if (BuscarElemento(Elemento_Eliminar)) {
            Nodo PilaAuxiliar = null;
            while (!Elemento_Eliminar.equals(inicio.getProducto())) {
                Nodo Temporal = new Nodo();
                Temporal.setProducto(inicio.getProducto());
                Temporal.setDato(inicio.getDato());
                if (PilaAuxiliar == null) {
                    PilaAuxiliar = Temporal;
                } else {
                    Temporal.setSiguiente(PilaAuxiliar);
                    PilaAuxiliar = Temporal;
                }
                EliminarTope();
            }
            EliminarTope();
            while (PilaAuxiliar != null) {
                Apilar(PilaAuxiliar.getDato(), PilaAuxiliar.getProducto());
                PilaAuxiliar = PilaAuxiliar.getSiguiente();
            }
            PilaAuxiliar = null;
        }//Fin del si

        tamaño--;
    }

    public void ActualizarDatoExistente(String producto_actual, String producto_nuevo, int nuevo_dato) {
        if (BuscarElemento(producto_actual)) {
            Nodo PilaAuxiliar = null;
            while (!producto_actual.equals(inicio.getProducto())) {
                Nodo Temporal = new Nodo();
                Temporal.setProducto(inicio.getProducto());
                Temporal.setDato(inicio.getDato());
                if (PilaAuxiliar == null) {
                    PilaAuxiliar = Temporal;
                } else {
                    Temporal.setSiguiente(PilaAuxiliar);
                    PilaAuxiliar = Temporal;
                }
                EliminarTope();
            }
            inicio.setProducto(producto_nuevo);
            inicio.setDato(nuevo_dato);
            while (PilaAuxiliar != null) {
                Apilar(PilaAuxiliar.getDato(), PilaAuxiliar.getProducto());
                PilaAuxiliar = PilaAuxiliar.getSiguiente();
            }
            PilaAuxiliar = null;
        }
    }

  
    public void promedio() {

        Nodo Auxiliar = inicio;
        int suma=0;
        int i=0;
        while (Auxiliar != null) {
                
            System.out.println("Producto: " + Auxiliar.getProducto() + " Cantidad: " + Auxiliar.getDato());
            suma=Auxiliar.getDato()+suma;
            Auxiliar = Auxiliar.getSiguiente();
            System.out.println("la suma es: "+suma);
            i++;
        }
            System.out.println("El promedio es: "+suma/i);
    }
}  
  
