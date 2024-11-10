
package Punto4;

public class clase1 {
    public double[]arreglo;
    public double mayor;
    

    public double getMayor() {
        return mayor;
    }

    public void setMayor(double mayor) {
        this.mayor = mayor;
    }

    public double[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(double[] arreglo) {
        this.arreglo = arreglo;
    }


   
    public double busquedaSecuencial(double []arreglo){
    double mayor=arreglo[0];
    for(int j = 0; j <arreglo.length-1; j++){//recorremos todo el arreglo
      if(arreglo[j]> mayor){//comparamos el elemento en el arreglo con el buscado
          mayor=arreglo[j];
   }
      }
        return mayor;


}
}
