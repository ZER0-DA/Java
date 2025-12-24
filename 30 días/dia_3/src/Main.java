//Día 3 bueno menos complicado

import java.util.Scanner;

public class Main{
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);



        boolean seguir = true;


        while (seguir){

            System.out.println("Ingrese 5 números");

            System.out.println("Número:");
            int numero = scanner.nextInt();

            int mayor = numero;
            int menor = numero;


            for(int i = 0; i < 4; i++){

                System.out.println("Número:");
                numero = scanner.nextInt();



                if (numero > mayor){
                    mayor = numero;
                }
                if (numero < menor) {

                    menor = numero;
                }

            }

            System.out.println("Mayor: " + mayor);
            System.out.println("Menor: " + menor);

            scanner.nextLine();

            System.out.println();

            System.out.println("Desea seguir? si/ no");
            String continuar = scanner.nextLine();

            if (continuar.equalsIgnoreCase("no")){
                seguir = false;
            }

            System.out.println();
        }

        scanner.close();

    }

}