package homework_06_04_2019;

import java.util.Scanner;

public class ArrayContainsValue_18 {

    public static void main(String[] args)
    {
        int length, n;
        boolean ans=false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of Array : ");

        length=sc.nextInt();
        int num[]= new int[length];

        System.out.println("Enter "+length+" numbers");

        for(int i=0; i<length; i++){
            num[i]=sc.nextInt();
        }
        System.out.println("Which number you want to check? ");
        n=sc.nextInt();
        for(int i=0; i<length; i++){
            if(num[i]==n){
                ans=true;
            }
        }
        if(ans){
            System.out.println("Array contains your number");
        }
        else{
            System.out.println("Array does not contain your number");
        }
    }
}
