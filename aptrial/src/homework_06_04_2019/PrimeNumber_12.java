package homework_06_04_2019;

import java.util.Scanner;

public class PrimeNumber_12 {

    /*Working as expected*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter any Number : ");
        int x = sc.nextInt();
        int i;
        if (x == 1) {
            System.out.println("Smallest Prime Number is 2");
        }
        for (i = 2; i < x; i++) {
            if (x % i == 0) {
                System.out.println("Number is Not a Prime");
                break;
            }
        }
        if (x == i) {
            System.out.print("Number Is Prime Number");

        }

    }
}
