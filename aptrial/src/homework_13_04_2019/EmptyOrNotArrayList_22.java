package homework_13_04_2019;

import java.util.ArrayList;

public class EmptyOrNotArrayList_22 {

     /*Working as expected*/

    //Array Empty or not  by using predefine method  is Empty() which shows boolean ans false or true.

    public static void main(String[] args) {

        ArrayList<String> toys= new ArrayList<>();
        toys.add("Teddy");
        toys.add("Cars");
        toys.add("Puzzle");

        System.out.println("\nOriginal Arraylist: " +toys);
        //is Empty()
        System.out.println("Checking the above Arraylist is empty or not? " +toys.isEmpty());

        //removeAll()
        toys.removeAll(toys);
        System.out.println("Arraylist after remove all elements : " +toys);
        System.out.println("Checking above Arraylist is empty or not? " +toys.isEmpty());

    }
}
