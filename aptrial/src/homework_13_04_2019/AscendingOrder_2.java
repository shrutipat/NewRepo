package homework_13_04_2019;

import java.util.Scanner;

//Sort out in ascending number

public class AscendingOrder_2 {

    public static void main(String[] args) {

        int count, temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Array : ");
        count = sc.nextInt();

        int num[] = new int[count];
        System.out.println("Enter "+count+" Numbers : ");
        for (int i = 0; i < count; i++) {
            num[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (num[i] > num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.print("Numbers in ascending order are : ");
        for (int i = 0; i < count - 1; i++) {
            System.out.print(num[i] + ", ");
        }
        System.out.print(num[count - 1]);
    }

}
