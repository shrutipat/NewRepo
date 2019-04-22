package homework_13_04_2019;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormats_25 {

     /*Working as expected*/

    //Write a Java program to display the dates in the following formats.

    public static void main(String[] args) {

        //Format the date

        SimpleDateFormat d = new SimpleDateFormat("MM-dd-yyyy");  // declare pattern here

        String date=d.format(new Date()); // using object of Date();

        System.out.println("\nMM-DD-YYYY : "+date);   // print

        Format d2 = new SimpleDateFormat("MM/dd/yy");    // declare pattern here
        String strDate = d2.format(new Date());  // using object of Date();

        System.out.println("MM/DD/YY : "+strDate);  // print

        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sf = new SimpleDateFormat("dd/MMM/yyyy"); // declare pattern here
        System.out.println("DD/MM/YYYY : "+sf.format(cal.getTime())); // using cal.getTime method

        SimpleDateFormat sf2 = new SimpleDateFormat("dd/MMM/yyyy hh:mm:ss"); // declare pattern here
        System.out.println("DD/MM/YYYY hh:mm:ss : "+sf2.format(cal.getTime())); // using cal.getTime method

    }

}
