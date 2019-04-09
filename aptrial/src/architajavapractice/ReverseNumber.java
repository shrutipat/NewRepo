package architajavapractice;
//
//Declare and initialize another variable to store the reverse of a number, for example reverse = 0.
//        Extract the last digit of the given number by performing the modulo division (remainder).
//        Store the last digit to some variable say lastDigit = num % 10.
//        Increase the place value of reverse by one.
//        To increase place value multiply the reverse variable by 10 e.g. reverse = reverse * 10.
//        Add lastDigit to reverse.
//        Since the last digit of the number is processed, remove the last digit of num. To remove the last digit divide number by 10.
//        Repeat steps until number is not equal to (or greater than) zero.
//        A while loop would be good for this coding exercise.
//        Tip: Be careful with negative numbers. They can also be palindrome numbers.
//        Tip: Be careful with reversing a number, you will need a parameter for comparing a reversed number with the starting number (parameter).
//        NOTE: The method isPalindrome needs to be defined as public static
//6

public class ReverseNumber {

//    public static reverse5(int number)
//    {
//        int unit = 0, ten = 0, hundred = 0, thousand = 0, tenthousand=0, reverse = 0;
//
//        if (number > 0 && number < 10) {
//            reverse = number;
//        } else if (number > 10 && number < 100) {        //check 2 digit number
//            unit = number % 10;
//            ten = number / 10;
//            reverse = (unit * 10) + (ten);
//
//        } else if (number > 100 && number < 1000) {      //check 3 digit number
//            ten = number % 100;
//            unit = ten % 10;
//            ten = ten / 10;
//            hundred = number / 100;
//            reverse = (unit * 100) + (ten * 10) + hundred;
//        } else if (number > 1000 && number < 10000) {     //check 4 digit number
//            unit = number % 10;
//            ten = number / 10;
//            ten = ten % 10;
//            hundred = number / 100;
//            hundred = hundred % 10;
//            thousand = number / 1000;
//            reverse = (unit * 1000) + (ten * 100) + (hundred * 10) + thousand;
//        } else if (number > 10000 && number < 100000) {   //check 5 digit number
//            unit = number % 10;
//            ten = number / 10;
//            ten = ten % 10;
//            hundred = number / 100;
//            hundred = hundred % 10;
//            thousand = number / 1000;
//            thousand = thousand % 10;
//            tenthousand = number / 10000;
//            reverse = (unit * 10000) + (ten * 1000) + (hundred * 100) + (thousand * 10) + tenthousand;
//        } else {
//            System.out.println("Number is too big! Please try again... ");
//        }
//    }

    public static void main(String[] args) {
        System.out.println(reverse(12345));
    }

    public static int reverse(int parameter) {
        int ans = 0;
        int x=parameter;

        while (x != 0) {
            int val = x % 10;
            int tmp = ans;
            ans = ans * 10 + val;
            if ((ans - val) / 10 != tmp) {
                return 0;
            }
            x /= 10;
        }

        return ans;
    }
}
