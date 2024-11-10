
package Taller2punto5;

public class clase1 {
    
    
    //Atributos
    public double valorProducto;

    public double getValorProducto() {
        return valorProducto;
    }

    public void setValorProducto(double valorProducto) {
        this.valorProducto = valorProducto;
    }

    public clase1() {
    }
    public double calcular10(){
    
        if(valorProducto<=1000){
            valorProducto=(valorProducto*0.1);    
        }
        return valorProducto;
    }
    
        public double calcular7(){
    
        if(valorProducto>1000){
            valorProducto=(valorProducto*0.07);    
        }
        return valorProducto;
    }
}
