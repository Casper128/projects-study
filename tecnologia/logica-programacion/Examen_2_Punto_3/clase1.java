package Examen_2_Punto_3;

public class clase1 {
      
      int conteo=0;
      int promedio=0;

//Atributos
    public int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public clase1() {
    }

    
  public int Multiplos(){
      int contador=0;
      for(int i=1;i<=numero;i+=1){
        if((numero%i)==0){
            System.out.println("El numero: "+numero+" es multiplo de "+i);
        } 
  }
    return numero;
  }
  
}