package Vector;




import java.util.Scanner;
import java.util.Vector;

public class TallerClase14 {


    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el numero de paises a ingresar: ");
        int numPais=leer.nextInt();
         Vector<String> Vector_Pais = new Vector<String>();
         
         for (int i = 0; i <numPais ; i++) {
             System.out.println("Ingrese el nombre del pais: ");
             String nombre=leer.next();
             Vector_Pais.addElement(nombre);
        }
         for (int i = 0; i < Vector_Pais.size(); i++) {
             System.out.println("Nombre pais: "+(i+1)+" "+Vector_Pais.get(i));
             
        }
         System.out.println("Ingrese el nombre de uno de los paises");
         String Buscador=leer.next();
          
         if (Vector_Pais.contains(Buscador)) {
             
             Vector_Pais.remove(Buscador);
         
         for (int i = 0; i < Vector_Pais.size(); i++) {
             System.out.println("Nombre pais: "+(i+1)+" "+Vector_Pais.get(i));
        }
         }
         else  {
             System.out.println(" El pais no se encuentra en el vector");
              System.out.println("Digite el pais a ingresar a lista: ");
             Vector_Pais.addElement(Buscador);
             System.out.println(" Su pais fue agregado");
              for (int i = 0; i < Vector_Pais.size(); i++) {
             System.out.println("Nombre pais: "+(i+1)+" "+Vector_Pais.get(i));
             
        }
                  }     
}

}
