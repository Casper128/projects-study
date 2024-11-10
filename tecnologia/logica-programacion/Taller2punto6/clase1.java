
package Taller2punto6;


public class clase1 {
    
    //Atributos
    public int TipoV;
    public double valorV;

    public int getTipoV() {
        return TipoV;
    }

    public void setTipoV(int TipoV) {
        this.TipoV = TipoV;
    }

    public double getValorV() {
        return valorV;
    }

    public void setValorV(double valorV) {
        this.valorV = valorV;
    }

    public clase1() {
    }
    public void imprimir(int TipoV,double valorV){
        if (TipoV==1){
               System.out.println("El valor de comision del mesero es: "+((valorV*0.15)+(valorV*0.1)));
           }
        else if (TipoV==2){
            System.out.println("El valor de comision del mesero es: "+((valorV*0.1)+(valorV*0.1)));
           }
        else if (TipoV==3){
            System.out.println("El valor de comision del mesero es: "+((valorV*0.05)+(valorV*0.1)));
        
       }
    }
    
}
