package arbolesbinarios;

//CLASE ARBOL BINARIO
public class ArbolBinario {

    NodoArbol raiz;

    public ArbolBinario() {

        this.raiz = null;
    }

    public boolean ArbolVacio() {

        return raiz == null;
    }

    public void AgregarNodo(int dato) {
        NodoArbol nuevo = new NodoArbol(dato);

        if (raiz == null) {

            raiz = nuevo;

        } else {

            NodoArbol auxiliar = raiz;
            NodoArbol padre;

            while (true) {

                padre = auxiliar;

                if (dato < auxiliar.dato) {

                    auxiliar = auxiliar.hijoizquierdo;

                    if (auxiliar == null) {

                        padre.hijoizquierdo = nuevo;

                        return;

                    }
                } else {

                    auxiliar = auxiliar.hijoderecho;
                    if (auxiliar == null) {
                        padre.hijoderecho = nuevo;
                        return;
                    }
                }

            }

        }
    }

    public void inOrden(NodoArbol raiz) {

        if (raiz != null) {

            inOrden(raiz.hijoizquierdo);
            System.out.println("  " + raiz.dato);
            inOrden(raiz.hijoderecho);
        }
    }

    public void PreOrden(NodoArbol raiz) {

        if (raiz != null) {

            System.out.println("  " + raiz.dato);
            PreOrden(raiz.hijoizquierdo);   
            PreOrden(raiz.hijoderecho);
        }
    }

    public void PostOrden(NodoArbol raiz) {

        if (raiz != null) {

            PostOrden(raiz.hijoizquierdo);
            PostOrden(raiz.hijoderecho);
            System.out.println("  " + raiz.dato);

        }
    }

    public NodoArbol ObtenerNodoReemplazar(NodoArbol NodoRempl) {

        NodoArbol reemplazarpadre = NodoRempl;
        NodoArbol reemplazo = NodoRempl;
        NodoArbol auxiliar = NodoRempl.hijoderecho;

        while (auxiliar != null) {

            reemplazarpadre = reemplazo;
            reemplazo = auxiliar;
            auxiliar = auxiliar.hijoizquierdo;
        }

        if (reemplazo != NodoRempl.hijoderecho) {

            reemplazarpadre.hijoizquierdo = reemplazo.hijoderecho;
            reemplazo.hijoderecho = NodoRempl.hijoderecho;
        }

        System.out.println("El nodo reemplazante es: " + reemplazo.dato);

        return reemplazo;
    }

    public boolean Eliminar(int dato) {

        NodoArbol auxiliar = raiz;
        NodoArbol padre = raiz;
        boolean HijoIzquierdo = true;

        while (auxiliar.dato != dato) {

            padre = auxiliar;

            if (dato < auxiliar.dato) {

                HijoIzquierdo = true;
                auxiliar = auxiliar.hijoizquierdo;

            } else {

                HijoIzquierdo = false;
                auxiliar = auxiliar.hijoderecho;

            }

            if (auxiliar == null) {

                return false;
            }

        }

        if (auxiliar.hijoizquierdo == null && auxiliar.hijoderecho == null) {

            if (auxiliar == raiz) {

                raiz = null;

            } else if (HijoIzquierdo) {

                padre.hijoizquierdo = null;

            } else {

                padre.hijoderecho = null;
            }

        } else if (auxiliar.hijoderecho == null) {

            if (auxiliar == raiz) {

                raiz = auxiliar.hijoizquierdo;

            } else if (HijoIzquierdo) {

                padre.hijoizquierdo = auxiliar.hijoizquierdo;

            } else {

                padre.hijoderecho = auxiliar.hijoizquierdo;
            }

        } else if (auxiliar.hijoizquierdo == null) {

            if (auxiliar == raiz) {

                raiz = auxiliar.hijoderecho;

            } else if (HijoIzquierdo) {

                padre.hijoizquierdo = auxiliar.hijoderecho;

            } else {

                padre.hijoderecho = auxiliar.hijoizquierdo;
            }

        } else {

            NodoArbol reemplazo = ObtenerNodoReemplazar(auxiliar);

            if (auxiliar == raiz) {

                raiz = reemplazo;

            } else if (HijoIzquierdo) {

                padre.hijoizquierdo = reemplazo;

            } else {

                padre.hijoderecho = reemplazo;
            }

            reemplazo.hijoizquierdo = auxiliar.hijoizquierdo;

        }

        return true;
    }
    
     public boolean buscar(int busqueda) {
        return buscar(this.raiz, busqueda);
    }

    private boolean buscar(NodoArbol n, int busqueda) {
        if (n == null) {
            return false;
        }       
        
        if (n.dato == busqueda) {
            return true;
        } else if (busqueda <n.dato) {
            return buscar(n.hijoizquierdo, busqueda);
        } else {
            return buscar(n.hijoderecho, busqueda);
        }
        
    }
 
    
    public int contarNodos(NodoArbol nodo){
     int contador=1;

        if (nodo.hijoizquierdo!=null) {
            contador+=contarNodos(nodo.hijoizquierdo);
            System.out.println("Contar nodo izquierdo: "+ nodo.hijoizquierdo.dato);
        }
        if (nodo.hijoderecho!=null) {
            contador+=contarNodos(nodo.hijoderecho);
            System.out.println("Contar nodo derecho: "+nodo.hijoderecho.dato);
        }
        return contador;
    }
     
    public int contarHojas(ArbolBinario Arbol,NodoArbol nodo ){
     int contador=0;
      if(nodo.hijoizquierdo == null && nodo.hijoderecho == null){
          
       contador++;
      
      }
        if (nodo.hijoizquierdo!=null) {
            contador+=contarHojas(Arbol,nodo.hijoizquierdo);
         System.out.println("Contar hojas izquierdo: "+nodo.hijoizquierdo.dato);
        }
        if (nodo.hijoderecho!=null) {
            contador+=contarHojas(Arbol,nodo.hijoderecho);
            System.out.println("Contar hojas derecho: "+nodo.hijoderecho.dato);
        }
        return contador;
    }
    
    public int suma (NodoArbol n) {
    	int suma=n.dato;
    	if(n.hijoizquierdo==null && n.hijoderecho==null){
    		return suma;
    	}else{
    		if(n.hijoderecho==null){
    			suma+= suma(n.hijoizquierdo);
                        System.out.println(n.hijoizquierdo.dato);
    		}else if(n.hijoizquierdo==null){
    			suma+= suma(n.hijoderecho);
                        System.out.println(n.hijoderecho.dato);
    		}else{
                        
    			suma+= suma(n.hijoizquierdo);
    			suma+= suma(n.hijoderecho);
                        System.out.println(n.hijoizquierdo.dato);
                        System.out.println(n.hijoderecho.dato);
    		}
    	}
    	return suma;
    }
    
        
    }
    




