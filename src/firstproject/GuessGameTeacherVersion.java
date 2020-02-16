
//We need to check this version so we will understand better

package firstproject;
import java.util.Scanner;
public class GuessGameTeacherVersion {
    public static void main(String[] args) {
           int numberToGuess = 23;
            //first time asking to user
            Scanner myScanner = new Scanner(System.in);
            int userGuess = 0;
            //Asking user until user guesses the number
            while (userGuess != numberToGuess) {
                System.out.print("Guess the number: ");
                userGuess = myScanner.nextInt();
                if (userGuess > numberToGuess) {
                    System.out.println("Number is larger");
                } else if (userGuess < numberToGuess) {
                    System.out.println("Number is smaller");
                } else {
                    System.out.println("Congrats...");
                }
            }
        }

}

