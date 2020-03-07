package review;

import java.util.Scanner;

import java.util.Scanner;
public class WhileWon {
    public static void main(String[] args) {
        String answer=" ";
        Scanner myScan = new Scanner(System.in);
        while(!answer.equalsIgnoreCase("you won")){
            System.out.print("Talk little bit: ");
            answer=myScan.nextLine();
            if(!answer.equalsIgnoreCase("you won")) {
                System.out.println(" You said  " + answer);
            }
        }
        System.out.println("I knew I will win!!!");
    }
}
