package homework_06_04_2019;

import java.util.Scanner;

public class SumValuesOfArray_15 {
    public static void main(String[] args) {
        int length, total=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of Array : ");
        length=sc.nextInt();
        int num[]= new int[length];
        System.out.println("Enter "+length+" numbers");
        for(int i=0; i<length; i++){
            num[i]=sc.nextInt();
            total+=num[i];
        }
        System.out.println("Total of numbers is : "+total);
    }
}
