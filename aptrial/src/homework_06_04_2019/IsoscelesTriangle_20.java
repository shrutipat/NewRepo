package homework_06_04_2019;

import java.util.Scanner;

public class IsoscelesTriangle_20 {
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            System.out.println(" Enter Rows");
            int rows = sc.nextInt();
            for (int x = 1; x <= rows; x++) {
                for (int k = rows; k >= x; k--) {
                    System.out.print(" ");
                }

                for (int i = 1; i <= x; i++) {

                    System.out.print("* ");
                }
                System.out.println();

            }
        }
    }
}
