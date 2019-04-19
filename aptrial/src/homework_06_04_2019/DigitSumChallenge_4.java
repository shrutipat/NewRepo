package homework_06_04_2019;

import java.util.Scanner;

/*Write a method with the name sumDigits that has one int parameter called number.
If parameter is >= 10 then the method should process the number and return sum of all digits, otherwise return -1 to indicate an invalid value.
The numbers from 0-9 have 1 digit so we don't want to process them; also we don't want to process negative numbers, so also return -1 for negative numbers.
For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
*/
public class DigitSumChallenge_4 {
    /*
    * If you enter 9 then gives result - "Number is too big" "Invalid input" as this is not big number
    * otherwise programme work expected.
    * */

    public static void main(String[] args) {
        int p;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 or 3 digit Number : ");
        p = sc.nextInt();

        if (sumDigits(p) < 0) {
            System.out.println("Invalid input");
        }
        else {
            System.out.println("Sum of the digits is "+sumDigits(p));
        }
    }


    public static int sumDigits(int parameter){
        int unit, ten, hundred;
        if (parameter<0){
            return -1;
        }
        else if(parameter>=0&&parameter<=9){
            return -1;
        }
        else if (parameter>=10&&parameter<100){
            unit=parameter%10;
            ten=parameter/10;
            return ten+unit;
        }
        else if (parameter>=100&&parameter<=999){
            unit=parameter%100;
            ten=unit/10;
            unit=unit%10;
            hundred=parameter/100;
            return unit+ten+hundred;
        }
        else{
            System.out.println("Number is too big");
            return -1;
        }
    }
}
