package homework_13_04_2019;

import java.util.Scanner;

public class CheckPassword_14 {

    public static void main(String[] args) {

         /* Working as expected*/

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a Password: ");
        String password = input.next();
        if (isValid(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }


    //isValid method returns true if and only if password:
    // 1. have at least eight characters.
    // 2. consists of only letters and digits.
    // 3. must contain at least two digits.
    public static boolean isValid(String password) {
        if (password.length() < 8) {
            return false;
        } else {
            char c;
            int count = 1;
            for (int i = 0; i < password.length() - 1; i++) {
                c = password.charAt(i);
                if (!Character.isLetterOrDigit(c)) {
                    return false;   // no other character except letter or digit is allowed
                } else if (Character.isDigit(c)) {
                    count++;    // counting digits in password
                }
            }
            if (count < 2) {
            return false;   // return false if digits are less than 2 in pwd
            }
        }
        return true;
    }
}
