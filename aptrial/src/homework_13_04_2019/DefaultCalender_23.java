package homework_13_04_2019;

import java.time.LocalDateTime;

public class DefaultCalender_23 {

//    Write a Java program to get and display information (year, month, day, hour, minute) of a default calendar.

    public static void main(String[] args) {

        //Date date = new Date();
        //System.out.println(date.toString());

        LocalDateTime now = LocalDateTime.now();
        int year = now.getYear();
        int month = now.getMonthValue();
        int day = now.getDayOfMonth();
        int hour = now.getHour();
        int minute = now.getMinute();

        System.out.println("Year is "+year);
        System.out.println("Month is "+month);
        System.out.println("Day is "+day);
        System.out.println("Hour is "+hour);
        System.out.println("Minute is "+minute);

        /*
        Optional code:
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1; // Note: zero based!
        int day = now.get(Calendar.DAY_OF_MONTH);
        int hour = now.get(Calendar.HOUR_OF_DAY);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);
        int millis = now.get(Calendar.MILLISECOND);*/

    }
}
