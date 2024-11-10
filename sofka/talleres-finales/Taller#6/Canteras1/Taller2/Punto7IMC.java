
package Taller2;

public class Punto7IMC {
    		private double estatura;
		private double peso;


    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }


    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
                
   public void  IMC(double peso,double estatura){
   
   
   		double imc = peso/(estatura*estatura);
		if (imc<16) {
			System.out.println("Su indice de masa corporal es: "+imc+" Se encuentra en BAJO peso");
		}
		if (imc>=16 && imc<18) {
			System.out.println("Su indice de masa corporal es: "+imc+" Se encuentra en un peso NORMAL");
		}
		if (imc>=18 && imc<20) {
			System.out.println("Su indice de masa corporal es: "+imc+" Se encuentra en un peso sobrepeso");
		}
		if (imc>=20) {
			System.out.println("Su indice de masa corporal es: "+imc+" Se encuentra en un peso obeso");
		}
   
   
   }         
                
}
