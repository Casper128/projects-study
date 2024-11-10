package Taller2punto7;

import java.util.Scanner;
public class punto7 {
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int num1,num2,num3,mcm,i;
        System.out.println("Ingrese primer numero:");
        num1=leer.nextInt();
        System.out.println("Ingrese segundo numero:");
        num2=leer.nextInt();
        System.out.println("Ingrese tercer numero:");
        num3=leer.nextInt();

        mcm=1;
        i=2;
        while(i <= num1 || i <= num2 ||i <= num3)
        {
            if(num1%i==0 || num2%i==0 || num3%i==0)
            {
            mcm=mcm*i;
            if(num1%i==0) num1=num1/i;
            if(num2%i==0) num2=num2/i;
            if(num3%i==0) num3=num3/i;
            }
            else
                i=i+1;               
        }                        
        System.out.println("El MCM es =" +mcm);                                          
        }         
    }