package homework_13_04_2019;

import java.util.ArrayList;

public class EmptyArrayList_21 {

     /*Working as expected*/

    //Write a Java program to empty an array list

    public static void main(String[] args) {
        //Empaty arraylist with the help of 2 pre-defined methods
        //.clear(;
        //.removeAll();
        // Also use string and integer type of variable

        ArrayList<Integer> num= new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);
        num.add(7);
        num.add(8);

        System.out.println("Arraylist before clear: " +num);
        //with use of .clear predefine method
        num.clear();
        System.out.println("Arraylist after clear: " +num);

        //another method to empty the array by useing removeAll predefine method
        ArrayList<String> text =new ArrayList<>();
        text.add("Plus");
        text.add("Minus");
        text.add("Division");

        System.out.println("Arraylist  before removeAll: "+text);
        text.removeAll(text);
        System.out.println("Arraylist after removeAll: " +text);
    }
}
