package architajavapractice;

import java.util.Scanner;

public class TableUsingForLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nPrint Multiplication Table\n--------------------------\nEnter Number : ");
        int num=sc.nextInt();
        for (int i=1; i<=12; i++){
            System.out.println(num+" X "+i+" = "+num*i);
        }
    }
}
