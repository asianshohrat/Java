package review;
import java.util.Scanner;
public class DecisionQuestion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Road Tested? : Y,N");
        String Roadtested = scanner.nextLine();
        if (Roadtested.equalsIgnoreCase("Y")) {
            System.out.println("Does milage High: Y,N");
            String Milage = scanner.nextLine();
            if (Milage.equalsIgnoreCase("Y")) {
                System.out.println("What is the age of car : recent / old");
                String Age = scanner.nextLine();
                if (Age.equalsIgnoreCase("recent")) {
                    System.out.println("buy");
                } else
                    System.out.println("Dont buy");

            } else {
                System.out.println("buy");

            }
        } else {
            System.out.println("Dont Buy");
        }

    }
  }


