package firstproject;
import java.util.Scanner;
public class NumberGuessingGame23 {
    public static void main(String[] args) {
        int numberToGuess=23;
        Scanner myScanner= new Scanner(System.in);


        int userGuess=0;
        while (userGuess!=numberToGuess) {
    System.out.println("Guess the number : ");
    userGuess=myScanner.nextInt();
    if (userGuess > numberToGuess) {
        System.out.println("Number is larger");

    } else if (userGuess < numberToGuess) {
        System.out.println("number is smaller");

    } else {
        System.out.println("Correct");
    }
        }
    }
}