// Día dos un poco complicado pero ahí vamos.

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        double suma = 0;
        double promedioFinal = 0;
        String resultado;


        System.out.println("Vienvenido");

        boolean seguir = true;

        while(seguir){

            System.out.println("Ingrse sus notas");

            for(int i = 0 ; i <5; i++){
                System.out.println("nota: ");
                double nota = scanner.nextDouble();

                suma = suma + nota;
            }

            promedioFinal = suma/5;

            if (promedioFinal >= 9){

                resultado = "Excelente";

            } else if (promedioFinal >= 7 && promedioFinal < 9) {
                resultado = "Aprobado";
            }else {
                resultado = "Reprobado";
            }

            System.out.println("Promedio: " + promedioFinal);
            System.out.println("Resultado: " + resultado);

            scanner.nextLine();
            System.out.println();

            System.out.println("Desea seguir? Si/No: ");
            String continuar = scanner.nextLine();

            if (continuar.equals("No")){
                seguir = false;
            }else if (continuar.equals("Si")){
                seguir = true;
            }else {
                System.out.println("Error");
                return;
            }

            System.out.println();




        }


        scanner.close();
    }
}