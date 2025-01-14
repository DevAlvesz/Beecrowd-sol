package ExerciciosBeeCrowd;

import java.util.Locale;
import java.util.Scanner;

public class EX1010 {
    public static void main(String[] args) {
        //CALCULO SIMPLES

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codPeca1 = sc.nextInt();
        int qtdPeca1 = sc.nextInt();
        double valPeca1 = sc.nextDouble();
        int codPeca2 = sc.nextInt();
        int qtdPeca2 = sc.nextInt();
        double valPeca2 = sc.nextDouble();

        double totalcust = qtdPeca1 * valPeca1 + qtdPeca2 * valPeca2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", totalcust);
    }
}
