import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);


        int numP = 0;
        int numN = 0;
        int total = 0;

        System.out.println("Ingrese solo números enteros");
        System.out.println("Número: ");

        int num = scanner.nextInt();


        while (num !=0){


            if (num > 0){
                numP ++;
            }

            if (num < 0){
                numN ++;
            }

            total += num;

            System.out.println("Número: ");

            num = scanner.nextInt();


        }

        System.out.println();

        System.out.println("Positivos: " + numP);
        System.out.println("Negativos: " + numN);
        System.out.println("Suma Total: " + total);


        scanner.close();


    }
}