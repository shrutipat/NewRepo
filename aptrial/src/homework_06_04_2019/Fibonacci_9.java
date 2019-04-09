package homework_06_04_2019;

import java.util.Scanner;

public class Fibonacci_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Number " );
        int no =sc.nextInt();

        int a=1,b=1,c;
        System.out.print(a +"  "+ b);
        no=no-2;
        for( int i=1;i<=no;i++)
        {
            c=a+b;
            System.out.print(" "+ c);
            a=b;
            b=c;
        }
    }
}
