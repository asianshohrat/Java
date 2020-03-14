package review;

public class GatesSwitchCase {
    public static void main(String[] args) {
        String destination ="AMERICA";
        destination = destination.toLowerCase();
        switch (destination){
            case "europe":
                System.out.println("To the Gate A");
                break;
            case "africa":
                System.out.println("To the Gate B");
                break;
            case "asia":
                System.out.println("To the Gate C");
                break;
            case "america":
                System.out.println("To the Gate D");
                break;
            default:
                System.out.println("Not a destination");
        }
    }
}
