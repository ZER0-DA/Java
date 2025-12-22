//Día 1 completado

import java.util.Scanner;

public class Main{
   public static void main(String[]args){

       Scanner scanner = new  Scanner(System.in);

       int numerosPositivos = 0;
       int numerosNegativos = 0;
       int ceros = 0;


       System.out.println("Vienvenido a mi sistema");

       System.out.println("Ingrese 5 números ");

       int i = 0;
       while(i <= 4){

           System.out.println("número: ");
           int num= scanner.nextInt();

           if (num < 0){
               numerosNegativos = numerosNegativos + 1;
           } else if (num > 0) {

               numerosPositivos = numerosPositivos + 1;

           }else {
               ceros = ceros + 1;
           }

           i = i +1;
       }


       System.out.println("Números positivos: " + numerosPositivos);
       System.out.println("Números negativos: " + numerosNegativos);
       System.out.println("Ceros: " + ceros);


       scanner.close();





   }
}