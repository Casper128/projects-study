
package Examen_2_Punto_1;


public class ciudades {
    
    
    //Atributos
    
  public double sensor1; 
public double sensor2; 
public double sensor3; 

    public double getSensor1() {
        return sensor1;
    }

    public void setSensor1(double sensor1) {
        this.sensor1 = sensor1;
    }

    public double getSensor2() {
        return sensor2;
    }

    public void setSensor2(double sensor2) {
        this.sensor2 = sensor2;
    }

    public double getSensor3() {
        return sensor3;
    }

    public void setSensor3(double sensor3) {
        this.sensor3 = sensor3;
    }
  
    public void tempPromedio(){
    double promedio=0;
    promedio=(sensor1+sensor2+sensor3/3);
        System.out.println("La temperatura promedio es: "+promedio);
    if(promedio<=9){
        System.out.println("El estado meteorologico es frio ");
    }
      if(promedio>9 && promedio<=35){
        System.out.println("El estado meteorologico es calido ");
    }
      if(promedio>35){
        System.out.println("El estado meteorologico es caliente ");
    }
     
    }
  
  
}
