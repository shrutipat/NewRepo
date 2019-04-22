package homework_13_04_2019;

public class RandomIntegers_24 {

     /*Working as expected*/

    //Write a Java program to generate random integers in a specific range.

    /*java.lang.Math class has a random method which generates a decimal value of type double
    which is greater than 0.0 and less than 1.0(0.9999), that is in the range 0.0(inclusive) to 1.0(exclusive).
    This value is different every time the method is invoked.
    In order to generate a number between 1 to 50, we multiply the value returned by random method by 50.
    This makes its range as 0.0 to 49.995. Now add 1 to it.
    This increases its range as 1.0 to 50.995. If this result is cast to an int, the range will be 1 to 50.
    Below program demonstrates this algorithm and shows the result for different executions.
*/
    public static void main(String[] args) {

        double randomDouble = Math.random();
        randomDouble = randomDouble * 50 + 1;
        int randomInt = (int) randomDouble;
        System.out.println(randomInt);
    }
}
