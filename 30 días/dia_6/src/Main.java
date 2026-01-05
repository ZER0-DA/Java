import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        int numP = 0;
        int numI = 0;

        int sumaTotal = 0;

        System.out.println("Ingrese números enteros");

        System.out.println("Número: ");
        int num = scanner.nextInt();


        while (num >= 0){

            if (num % 2 == 0){
                numP++;
            }else {
                numI++;
            }

            sumaTotal += num;

            System.out.println("Número: ");
            num = scanner.nextInt();
        }

        System.out.println();

        System.out.println("Pares: " + numP);
        System.out.println("Impares: "+ numI);
        System.out.println("Suma total: " + sumaTotal);


        scanner.close();

    }
}