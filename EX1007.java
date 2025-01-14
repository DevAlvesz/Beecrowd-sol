package ExerciciosBeeCrowd;

import java.util.Scanner;

public class EX1007 {
    public static void main(String[] args) {
        //DIFERENÇA

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        int DIFERENCA =  (A * B - C * D);

        System.out.println("DIFERENCA = "+  DIFERENCA);
    }
}
