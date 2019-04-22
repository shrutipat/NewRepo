package homework_13_04_2019;

import java.util.Scanner;

//Write a Java program to display Pascal's triangle.
//Input number of rows

public class PascalTriangle_11 {

     /*Not Working as expected*/

    public static void main(String[] args) {
        int rows;
        Scanner sc = new Scanner(System.in);
        rows = sc.nextInt();
        int space2=rows;

        for(int i = 0; i < rows; i++){
            for(int space=space2; space>0; space--) {
                System.out.print(" ");
            }
            space2--;
                for (int j = 0, x = 1; j <= i; j++) {
                    System.out.print(x + " ");
                    x = x * (i - j) / (j + 1);
                }
                System.out.println();
        }
    }
}

