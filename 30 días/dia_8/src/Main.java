import java.util.Scanner;

public class Main {
   public  static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       int positivo = 0;
       int negativo = 0;
       int multiplo = 0; //múltiplos de 3
       int suma = 0;


       System.out.println("Ingrese solo números enteros: ");
       int num = sc.nextInt();

       while (num != 0){

           if (num > 0){
               positivo++;
               suma += num;

           }else {
               negativo++;
           }

           if (num % 3 == 0){
               multiplo++;
           }

           num = sc.nextInt();


       }

       System.out.println();

       System.out.println("Positivos: " + positivo);
       System.out.println("Negativos: " + negativo);
       System.out.println("Múltiplos de 3: " + multiplo);
       System.out.println("Suma de positivos: " + suma);




       sc.close();
    }
}