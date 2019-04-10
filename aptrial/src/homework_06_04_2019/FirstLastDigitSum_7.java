package homework_06_04_2019;

import java.util.Scanner;

public class FirstLastDigitSum_7 {
// Add first and last of number

    public static void main(String[] args) {


        int number, first_digit, last_digit;
        Scanner sc = new Scanner(System.in);

        System.out.print(" Please Enter any Number that you wish : ");
        number = sc.nextInt();
        first_digit = firstDigit(number);

        last_digit = lastDigit(number);

        if (last_digit==-1){
            System.out.println("Invalid input: Number is Negative");
        }
        else {
            System.out.println("\nThe sum of first and Last Digit " + (first_digit + last_digit));
        }
    }

    public static int firstDigit(int num) {
        while (num >= 10) {
            num = num / 10;
        }
        return num;
    }

    public static int lastDigit(int num) {
        if (num<0){
            return-1;
        }
        return num % 10;
    }
}

