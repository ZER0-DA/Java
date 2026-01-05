import  java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int numValid = 0;
        int suma = 0;

        System.out.println("Imgrese solo números enteros");

        System.out.println("Numero: ");
        int num = scanner.nextInt();


        while (num >= 0){

            numValid ++;
            suma += num;

            System.out.println("Numero: ");
            num = scanner.nextInt();

        }

        System.out.println("Números validos: " + numValid);
        System.out.println("Suma: " + suma);

        if (numValid > 0){
            double promedio = (double)  suma/numValid;
            System.out.println("Promedio: " + promedio);
        }


        scanner.close();

    }
}z