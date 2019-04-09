package homework_06_04_2019;

import java.util.Scanner;

//Write a Java program that takes the user to provide a single character from the
// alphabet. Print Vowel of Consonant, depending on the user input. If the user input
// Is not a letter (between a and z or A and Z), or is a string of length > 1, print an  error message.
// For eg:    Input an alphabet: p   Expected Output:   Input letter is Consonant

public class VowelOrConsonant_3 {
    public static void main(String[] args) {
        String a;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an alphabet : ");
        a = scan.next();
        a = a.toLowerCase();

        if (a.length()>1){
            System.out.println("Invalid Input");
        }
        if(a.contains("a")||a.contains("e")||a.contains("i")||a.contains("o")||a.contains("u")) {
            System.out.println("Input letter is Vowel");
            }
        else if (a.contains("b") || a.contains("c") || a.contains("d") || a.contains("f") || a.contains("g") || a.contains("h") ||
                 a.contains("j") || a.contains("k") || a.contains("l") || a.contains("m") || a.contains("n") || a.contains("p") ||
                 a.contains("q") || a.contains("r") || a.contains("s") || a.contains("t") || a.contains("v") || a.contains("w") ||
                 a.contains("x") || a.contains("y") || a.contains("z")) {
            System.out.println("Input letter is Consonant");
            }
        else{
            System.out.println("Input is not an alphabet");
        }
    }
}