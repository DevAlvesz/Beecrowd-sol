package ExerciciosBeeCrowd;

import java.util.Locale;
import java.util.Scanner;

public class EX1011 {
    public static void main(String[] args) {
        //ESFERA

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();

        double volume = (4/3.0) * 3.14159 * raio * raio * raio;

        System.out.printf("VOLUME = %.3f%n", volume);
    }
}
