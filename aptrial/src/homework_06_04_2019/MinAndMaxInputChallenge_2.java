package homework_06_04_2019;

//-Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.

import java.util.Scanner;

public class MinAndMaxInputChallenge_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("\nEnter Number: ");
        int number = console.nextInt();
        int max = number;
        int min = number;

        while (number != -1) {
            if (number > max) {
                max = number;
            } else if (number < min) {
                min = number;
            }
            System.out.print("Type a number (or -1 to stop): ");
            number = console.nextInt();
        }
        if (max != -1 && min != -1) {
            System.out.println("Maximum was " + max);
            System.out.println("Minimum was " + min);
        }
    }
}
