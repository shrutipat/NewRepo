package homework_06_04_2019;

import java.util.Scanner;

public class hasSharedDigit {
    /*Write a method named hasSharedDigit with two parameters of type int.
    Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.
    The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.
    EXAMPLE*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers between 10 and 999 :"); //allowing 10 to 999 range
        hasSharedDigit(sc.nextInt(),sc.nextInt());

    }

    public static boolean hasSharedDigit(int num1, int num2){
        int lastDigitIn1, lastDigitIn2;
        int temp=num2;

        if(num1<10||num1>999||num2<10||num2>999)
        {
            System.out.println("Number is out of range of 10 & 999");
            return false;
        }

        while(num1>0) {
            lastDigitIn1=num1%10;
                while(temp>0) {
                        lastDigitIn2=temp%10;
                         if(lastDigitIn1==lastDigitIn2) {
                             System.out.println("Numbers shares No. "+lastDigitIn2);
                             return true;
                           }
                        temp=temp/10;
                }
            num1=num1/10;
            temp=num2;
        }
        System.out.println("Numbers don't share any digit");
        return false;
    }
}
