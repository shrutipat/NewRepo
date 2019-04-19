package homework_06_04_2019;

import java.util.Arrays;

public class NumericStringArray_14 {

     /*Working as expected*/

    public static void main(String[] args) {
        int a[] = {10, 8, 6, 4, 2};
        String b[] = {"Archita","Patel", "is","a strong", "team member"};
        Arrays.sort(a);

        for (int c = 0; c < a.length; c++) {
            System.out.println(a[c]);
        }
        Arrays.sort(b);

        for (int j = 0; j < b.length; j++) {
            System.out.println(b[j]);
        }
    }
}
