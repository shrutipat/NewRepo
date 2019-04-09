package architajavapractice;

import java.util.Scanner;

public class TableUsingWhileLoop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("\nPrint Multiplication Table \n--------------------------\nEnter Number : ");
        int num=sc.nextInt();
        int i=1;
        while(i<=12){
            System.out.println(num+" X "+i+" = "+num*i);
            i++;
        }
    }
}
