package homework_13_04_2019;

import java.util.ArrayList;
import java.util.List;

public class CreatNewArrayList_17 {
  //  Write a Java program to create a new array list, add some colours (string) and printout the collection.

    public static void main(String[] args) {

        List<String> colours = new ArrayList<String>();
        colours.add("Red");
        colours.add("Green");
        colours.add("Orange");
        colours.add("White");
        colours.add("Black");
        System.out.println("The Colours name : "+colours);
    }
}
