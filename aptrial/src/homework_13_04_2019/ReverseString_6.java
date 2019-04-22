package homework_13_04_2019;

public class ReverseString_6 {

    /*This is not correct logic.
    * I want to reverse string Archita Patel is a strong team member
    * Answer is member team strong a is Patel Archita
    * Use scanner to take string and print reverse string*/

       //Reverse Given String

    public static void main(String[] args) {

        String str[] = {"Archita","Patel","is","a","strong","team member"};

        for (int i = str.length-1; i >= 0; i--) {
            System.out.println(str[i]);
        }
    }
}
