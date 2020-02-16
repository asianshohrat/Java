package firstproject;
import java.util.Scanner;
public class JavaTester {
    public static void main(String[] args) {


    int numberToGuess = 23;
    //first time asking to user
    Scanner myScanner = new Scanner(System.in);
       System.out.print("Guess the number: ");
  int userGuess = myScanner.nextInt();
//if the user Guess the number correctly first time
  if (userGuess==numberToGuess){
      System.out.println("Congrats...");
  }
  // the user does not guess correct number first time so continues guessing
  else if (userGuess > numberToGuess) {
      System.out.println("Number is larger");

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
  else if (userGuess < numberToGuess) {
      System.out.println("Number is smaller");

      //Asking user untill user guesses the number
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
}


