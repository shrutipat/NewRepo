package homework_13_04_2019;

//Write a program to compare two strings?
public class CompareStrings_5 {
    public static void main(String[] args) {
        /*Working as expected*/

        //uppercase
        String str1 = "hello";
        //lowercase
        String str2 = "hello";

        System.out.println(str1.contentEquals(str2));       // compares if both strings are same?

        System.out.println(str1.equalsIgnoreCase(str2));    // compares but ignores case

        // below program compares length of strings and returns int value.
       /* String  s1 ,s2;
        Scanner scan= new Scanner(System.in); //scanner object
        System.out.println("Enter your First String :");
        s1=scan.nextLine();
        System.out.println("Enter your Second String :");
        s2=scan.nextLine();
        //compare 2 string
        if (s1.compareTo(s2) > 0)
            System.out.println("The first string is greater than second"); //first string long
        else if(s1.compareTo(s2) < 0)
            System.out.println("The first string is smaller than the second");// first string short
        else
            System.out.println("Both the strings are equal");
            */
    }

}
