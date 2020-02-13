package firstproject;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        int numberToGuess=23;
        Scanner myScanner= new Scanner(System.in);
        System.out.println("Guess the number : ");
        int usereGuess=myScanner.nextInt();


        if (usereGuess > numberToGuess) {
            System.out.println("Number is larger");

        }
        else if(usereGuess<numberToGuess){
            System.out.println("number is smaller");

        }
        else {
            System.out.println("Correct");
        }
    }
}
