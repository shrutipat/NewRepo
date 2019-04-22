package homework_13_04_2019;

import java.util.ArrayList;

public class IterateThroughArrayList_18 {

     /*Working as expected*/

    //18. Write a Java program to iterate through all elements in a array list.

    public static void main(String[] args) {

        ArrayList<String> animals = new ArrayList<>();
        animals.add("Tigar");
        animals.add("Lion");
        animals.add("Elephant");
        animals.add("Crocodile");
        animals.add("Zebra");
        animals.add("Giraffe");

        for(String ani : animals){
            System.out.println(ani);
        }
    }
}
