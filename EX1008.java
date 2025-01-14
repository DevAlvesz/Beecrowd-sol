package ExerciciosBeeCrowd;

import java.util.Scanner;

public class EX1008 {
    public static void main(String[] args) {
        //SALÁRIO

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int horas = sc.nextInt();
        double salario = sc.nextDouble();

        double sal = salario * horas;

        System.out.println("NUMBER = "+num);
        System.out.printf("SALARY = U$ %.2f\n",sal);
    }
}
