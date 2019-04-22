package homework_13_04_2019;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseElementsOfArrayList_20 {

    /*Working as expected*/

    //Write a Java program to reverse elements in a array list.
    public static void main(String[] args) {

        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("word 1");
        list_Strings.add("word 2");
        list_Strings.add("word 3");
        list_Strings.add("word 4");
        list_Strings.add("word 5");
        System.out.println("List before reversing :\n" + list_Strings);
        Collections.reverse(list_Strings);
        System.out.println("List after reversing :\n" + list_Strings);
    }
}
