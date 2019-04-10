package homework_06_04_2019;

import java.util.Scanner;

public class Armstrong_10 {

     /*Working as expected*/
    //xyz

    public static void main (String []args){
// A positive number is called armstrong number if
// it is equal to the sum of cubes of its digits
// for example 0, 1, 153, 370, 371, 407 etc.
//
        Scanner sc = new Scanner (System.in);
        System.out.println("\nEnter the number to check is it Armstrong or not? : ");
        int x = sc.nextInt();
        int length=(int)(Math.log10(x)+1);
        int arm=0,a,b;
        b=x;
        switch (length)
        {
            case 2:
                while(x>0)
                {
                    a= x%10;
                    x=x/10;
                    arm= arm+a*a;
                }
                break;
            case 3:
                while(x>0)
                {
                    a= x%10;
                    x=x/10;
                    arm= arm+a*a*a;
                }
                break;
            case 4:
                while(x>0)
                {
                    a= x%10;
                    x=x/10;
                    arm= arm+a*a*a*a;
                }
                break;
            case 5:
                while(x>0)
                {
                    a = x % 10;
                    x = x / 10;
                    arm = arm +a*a*a*a*a;
                }
                break;
            default:
                System.out.println("Error Number should be Between 2 to 5 digit");
        }

        if (arm ==b)
        {
            System.out.println( +b+ " is Armstrong Number ");
        }
        else
        {
            System.out.println(+b+ " is not Armstrong Number ");
        }
    }
}
