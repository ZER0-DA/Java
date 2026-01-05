import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese 5 números: ");
        int num = sc.nextInt();

        int numMayor = num;
        int numMenor = num;

        for (int i = 0; i < 4; i++){

            num = sc.nextInt();

            if (numMayor < num){
                numMayor = num;
            }

            if (numMenor > num) {
                numMenor = num;

            }

        }

        System.out.println();

        if(numMayor % 2 == 0){
            System.out.println("Mayor: " + numMayor + " (Par)");
        }else {
            System.out.println("Mayor: " + numMayor + " (Impar)");
        }


        System.out.println("Menor: " + numMenor);

        sc.close();

    }
}