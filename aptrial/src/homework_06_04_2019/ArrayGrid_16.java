package homework_06_04_2019;

public class ArrayGrid_16 {
    public static void main(String[] args) {

        /*Working as expected*/

        String arr[][] = new String[10][10];
        {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    arr[i][j] = "-";
                    System.out.print(arr[i][j] + " ");

                }
                System.out.println();
            }
        }

    }
}