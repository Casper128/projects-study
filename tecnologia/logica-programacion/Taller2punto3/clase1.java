package Taller2punto3;

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

    
  public int MultiploDe4(){
      int contador=0;
      for(int i=4;i<=numero;i+=1){
        if((i%4)==0){
            System.out.println("El numero: "+i+" es multiplo de 4");
            contador=contador+i;
            conteo=conteo+1;
        } 
  } 
      promedio=contador/conteo;
      System.out.println("La suma de los multiplos de 4 es: "+contador);
      System.out.println("El promedio de los multiplos de 4 es: "+promedio);
    return numero;
  }
  
    public int MultiploDe5(){
        int contador=0;
      for(int i=4;i<=numero;i+=1){
        if((i%5)==0){
            System.out.println("El numero: "+i+" es multiplo de 5");
            contador=contador+i;
            conteo=conteo+1;
        } 
  } 
      promedio=contador/conteo;
      System.out.println("La suma de los multiplos de 5 es: "+contador);
      System.out.println("El promedio de los multiplos de 5 es: "+promedio);
    return numero;
  }
  public int MultiploDe7(){
      int contador=0;
      int conteo=0;
      int promedio=0;
      for(int i=4;i<=numero;i+=1){
        if((i%7)==0){
            System.out.println("El numero: "+i+" es multiplo de 7");
            contador=contador+i;
            conteo=conteo+1;
        } 
  } 
      promedio=contador/conteo;
      System.out.println("La suma de los multiplos de 7 es: "+contador);
      System.out.println("El promedio de los multiplos de 7 es: "+promedio);
    return numero;
  }
}
        