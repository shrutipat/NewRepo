package homework_13_04_2019;

import java.util.ArrayList;

public class RemoveArrayElement_10 {

    //Write a Java program to remove a specific element from an array.

    public static void main(String[] args)
    {
        ArrayList a =new ArrayList<Integer>();
        a.add(0,12);
        a.add(1,14);
        a.add(2,16);
        a.add(3,18);
        a.add(4,20);
        a.add(5,22);

        a.remove(4);
        System.out.println(a);
    }
}
