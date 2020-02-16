package firstproject;

public class WhileVsDoWhile {
    public static void main(String[] args) {
        do{
            System.out.println("We are in love with Java");
        }
        while (false);
        boolean sentinal=true;

        while (sentinal){
            System.out.println("Nooo");
            sentinal=false;
        }
    }
}
