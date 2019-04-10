package homework_06_04_2019;

import java.util.Scanner;

public class EvenDigitSum_11 {

    public static void main(String[] args) {

        int number;
        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter your number : ");
        number = sc.nextInt();

        System.out.println("\nThe sum of Even Digits in number is "+getEvenDigitSum(number));
    }

    public static int getEvenDigitSum(int num) {
        int sum=0;
        while(num>0) {
                if(num%2==0){
                    sum+=num%10;
                }
                num=num/10;
        }
        return sum;
    }
}
