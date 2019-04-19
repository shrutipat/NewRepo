package homework_13_04_2019;

import java.util.Arrays;

//Write a program to compare two array and its elements are same or not?

public class CompareArrayElements_3 {

    public static void main(String[] args){

        int[] a1 = new int[]{1, 2, 3, 4};
        int[] a2 = new int[]{1, 2, 3, 4};
        int[] a3 = new int[]{4, 3, 2, 5,};

        System.out.println("Is a1 equals to a2 : " + Arrays.equals(a1, a2));
        System.out.println("Is a1 equals to a3 : " + Arrays.equals(a1, a3));
    }

}
