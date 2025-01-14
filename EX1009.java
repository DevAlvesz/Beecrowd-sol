package ExerciciosBeeCrowd;
import java.util.Locale;
import java.util.Scanner;

public class EX1009 {
    public static void main(String[] args) {

        //SALÁRIO COM BÔNUS

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String name = sc.next();

        double fixedSalary = sc.nextDouble();
        double totalSales = sc.nextDouble();

        double total = (fixedSalary+(totalSales*0.15));

        System.out.printf("TOTAL = R$ %.2f%n", total);
    }
}
