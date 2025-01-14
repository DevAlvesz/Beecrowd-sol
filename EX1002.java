package ExerciciosBeeCrowd;

import java.util.Scanner;

public class EX1002 {
    public static void main(String[] args) {
        //ÁREA DO CIRCULO, DAODOS: PI:  3.14159

        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();

        double pi = 3.14159;

        double area = pi*(raio*raio);

        System.out.printf("A=%.4f%n", area);
    }
}
