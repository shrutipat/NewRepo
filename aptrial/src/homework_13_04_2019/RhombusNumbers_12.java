package homework_13_04_2019;

import java.util.Scanner;

 // Write a Java program to display the number rhombus structure like below:

  /*       1
          212
         32123
        4321234
         32123
          212
           1
   */

public class RhombusNumbers_12 {
    public static void main(String[] args) {

         /*Working as expected*/

        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number:  ");
        int n = sc.nextInt();
        int count = 1;
        int no_of_spaces = 1;
        int start = 0;
        for (int i = 1; i < (n * 2); i++)
        {
            for (int spc = n - no_of_spaces; spc > 0; spc--)//
            {
                System.out.print(" ");
            }
            if (i < n)
            {
                start = i;          //for number
                no_of_spaces++;    //for spaces
            } else
            {
                start = n * 2 - i;   //for number
                no_of_spaces--;      //for space
            }
            for (int j = 0; j < count; j++)
            {
                System.out.print(start);
                if (j < count / 2)
                {
                    start--;
                } else
                {
                    start++;
                }
            }
            if (i < n)
            {
                count = count + 2;
            } else {
                count = count - 2;
            }
            System.out.println();
        }
    }
}
