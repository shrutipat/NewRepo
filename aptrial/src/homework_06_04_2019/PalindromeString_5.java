package homework_06_04_2019;

import java.util.Scanner;

public class PalindromeString_5 {

        public static void main(String[] args)
        {
            //A Palindrome number is a number that remains the same
            // when its digits are reversed. Like 16461

            Scanner sc = new Scanner(System.in);
            System.out.println("\n Enter the String : ");
            String str = sc.nextLine();
            char ch=str.charAt(0);
            String reverse = "";

            for (int i=str.length()-1;i>=0;i--)
            {
                reverse =reverse+str.charAt(i);
            }
            System.out.println("The reverse is : " +reverse);
            if (str.equals(reverse))
            {
                System.out.println("The string is Palindrome");
            }else
            {
                System.out.println("The String is not Palindrome");
            }
        }
}
