package homework_13_04_2019;

public class ReverseString_6 {

    //Reverse Given String

    public static void main(String[] args) {

        String str[] = {"Archita","Patel","is","a","strong","team member"};

        for (int i = str.length-1; i >= 0; i--) {
            System.out.println(str[i]);
        }
    }
}
