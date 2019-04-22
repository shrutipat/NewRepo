package homework_13_04_2019;

import java.util.ArrayList;
import java.util.Scanner;

public class RetriveArrayList_19 {

     /*Working as expected*/

    //Write a Java program to retrieve an element (at a specified index) from a given array list

    public static void main(String[] args) {

        ArrayList<String> singers = new ArrayList<>();
        //adding values
        singers.add("Lata Mangeshkar");
        singers.add("Jagjit Singh");
        singers.add("Kishore Kumar");
        singers.add("Shreya Ghoshal");
        singers.add("Asha Bhosle");
        singers.add("Arijit Singh");
        singers.add("Sonu Nigam");
        singers.add("Udit Narayan");

        Scanner scan = new Scanner(System.in);
        System.out.println(singers);
        System.out.println("Print the index number : ");
        int index = scan.nextInt();

        //retrieve the element using index number

        if (index < 8) {
            System.out.println("Singers name are : " +singers.get(index));
        }
        else {
            System.out.println("Out of range");
        }
    }
}
