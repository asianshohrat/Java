package review;

import java.util.Scanner;

public class Outputcheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Country="";
        do {
            System.out.println();
            System.out.print("Please enter your destination: ");
            Country = input.nextLine();
            gate(Country);
        }
        while (!Country.equalsIgnoreCase("exit"));
        System.out.println("Have a good day!!!");
    }
    public static void gate(String d){
        switch (d) {
            case "Europe":
                System.out.println("Please go to GATE A.");
                break;
            case "Africa":
                System.out.println("Please go to GATE B.");
                break;
            case "Asia":
                System.out.println("Please go to GATE C.");
                break;
            case "America":
                System.out.println("Please go to GATE D.");
                break;
            default:
                if (!d.equalsIgnoreCase("exit")){
                    System.out.println("Please enter a correct destination.");
                }
                break;
        }
    }
}