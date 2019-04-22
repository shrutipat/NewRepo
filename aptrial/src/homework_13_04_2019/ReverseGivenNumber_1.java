package homework_13_04_2019;

import java.util.Scanner;

//  Reverse the given number.
//Work as expected

public class ReverseGivenNumber_1 {

    public static void main(String[] args) {
        int lastNumber, number, reverse = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        number = sc.nextInt();
        while(number!=0)
        {
            lastNumber = number % 10;
            reverse = reverse + lastNumber;
            reverse = reverse * 10;
            number /= 10;

            if(number<10) {
                reverse = reverse+number;
                break;
            }
        }
        sc.close();
        System.out.println("Reverse number is "+reverse);
    }
}
