package homework_13_04_2019;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayOfInteger_13 {

    // Write a Java program to reverse an array of integer values.

    public static void main(String[] args) {
        {

            ArrayList<Integer> a = new ArrayList<Integer>();
            a.add(10);
            a.add(13);
            a.add(18);
            a.add(21);
            a.add(29);
            System.out.println(a);
            Collections.reverse(a);
            System.out.println(a);
        }
    }
}
