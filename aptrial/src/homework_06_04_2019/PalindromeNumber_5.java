package homework_06_04_2019;

import java.util.Scanner;

public class PalindromeNumber_5 {

     /*Working as expected*/

    public static boolean isPalindrome(int parameter) {

        int x = parameter;
            int reverse = 0;
            while (x != 0) {
                int val = x % 10;
                int tmp = reverse;
                reverse = reverse * 10 + val;
                if ((reverse - val) / 10 != tmp) {
                   return false;
                }
                x /= 10;
            }

        if (reverse == parameter) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        num = sc.nextInt();

        if (isPalindrome(num)) {
            System.out.println("It is a Palindrome number");
            }
        else {
            while (!isPalindrome(num)) {
                System.out.println("It is not a Palindrome number \nPlease try another number : ");
                num = sc.nextInt();
            }
            System.out.println("It is a Palindrome number");
        }
    }
}

