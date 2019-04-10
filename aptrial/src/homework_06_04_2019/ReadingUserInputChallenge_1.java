package homework_06_04_2019;

import java.util.Scanner;

public class ReadingUserInputChallenge_1 {
/*
Read 10 numbers from the console entered by the user and print the sum of those numbers.
-Use the hasNextInt() method from the scanner to check if the user has entered an int value.
-If hasNextInt() returns false, print the message Invalid Number•. Continue reading until you have read 10 numbers.
*/

    public static void main(String[] args) {

         /*Working as expected*/

        Scanner sc = new Scanner(System.in);
        int counter = 1;
        int num,sum=0;

        System.out.println("Enter your number " + counter + " : ");
        while (counter < 11) {
            if (!sc.hasNextInt()) {
                sc.next();
                System.out.println("Enter your number "+counter+" : ");
                }
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                sum+= num;
                counter++;
                if (counter < 11) {
                    System.out.println("Enter your number " + counter + " : ");
                }
            }
        }
        System.out.println("Sum of 10 numbers is "+sum);
    }
}
