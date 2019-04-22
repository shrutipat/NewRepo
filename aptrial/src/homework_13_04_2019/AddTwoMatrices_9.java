package homework_13_04_2019;

import java.util.Scanner;

// add two matrices of the same size

public class AddTwoMatrices_9 {

     /*Working as expected*/

    public static void main(String[] args) {
        int x, y, c, d;
        Scanner in = new Scanner(System.in);

        System.out.println("\nEnter the number of rows and columns of matrix : ");
        x = in.nextInt();
        y = in.nextInt();

        int first[][] = new int[x][y];
        int second[][] = new int[x][y];
        int sum[][] = new int[x][y];

        System.out.println("Enter the elements of first matrix : ");

        for (c = 0; c < x; c++)
            for (d = 0; d < y; d++)
                first[c][d] = in.nextInt();

        System.out.println("Enter the elements of second matrix : ");

        for (c = 0; c < x; c++)
            for (d = 0; d < y; d++)
                second[c][d] = in.nextInt();

        for (c = 0; c < x; c++)
            for (d = 0; d < y; d++)
                sum[c][d] = first[c][d] + second[c][d];

        System.out.println("Sum of entered matrices is :");

        for (c = 0; c < x; c++) {
            for (d = 0; d < y; d++)
                System.out.print(sum[c][d] + "\t");

            System.out.println();
        }
    }
}
