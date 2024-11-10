
package Taller2punto9;

public class clase1 {
    public int numero;
    public int mayor;
    public int menor;
    public int acumulador;
    public int contador;
    public int promedio;

    public int getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getMayor() {
        return mayor;
    }

    public void setMayor(int mayor) {
        this.mayor = mayor;
    }

    public int getMenor() {
        return menor;
    }

    public void setMenor(int menor) {
        this.menor = menor;
    }
    
   public void procedimiento(){
            if(numero<0){
                System.out.println("ingrese un numero positivo");  
            }
            if(menor==0){
            menor=numero;
            mayor=numero;
            }
            if(numero>mayor){
                mayor=numero;    
            }
            if(numero<menor){
                menor=numero;
                            
            }
   }
   public void promedio(){
    if(numero%2!=0){
     acumulador=acumulador+numero;
    }
    if(numero%2!=0){
    contador++;
    }
    if(contador!=0){
    setPromedio(acumulador/contador);
       }
   }
}
