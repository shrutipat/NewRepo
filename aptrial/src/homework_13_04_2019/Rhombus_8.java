package homework_13_04_2019;

import java.util.Scanner;

public class Rhombus_8 {

    /*Working as expected*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the number : ");
        int alpha = sc.nextInt();
        int rom=1;
        int rom2=1;
        char a = 'A';

        for (int i=1; i<(alpha*2); i++){
            for(int space = alpha-rom2; space>0; space--){
                System.out.print(" ");
            }
            if(i<alpha){
                rom2++;
            }else {
                rom2--;
            }
            for(int l=0; l<rom; l++) {
                System.out.print(a);

                if (l < rom/2){
                    a++;
                }
                else{
                    a--;
                }
            }
            if(i<alpha){
                rom=rom+2;
            } else {
                rom=rom-2;
            }
            a='A';
            System.out.println();
        }
    }
}
